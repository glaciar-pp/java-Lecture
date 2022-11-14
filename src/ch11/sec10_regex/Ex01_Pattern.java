package ch11.sec10_regex;

import java.util.regex.Pattern;

public class Ex01_Pattern {

	public static void main(String[] args) {
		// 자바에서 역슬래시를 문자로서 쓰려면 두번 써주면 하나가 인식됨\\ 이렇게
		//핸드폰번호 정규표현식
		String regExp = "(010|02)-\\d{3,4}-\\d{4}";  //후반부에 지역번호도 추가해봄
		String data1 = "010-2345-6789";
		String data2 = "02-234-9876";		//지역번호로 변경
		boolean result1 = Pattern.matches(regExp, data1);
		boolean result2 = Pattern.matches(regExp, data2);
		System.out.println(result1+ ", "+result2);
		System.out.println();
		
		// 이메일 정규표현식
		regExp = "(\\w|\\.)+@\\w+\\.\\w+(\\.\\w+)?";
		data1 = "star224@naver.com";
		data2 = "star.224@naver.co.kr";
		result1 = Pattern.matches(regExp, data1);
		result2 = Pattern.matches(regExp, data2);
		System.out.println(result1+ ", "+result2);
		
		//비밀번호 정규표현식(강사님꺼 마저 볼것)
		regExp = "^";
				data1 = "star224@naver.com";
				data2 = "star.224@naver.co.kr";
				result1 = Pattern.matches(regExp, data1);
				result2 = Pattern.matches(regExp, data2);
				System.out.println(result1+ ", "+result2);

	}

}
