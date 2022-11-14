package ch05;

import java.util.Arrays;

public class Ex11_Array {

	public static void main(String[] args) {
		// 단순 방법
		int score1 = 80, score2 = 70, score3 = 95, score4 = 68, score5 = 85;
		int sum = score1 + score2 + score3 + score4 + score5;
		double avg = sum / 5.;
		System.out.println(avg);

		// 수가 늘어나도 힘들지 않게 쓸수 있는 방법!
		int[] score = { 80, 70, 95, 68, 85 };
		System.out.println(score[0]); // 첫번째 요소
		System.out.println(score[4]); // 마지막 요소
		sum = 0;
		for (int i = 0; i < score.length; i++)
			sum += score[i];
		System.out.println((double) sum / score.length);

		// 배열의 선언(왼쪽)과 생성(오른쪽)
		int[] intArray = new int[] { 1, 2, 3, 4, 5 }; // 기본
		double[] doubleArray = { 5.2, 2.3, 5.7, 9.2, 4.5 }; // 초기화 값을 {}로 제공
		String[] strArray = new String[5]; // 갯수만 정해서 배열을 생성

		int a;
		int[] b = new int[3];
//		System.out.println(a);		//초기화하지 않은 변수를 참조하므로 에러~
		System.out.println(b[0]);	// 배열은 기본값으로 초기화됨
		
		String s = "홍길동";
		System.out.println(s.length());
		// score.length s.length() 같이 정말 헷갈리는 것들은 개발도구의 도움을
		// 받아도 된다.언어를 2개 이상 다뤄보면 규칙이 다른게 있어서 숙련자도 헷갈리는 타이밍이 온다고 함.
		System.out.println(score.length);
		
		System.out.println(score);  //이렇게 하면 제대로 안찍힘
		System.out.println(Arrays.toString(score));

	}

}
