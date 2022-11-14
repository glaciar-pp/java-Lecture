package ch05;

/**
 * [오늘의 도전 과제]
 * 두개의 양의 정수를 커맨드 아규먼트로 입력 받아서
 * 공약수를 찾아서 배열에 넣어보세요.
 *커맨드 아규먼트+공약수 찾기+배열에 넣기
 */
// 예로 12, 20이 있을때 ->1,2,4->[1, 2, 4, 0, 0, 0, 0, 0, 0, 0, 0, 0](12만큼 만드는거니까1,2,4 빼고 나머지는 0)

import java.util.Arrays;

public class Ex18_Challenge {

	public static void main(String[] args) {
		// Step 1. 두 개의 양의 정수를 아규먼트로 입력받아 각각 num1, num2 변수에 넣기

		int num1 = Integer.parseInt(args[0]);
		int num2 = Integer.parseInt(args[1]);
		System.out.println("양의 정수 " + num1 + " & " + num2);
		// Step 2. 두 수중 작은 수만큼 for-loop를 돌면서 num1, num2로 나누어지는지 확인
		for (int i = 1; i <= num1; i++) {
			if (num1 % i == 0 && num2 % i == 0)
				System.out.println(num1 + "과" + num2 + "의 공약수는 " + i);
		}
		// Step 3. 찾은 수를 배열로 만들기
		// 1) 배열을 작은 수 만큼의 크기로 만든다.
		// 2) 스텝2에서 걸러진 공약수를 배열에 넣기
		// 3) 공약수의 갯수만큼 새로운 배열에 넣기

		int[] src = { 1, 2, 3, 6 };
		int[] dst = new int[num1];
		for (int i = 0; i < src.length; i++) {
			dst[i - 0] = src[i];
		}
		System.out.println(Arrays.toString(dst));
		System.out.println("배열의 길이는 " +dst.length + " 입니다.");

	}
}
