package ch11.sec12_Wrapper;

import java.util.Arrays;
import java.util.Comparator;

public class Ex03_DescendingOrder {

	public static void main(String[] args) {
		Integer[] intArr = { 8, 19, 15, 23 }; // Wrapper 클래스로 바꿔줌

		Arrays.sort(intArr);
		System.out.println(Arrays.toString(intArr));

		Arrays.sort(intArr, Comparator.reverseOrder()); // 내림차순!
		System.out.println(Arrays.toString(intArr));

//Integer Array를 int array로 변경하는 것은 Stream을 통해서 하는 것이라 나중에 배움!

		//물론 for문을 써서 한다면야 지금도 가능함!
		int[] arr = new int[intArr.length];
		for (int i = 0; i < intArr.length; i++)
			arr[i] = intArr[i];
		System.out.println(Arrays.toString(arr));

	}
}
