################################################################
#
#*테이블 키(복합 키) 및 관계(N:N) / 실습
#
################################################################

1. ERD - DDL 기능을 통해 product, orders,  cart 테이블 생성
-- users는 테이블 설정 및 관계 형성에 대해 배우고 생성은 안함
-- -> 기존 users 사용하기로함
SET SESSION FOREIGN_KEY_CHECKS=0;

/* Drop Tables */
DROP TABLE IF EXISTS cart;
DROP TABLE IF EXISTS orders;
DROP TABLE IF EXISTS product;
DROP TABLE IF EXISTS users;

/* Create Tables */
CREATE TABLE cart
(
	oid int NOT NULL,
	pid int NOT NULL,
	quantity int NOT NULL,
	UNIQUE (oid, pid)
);

CREATE TABLE orders
(
	oid int NOT NULL AUTO_INCREMENT,
	orderDate datetime DEFAULT CURRENT_TIMESTAMP NOT NULL,
	totalPrice int NOT NULL,
	uid varchar(12) NOT NULL,
	PRIMARY KEY (oid)
);

CREATE TABLE product
(
	pid int NOT NULL AUTO_INCREMENT,
	pname varchar(40) NOT NULL,
	cost int NOT NULL,
	price int DEFAULT 0 NOT NULL,
	PRIMARY KEY (pid)
);


CREATE TABLE users
(
	uid varchar(12) NOT NULL,
	uname varchar(10) NOT NULL,
	tel varchar(14) NOT NULL,
	addr varchar(80),
	PRIMARY KEY (uid)
);

/* Create Foreign Keys */
ALTER TABLE cart
	ADD FOREIGN KEY (oid)
	REFERENCES orders (oid)
	ON UPDATE RESTRICT
	ON DELETE RESTRICT
;

ALTER TABLE cart
	ADD FOREIGN KEY (pid)
	REFERENCES product (pid)
	ON UPDATE RESTRICT
	ON DELETE RESTRICT
;

ALTER TABLE orders
	ADD FOREIGN KEY (uid)
	REFERENCES users (uid)
	ON UPDATE RESTRICT
	ON DELETE RESTRICT
;
2. SQL 입력
# 전자제품 product 목록 생성
INSERT INTO product VALUES
(1001, '노트북', 800000, 1000000),
(1002, '모니터', 200000, 300000),
(1003, '무선마우스', 50000, 1000000),
(1004, '아이패드', 200000, 300000),
(1005, '헤드셋', 100000, 150000);

# 주문 정보 넣기
INSERT INTO orders VALUES
(101, DEFAULT, 0, 'admin'),
(102, DEFAULT, 0, 'james');

# 전자제품 카트에 담기
INSERT INTO cart VALUES
(101, 1001, 1),
(101, 1002, 5),
(102, 1003, 3),
(102, 1004, 2),
(102, 1005, 5);
-- 카트를 확인하면 주문이 담긴 것을 확인할 수 있음

# 음식 product 목록 추가
INSERT INTO product VALUES
	(2001, '삼겹살', 20000, 25000),
	(2002, '치킨', 18000, 22000),
	(2003,'만두', 9000, 12000),
	(2004, '아이스크림', 5000, 7000),
	(2005, '케이크', 30000, 50000);

# 추가인원 주문 정보 넣기
INSERT INTO orders VALUES
(103, DEFAULT, 0, 'maria'),
(104, DEFAULT, 0, 'kevin');

# Cart에 담긴 1001번 정보 보기
SELECT * FROM cart AS c
JOIN product AS p ON c.pid=p.pid
WHERE c.pid=1001;

# 주문이 들어가고 정보가 기재되는 것을 SQL 과 Eclipse에서 확인함