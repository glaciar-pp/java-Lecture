################################################################
#
#*데이터 조작 언어(DML: Data Manipulation Language)
#
################################################################
/*
C insert into
R Select
U update
D delete from
*/

/*
* 2. 수정(UPDATE)

UPDATE 테이블명
	SET 필드명=값[, 필드명=값, 필드명=값, ...]
	WHERE 조건;

*/

# yong-in 시의 이름을 용인으로 변경
# 경기도 용인 확인
SELECT * FROM city
	WHERE District='kyonggi'
# table 변경
    UPDATE city
	SET `name`='용인'
	WHERE ID = 2362
# 경기도 용인으로 바뀐 것을 확인
SELECT * FROM city
	WHERE District='kyonggi'

    # suwon 시의 이름을 수원으로 변경하고 인구도 100만으로 변경
# table 변경
UPDATE city
	SET `Name`='수원', Population = 1000000
	WHERE ID = 2340
# 경기도 수원으로 바뀐 것을 확인
SELECT * FROM city
	WHERE District='kyonggi';

# Kang-won의 이름을 강원도로 변경
UPDATE city SET District='강원도'
	WHERE District='Kang-won';
# 강원도로 바뀐 것을 확인
SELECT * FROM city	
	WHERE District='강원도';

/*
* 3. 생성(INSERT)

INSERT INTO 테이블명(필드명)
	VALUES(필드값);

*/
# 강원도 속초시 추가

INSERT INTO city (`Name`, countryCode, District, Population)
VALUES('속초', 'KOR', '강원도', 100000);
# 이렇게 기재해도 가능함
INSERT INTO city
VALUES(DEFAULT, '속초', 'KOR', '강원도', 100000);

# 여러건의 데이터 입력
# 경기도에 화성시와 의정부시를 추가   
INSERT INTO city
VALUES(DEFAULT, '화성', 'KOR', 'kyonggi', 500000),
(DEFAULT, '의정부', 'KOR', 'kyonggi', 300000);
# 추가되었는지 확인
SELECT * FROM city	WHERE District='Kyonggi';

# 대량 데이터 삽입
# 국내 도시만으로된 새로운 테이블을 생성하고 기존 테이블의 데이터로 채우기   
CREATE TABLE if NOT EXISTS KoreanCity LIKE city;
INSERT INTO koreanCity
	SELECT * FROM city	WHERE countryCode ='KOR';
# 생성한 테이블 확인
SELECT * FROM KoreanCity;

/*
4. 삭제(DELETE)

DELETE FROM 테이블명
	WHERE 조건

*/
# ID = 4083인 레코드 삭제 
DELETE FROM city WHERE ID = 4083;

# 4018 <= ID <= 4083인 레코드 삭제 (ID 범위 삭제)
DELETE FROM Koreancity 
	WHERE ID >= 4081 AND ID <= 4083;
# 삭제되었는지 확인
SELECT * FROM KoreanCity;

# 인구수가 10만 미만인 도시를 삭제
DELETE FROM koreanCity
	WHERE Population < 100000;