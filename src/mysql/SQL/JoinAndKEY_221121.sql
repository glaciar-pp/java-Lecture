################################################################
#
#*테이블 키 및 관계 / 실습
#
################################################################

# 과정 요약 
- Eclipse - ERMaster 설치
-> Table - girlGroup 및 hitSong 테이블 작성(해당 과정에서 PRIMARY KEY와 FOREIGN KEY 사용)
-> 내보내기 - DDL 선택 - 저장
-> SQL 프로그램에서 불러오기
-> DAO, DTO작성을 통해 목록보기, 정보 보기, 입력, 업데이트, 삭제가 가능하도록 만들어줌

1.1 1:N 관계 
# ERD -> DDL 내보내기로 만든 Tables(girlGroup, hitSong)
SET SESSION FOREIGN_KEY_CHECKS=0;

/* Drop Tables */
DROP TABLE IF EXISTS hitSong;
DROP TABLE IF EXISTS girlGroup;

/* Create Tables */
CREATE TABLE girlGroup
(
	gid int NOT NULL AUTO_INCREMENT,
	gname varchar(20) NOT NULL,
	company varchar(20) NOT NULL,
	debut date,
	PRIMARY KEY (gid)
);

CREATE TABLE hitSong
(
	sid int NOT NULL AUTO_INCREMENT,
	sname varchar(20) NOT NULL,
	composer varchar(20),
	writer varchar(20),
	gid int NOT NULL,
	PRIMARY KEY (sid)
);

/* Create Foreign Keys */
ALTER TABLE hitSong
	ADD FOREIGN KEY (gid)
	REFERENCES girlGroup (gid)
	ON UPDATE RESTRICT
	ON DELETE RESTRICT
;

# New Jeans의 히트곡 명은?
SELECT r.gname, l.sname FROM hitSong AS l
	JOIN girlgroup AS r
	ON l.gid = r.gid
	WHERE r.gname = 'New Jeans';

# 2018년도 데뷔 걸그룹의 히트곡 명은?(걸그룹명, 곡명, 데뷔일)
SELECT r.gname, l.sname, r.debut FROM hitSong AS l
	JOIN girlgroup AS r
	ON l.gid = r.gid
	WHERE r.debut BETWEEN DATE('2018-01-01') AND DATE('2018-12-31');

	---
# 게시판 만들기
1.2 기존 컬럼을 사용한 관계
	Users 테이블 생성
	board 테이블 생성
	reply 테이블 생성
	-- users가 우선되는 이유는 다른 두 테이블의 부모 테이블이 되는 존재기 때문
	board - users (기존컬럼을 사용한 관계, 1.n 또는 0.n)
	reply - board, users (1.n 또는 0.n)
	-- 다중성을 0.n 으로 설정하면 옵션이 변경되고 삼발 위에 검은 동그라미가 표시됨

# ERD -> DDL 내보내기로 만든 Tables(Users, board, reply)
SET SESSION FOREIGN_KEY_CHECKS=0;

/* Drop Tables */
DROP TABLE IF EXISTS reply;
DROP TABLE IF EXISTS board;
DROP TABLE IF EXISTS users;

/* Create Tables */
CREATE TABLE board
(
	bid int NOT NULL AUTO_INCREMENT,
	btitle varchar(100) NOT NULL,
	bcontent varchar(4096),
	uid varchar(12) NOT NULL,
	modTime datetime DEFAULT CURRENT_TIMESTAMP NOT NULL,
	viewCount int DEFAULT 0 NOT NULL,
	replyCount int DEFAULT 0 NOT NULL,
	PRIMARY KEY (bid)
);

CREATE TABLE reply
(
	rid int NOT NULL AUTO_INCREMENT,
	rcontent varchar(256) NOT NULL,
	regTime datetime DEFAULT CURRENT_TIMESTAMP NOT NULL,
	isMine int DEFAULT 0 NOT NULL,
	uid varchar(12) NOT NULL,
	bid int NOT NULL,
	PRIMARY KEY (rid)
);

CREATE TABLE users
(
	uid varchar(12) NOT NULL,
	pwd char(60) NOT NULL,
	uname varchar(10) NOT NULL,
	email varchar(20),
	regDate date DEFAULT (CURRENT_DATE) NOT NULL,
	PRIMARY KEY (uid)
);

/* Create Foreign Keys */

ALTER TABLE reply
	ADD FOREIGN KEY (bid)
	REFERENCES board (bid)
	ON UPDATE RESTRICT
	ON DELETE RESTRICT
;

ALTER TABLE board
	ADD FOREIGN KEY (uid)
	REFERENCES users (uid)
	ON UPDATE RESTRICT
	ON DELETE RESTRICT
;

ALTER TABLE reply
	ADD FOREIGN KEY (uid)
	REFERENCES users (uid)
	ON UPDATE RESTRICT
	ON DELETE RESTRICT
;
# Users, board, reply DTO 및 DAO 작성
->board 와 reply DAO 작성은 오늘의 과제!

-- ERD에서 내보내기 할때...
	-- JAVA 파일로도 내보내기가 가능하고 손으로 작성했던 양식들을 작성해서 내보내줌
	-- -> 다만 직접 사용하기에는 좋지않아서 사용하진 않을예정, 그저 참고로 보기엔 나쁘지않음.

-- Library 설치 시...
	-- mysqlXXXX.jar 파일 다운로드 받아서 적용해주어야함
	-- 적용해야 하는 프로젝트에서 우클릭 - Properties - Java Build Path에서 해당 라이브러리 적용
	-- -> 앞서 사용한 방법은 번거롭고 버전 관리에 어려움이 있음
	-- -> 나중에 Java-EE perspective - pom.xml, 즉 특정한 파일에 설치할 파일 이름만 적으면 됨!(Gradle, Maven 등)