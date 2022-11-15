package ch17_stream_Q05_07;

import java.util.Arrays;
import java.util.List;

public class Q06_avgAge {

	public static void main(String[] args) {
List<Q06_Member> list = Arrays.asList(
		new Q06_Member("홍길동", 30),
		new Q06_Member("신용권", 40),
		new Q06_Member("감자바", 26)
		);

		//정답 풀이
		double avg1 = list.stream()
				.mapToInt(a -> a.getAge())
//				.mapToInt(Q06_Member::getAge)	//이거보단 람다식 추천...
				.average()
				.getAsDouble();
		System.out.println("평균나이: " + avg1);

		// 내 풀이
		double avg2 = list.stream()
				.mapToInt(a -> a.getAge())
				.average()
				.getAsDouble();
		System.out.println(avg2);

	}

}