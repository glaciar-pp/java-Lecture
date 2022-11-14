package ch11.sec11_Arrays;

import java.util.Arrays;
import java.util.Comparator;

public class Ex03_PrimitiveSort {

	public static void main(String[] args) {
		int[] scores = {78, 89, 95, 65};
		Arrays.sort(scores);  		
		// 오름차순으로 정렬됨, 자바는 숫자 내림차순은 상대적으로 어렵다고 하심 Wrapper 클래스 필요
		System.out.println(Arrays.toString(scores));// 자기파괴적으로 scores가 바뀜
		
		String[] fruits = "감 귤 사과 딸기".split(" ");
		Arrays.sort(fruits);		//오름차순...즉 사전 순서
		System.out.println(Arrays.toString(fruits));
		
		Arrays.sort(fruits, Comparator.reverseOrder());		//내림차순.문자열은 가능!
		System.out.println(Arrays.toString(fruits));
		

	}

}
