################################################################
#
#*데이터 정의 언어(DML: Data Definition Language)
#
################################################################

/*
1. 테이블 생성
CREATE TABLE 테이블명 (
    필드명 데이터타입 [NOT NULL] [KEY] [DEFAULT 값] [Extra],
	필드명 데이터타입 [NOT NULL] [KEY] [DEFAULT 값] [Extra],
	...
) [Extra];
 *
 */

#주소록 테이블 생성
CREATE TABLE if NOT EXISTS addrBook(
	num INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
	`Name` VARCHAR(4) NOT NULL,
	tel VARCHAR(14) NOT NULL,
	birthday DATE
) AUTO_INCREMENT=101;
DESC addrBook;

#고객 테이블 생성
CREATE TABLE if NOT EXISTS customer(
	uid VARCHAR(10) PRIMARY KEY,
	pwd CHAR(44) NOT NULL,
	`Name` VARCHAR(4) NOT NULL,
	email VARCHAR(20),
	regDate DATE DEFAULT (CURRENT_DATE),
	isDeleted INT DEFAULT 0
);
DESC customer;

/*
* 2. 테이블 조회
*/
#데이터베이스 내의 테이블 목록
SHOW TABLES;

# 테이블 구조
DESC customer;


/*
3. 테이블 삭제(DROP)
*/
#테이블 삭제
DROP TABLE test;

#테이블 내의 내용을 모두 제거
TRUNCATE test;

/*
4. 테이블명 변경(RENAME)
*/
# KoreanCity -> KorCity 변경
RENAME TABLE KoreanCity TO KorCity

/*
5. 테이블 구조변경(ALTER)
*/
#customer 테이블에 tel 항목 추가
ALTER TABLE customer
ADD tel VARCHAR(14);
# 확인
DESC customer;

#customer 테이블에 tel 항목 삭제
ALTER TABLE customer
DROP tel;
# 확인
DESC customer;

#customer 테이블에 name 항목 다음에 tel 항목 추가
ALTER TABLE customer
ADD tel VARCHAR(14) AFTER `Name`;
# 확인
DESC customer;

#customer 테이블에 tel 항목에 not null 추가
ALTER TABLE customer
CHANGE tel  tel VARCHAR(14) NOT NULL;
# 확인
DESC customer;

/*
 6. View 생성
*/

# 인구 900만 이상인 도시로 largeCity뷰 생성
	
CREATE VIEW largeCity
	AS SELECT * FROM city WHERE Population >= 9000000
	WITH CHECK OPTION
	
# 인구 700만 이상인 도시로 largeCity뷰 생성
	
	CREATE VIEW largeCity
	AS SELECT * FROM city WHERE population >= 9000000
		AS SELECT * FROM city WHERE population >= 9000000
	
# 서울의 인구를 8900000으로 변경하면 에러가 발생(Check option 위배)
UPDATE largeCity SET Population=8900000 WHERE ID=2331;

# city 테이블에서 변경하면 largeCity에도 반영이 됨
UPDATE city SET Population=9900000 WHERE ID=2331;