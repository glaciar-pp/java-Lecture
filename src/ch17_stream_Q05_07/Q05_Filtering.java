package ch17_stream_Q05_07;

import java.util.Arrays;
import java.util.List;

public class Q05_Filtering {

	public static void main(String[] args) {
		List<String> list = Arrays.asList(
				"This is a java book",
				"Lambda Expressions",
				"Java8 supports lambda expressions");

		// 정답 풀이
		boolean a = "This is a java book".toLowerCase().indexOf("java") >= 0; //존재여부 확인 가능
		System.out.println(a);
		list.stream()
		.filter(aa -> aa.toLowerCase().indexOf("java") >= 0)
//		.filter(aa -> aa.toLowerCase().contains("java"))		//contains보단 indexOf 추천
		.forEach(aa -> System.out.println(aa));

		
		
		// 내 풀이
		list.stream()
		.filter(j -> j.toLowerCase().contains("java"))
		.forEach(j -> System.out.println(j));

	}

}
