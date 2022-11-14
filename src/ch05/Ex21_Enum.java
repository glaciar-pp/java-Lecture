package ch05;

import java.time.LocalDate;
import java.util.Arrays;

/**
 * 
 * 열거(Enumeration)타입
 *
 */
public class Ex21_Enum {
	public enum Week {MON, TUE, WED, THU, FRI, SAT, SUN};
	public static void main(String[] args) {
		Week today=Week.THU; //오늘을 기준으로 열거타입 보여주심
		//문자타입: String/메소드:name() /설명: 열거 객체의 문자열을 리턴
		System.out.println(today.name()); 
		System.out.println(today.ordinal());
		System.out.println(today.compareTo(Week.TUE)); // ordinal값, 3 - 1 된것
		System.out.println(today.compareTo(Week.SAT)); // ordinal값, 3 - 5 된것

		Week day= Week.valueOf("SAT");
		System.out.println(day.ordinal());
		
		System.out.println(Arrays.toString(Week.values()));
		
		LocalDate now= LocalDate.now();
		System.out.println(now);
		System.out.println(now.getDayOfWeek());
	}

}
