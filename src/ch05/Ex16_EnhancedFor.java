package ch05;

/**
 * 
 * 향상된 For(Enhanced-for)
 *
 */
public class Ex16_EnhancedFor {

	public static void main(String[] args) {
		String[] fruits = { "Apple", "Banana", "Cherry" };
		// C언어때부터 써오던 방식
		for (int i = 0; i < fruits.length; i++) {
			System.out.println(fruits[i]);
		}
		// 최근에 사용하는 방식
		for (String fruit : fruits) {
			System.out.println(fruit);
		}
		// 최근 방법으로 점수 평균내기
		int[] score = { 82, 78, 90, 84, 76 };
		int sum = 0;
		for (int element : score)
			sum += element;
		System.out.println((double) sum / score.length);

	}

}
