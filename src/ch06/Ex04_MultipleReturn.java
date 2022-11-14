package ch06;

import java.util.Arrays;

/**
 * 
 * 반환값이 여러개인 경우
 *
 */
public class Ex04_MultipleReturn {

	public static void main(String[] args) {
		int[] intArray = { 43, 24, 46, 89, 3, 24, 90, 101 };
		printMinMax(intArray);
		int[] result=getMinMax(intArray);
		System.out.println(Arrays.toString(result));
	}

	static int[] getMinMax(int[] arr) {
		int min = arr[0], max = arr[0];
		for (int a : arr) {
			if (min > a)
				min = a;
			if (max < a)
				max = a;
		}
		int[] result = { min, max };
		return result;
	}

	private static void printMinMax(int[] arr) {
		// 두개를 넣고 하는게(정확히 이해못함)자바는 안됨..파이썬은 된다고함
		int min = arr[0], max = arr[0];
		for (int a : arr) {
			if (min > a)
				min = a;
			if (max < a)
				max = a;
		}
		System.out.println("최소값: " + min);
		System.out.println("최대값: " + max);
	}

}
