package ch11.sec10_regex;

import java.util.Arrays;

public class Ex02_ReplaceAll {

	public static void main(String[] args) {
		String data = "나는 Java Programming이 좋아요!!!";
		
		//대문자 제거
		System.out.println(data.replaceAll("[A-Z]", ""));
		//소문자 제거
		System.out.println(data.replaceAll("[a-z]", ""));
		//한글과 공백만 남기고 모두 제거
		System.out.println(data.replaceAll("[^가-힣 ]", ""));
		
		data = System.getenv("JAVA_HOME");
		System.out.println(data);
		// 해당 부분에서 Pattern으로 \\ 두개 사용하다보니 총 네개 기재를 해야 인식한다.
		String[]arr = data.split("\\\\");
		System.out.println(Arrays.toString(arr));

	}

}
