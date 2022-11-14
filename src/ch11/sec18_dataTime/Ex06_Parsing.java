package ch11.sec18_dataTime;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Ex06_Parsing {

	public static void main(String[] args) {
		LocalDate localDate = LocalDate.parse("2022-11-04");
		System.out.println(localDate);
		
		// 하이픈이 아닌 날짜형식을 맞추고자 할때
		DateTimeFormatter formatter=DateTimeFormatter.ofPattern("yyyy.MM.dd");
		localDate = LocalDate.parse("2022.11.04", formatter);
		System.out.println(localDate); // 결과 2022-11-04

		formatter=DateTimeFormatter.ofPattern("yyyy.MM.dd");
		localDate = LocalDate.parse("2022.11.04", formatter);
		System.out.println(localDate); // 결과 2022-11-04
	}

}
