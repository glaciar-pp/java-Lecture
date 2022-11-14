package ch11.sec07_string;
/**
 * 숫자값을 보려하지말고, 부호만 보는 것이 낫다.
 *
 */

public class Ex10_CompareTo {// compare 계열이 정말 많이 쓰임...

	public static void main(String[] args) {
		String str1 = "Apple";
		String str2 = "Cherry";
		String str3 = "air";
		
		System.out.println(str1.compareTo(str2));		// -2
		System.out.println(str1.compareToIgnoreCase(str3));  //7, 이그노어라 대소문자 구분 안함
		// 숫자가 다른 이유는 숫자가 ASCII code를 사용한다.
		// 대문자는 A 0x41, B 0x42....소문자는 0x61, 0x62...
		// 이게 7인 이유는 A는 같으니 다음자가 비교되었고 i와 p라서 7이 된것

		String han1 = "가나다";
		String han2 = "라마바";
		System.out.println(han1.compareTo(han2));
		System.out.println(str1.compareTo(han1));
	}

}
