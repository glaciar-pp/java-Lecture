################################################################
#
#*데이터 조작 언어(DML: Data Manipulation Language)
#
################################################################
# MySQL은 대소문자 구분 안함, 키워드만 대문자

/*
 1.Select
*/
USE world;      # 사용할 데이터베이스 선택
SHOW TABLES;    # 현 데이터베이스에 있는 테이블 조회
DESC city; 		# city 테이블의 구조 보기

/* 주요 사용 명령어
SELECT 필드명

FROM 테이블명
JOIN 테이블명
ON 조인 조건
WHERE 조건

GROUP BY 필드명
HAVING 그룹 조건

ORDER BY 필드명 순서
LIMIT 숫자 OFFSET 숫자;
*/

*/
SELECT * FROM city;   # city테이블에 있는 내용을 전부 가져오기
SELECT `Name`, population FROM city;  # 조건부 내용 가져오기
SELECT NOW(); # 함수 사용가능

/*
1.1 조회 조건
*/
SELECT * FROM city WHERE countrycode='KOR';   # '국내의 도시' 조건부 검색
SELECT `Name`, District, Population FROM city WHERE countrycode='KOR'; # 더 상세한 조건부 검색
SELECT `Name`, District, Population FROM city 
	WHERE countrycode='KOR' AND Population > 1000000; # 특정 조건-인구 조건부 조회
# AND OR 사용 가능

SELECT DISTINCT	district FROM city # DISTINCT - 고유한
WHERE countrycode='KOR'; # 대한민국 광역시도명

# 수도권(서울, 인천, 경기)도시 표시하기
SELECT * FROM city 
	WHERE countrycode='KOR' AND
	District='Seoul' OR District='Inchon' OR District='Kyonggi';
# WHERE 에서 국가 생략해도 나옴
SELECT * FROM city 
	WHERE District='Seoul' 
	OR District='Inchon' OR District='Kyonggi';

#이렇게 해도 가능함
SELECT * FROM city 
	WHERE District IN('Seoul', 'Inchon', 'Kyonggi');

# 국내의 인구수 100만 이상인 도시중 인구수가 홀수인 도시
SELECT * FROM city 
	WHERE countrycode='KOR'
	AND Population >= 1000000 
	AND	Population % 2 = 1;

# 국내의 인구수 50만~100만 도시
SELECT * FROM city 
	WHERE countrycode='KOR'
	AND Population >= 500000 AND Population <= 1000000;

# 국내의 인구수 50만~100만 도시, 다른방법
SELECT * FROM city 
	WHERE countrycode='KOR'
	AND Population between 500000 AND 1000000; #between사용

#충청남북도의 도시
SELECT * FROM city
	WHERE  countrycode='KOR'
	AND District LIKE 'Chungchong%' #와일드카드 LIKE와 % 사용

/*
* 1.2 순서
*/
#전 세계에서 인구가 800만 이상인 도시를 내림차순으로 조회
SELECT * FROM city
	WHERE  Population >= 8000000
	ORDER BY Population DESC; #Descending

#국내에서 100만 이상인 도시를 내림차순으로 조회
SELECT * FROM city
	WHERE  Population >= 1000000 AND countrycode='KOR'
	ORDER BY Population DESC; #Descending

#국내에서 50만 이상인 도시를 광역시도 오름차순, 인구수 내림차순으로 조회
SELECT * FROM city
	WHERE  Population >= 500000 AND countrycode='KOR'
	ORDER BY District, Population DESC; # ASC(Ascending)은 생략 가능

	/* 
	* 1.3 갯수 
	*/
#전 세계 인구수 Top 10
SELECT * FROM city
	ORDER BY  Population DESC
	LIMIT 10;

#국내 인구수 Top 5 도시
SELECT * FROM city
	WHERE countrycode='KOR'
	ORDER BY  Population DESC
	LIMIT 5;

#국내 인구수 11~20위 도시
SELECT * FROM city
	WHERE countrycode='KOR'
	ORDER BY  Population DESC
	LIMIT 10 OFFSET 10; 
	# OFFSET: 뒤에 적힌 숫자만큼 건너 뛰는 기능 
	# 즉 현재 조건에서는 앞에서 10개를 건너뛰고, 10개를 선택

/*
* 1.4 함수
*/
#국내 도시의 갯수
SELECT COUNT(*) FROM city
	WHERE countrycode='KOR';

#국내 도시의 평균 인구수
SELECT AVG(Population) FROM city
	WHERE countrycode='KOR';

#국내 도시의 평균 인구수-소숫점 처리
SELECT ROUND(AVG(Population)) FROM city # 소숫점 처리
	WHERE countrycode='KOR';

