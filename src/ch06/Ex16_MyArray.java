package ch06;

import java.util.Arrays;

/**
 * [오늘의 과제]
 * MyArray클래스를 만드세요.
 * 1) 인스턴스 필드
 * :한 줄에 출력할 요소의 숫자
 * 
 * 2) 인스턴스 메소드
 * : double getAvg(int[])
 * : int getMin(int[])
 * : void printArray(int[])
 * : int getMax(int[])
 * : int getSumOfSquare(int[])
 * 
 * 3)생성자
 * : 인스턴스 필드를 초기화하는 생성자
 * 
 * - 이것을 이용하는 코드도 작성하세요.
 *
 */
public class Ex16_MyArray {
	public static void main(String[] args) {
		int[] intArray = { 3, 36, 73, 48, 52, 79, 56, 70, 51, 25 };
		
		System.out.println("========printArray========");
		printArray(intArray);
		System.out.println("==========================");
		System.out.println("배열의 평균값: " + getAvg(intArray));
		System.out.println("배열의 최소값: " + getMin(intArray));
		System.out.println("배열의 최대값: " + getMax(intArray));
		System.out.println("배열의 제곱의 합: " + getSumOfSquare(intArray));

	}

	static double getAvg(int[] intArray) {
		int sum = 0;
		for (int element : intArray)
			sum += element;
		return (double) sum / intArray.length;
	}

	static int getMin(int[] intArray) {
		int min = intArray[0];
		for (int element : intArray)
			if (min > element)
				min = element;
		return min;
	}

	static int getMax(int[] intArray) {
		int max = intArray[0];
		for (int element : intArray)
			if (max < element)
				max = element;
		return max;
	}

	static int getSumOfSquare(int[] intArray) {
		int sum = 0;
		int SumOfSquare = 0;
		for (int element : intArray) {
			sum += element;
			SumOfSquare += element * element;
		}
		return SumOfSquare;
	}

	static void printArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.printf("%5d", arr[i]);
			if ((i + 1) % 5 == 0 || (i + 1) == arr.length)
				System.out.println();
		}
		System.out.println();
	}
	
}