#국내 도시의 평균 인구수-Aliasing 사용
SELECT ROUND(AVG(Population)) AS avgPopulation FROM city  # AS(Aliasing) 사용
	WHERE countrycode='KOR';

#국내 도시의 최대/최소 인구수
SELECT MAX(Population), MIN(Population) FROM city
	WHERE countrycode='KOR';

/* 
* 1.5 그룹
 */
#경기도의 도시 이름
SELECT GROUP_CONCAT(`Name`) FROM city
	WHERE District = 'kyonggi';

#경기도의 광역시도 이름
SELECT GROUP_CONCAT(District) FROM city
	WHERE countrycode='KOR';

#국내 광역시도의 인구수 합계를 내림차순으로 정렬
SELECT District, SUM(Population) FROM city
	WHERE countrycode='KOR'
	GROUP BY District
	ORDER BY SUM(Population) DESC;

#도시의 갯수가 많은 나라 Top 10
SELECT CountryCode, COUNT(*) FROM city
GROUP BY CountryCode
ORDER BY COUNT(*) DESC
LIMIT 10;

/*
* 1.6 그룹의 조건
*/

#국내 도시의 갯수가 5개 이상인 도의 인구수 평균
SELECT District, ROUND(AVG(Population)), COUNT(*) FROM city
WHERE countrycode='KOR'
GROUP BY District
HAVING COUNT(*) >=5;

#국내 도시의 갯수가 5개 이상인 도의 인구수 평균을 인구수 평균의 내림차순으로 정렬
SELECT District, ROUND(AVG(Population)), COUNT(*) FROM city
WHERE countrycode='KOR'
GROUP BY District
HAVING COUNT(*) >=5
ORDER BY AVG(Population) DESC;

#국내 도시의 갯수가 100개 이상인 국가의 인구수 평균을 인구수 평균의 내림차순으로 정렬
SELECT CountryCode, ROUND(AVG(Population)), COUNT(*) FROM city
GROUP BY CountryCode
HAVING COUNT(*) >=100
ORDER BY AVG(Population) DESC;

SELECT * FROM country LIMIT 5;

# 대륙별 면적, 평균 GNP, 국가의 숫자를 면적 내림차순으로 정렬
SELECT Continent, SUM(SurfaceArea), ROUND(AVG(GNP)), COUNT(`Name`)
From country
GROUP BY continent
ORDER BY SUM(SurfaceArea) DESC;

/* 
* 1.7 Join 
*/
#도시의 갯수가 많은 나라 Top 10( Join활용)
SELECT country.Name, city.CountryCode COUNT(city.Name) FROM city
	JOIN country #inner 생략됨
	ON city.CountryCode = country.Code
	GROUP BY city.CountryCode
	ORDER BY COUNT(city.Name) DESC
	LIMIT 10;

#인구가 많은 도시 Top10의 국가명, 도시명, 인수 구하기
SELECT r.Name AS country, l.Name AS city, l.Population FROM city AS l
	JOIN country AS r
	ON l.CountryCode = r.Code
	ORDER BY l.Population DESC
	LIMIT 10;

#아시아 대륙에서 인구가 가장 많은 도시 10개를 내림차순으로 정렬
#	(대륙명, 국가명, 도시명, 인구수)
SELECT r.Continent, r.Name AS `country`, l.Name AS `city`, l.Population
	FROM city AS l
	JOIN country AS r
	ON l.CountryCode = r.Code
	WHERE r.Continent= 'Asia'
	ORDER BY l.Population DESC
	LIMIT 10;


# 우리나라의 공식 언어는?
SELECT `Language`, CountryCode FROM countrylanguage
	WHERE countryCode = 'KOR'
	AND IsOfficial = TRUE;

# 아시아 국가의 국가명과 공식언어
SELECT l.Name AS `Country`, r.`Language` FROM country AS l
	JOIN countrylanguage AS r
	ON l.Code = r.CountryCode
	WHERE l.Continent = 'Asia'
	AND r.IsOfficial = TRUE;

# 전 세계에서 인구가 가장 많은 10개 도시에서 사용하는 공식언어는?
# (도시명, 인구수, 언어명)
SELECT l.`Name`, l.Population, r.`Language` FROM city AS l
	JOIN countrylanguage AS r
	ON l.CountryCode = r.CountryCode
	WHERE r.IsOfficial = TRUE
	ORDER BY l.Population DESC
	LIMIT 10;
/*
*1.8 Sub Query
*/
# 서브쿼리-서울보다 인구가 많은 도시
	SELECT * FROM city
	WHERE Population >
	(SELECT Population FROM city WHERE `Name`='Seoul');