package ch05;

import java.util.Arrays;

public class Ex18_ChallengeSolution {

	public static void main(String[] args) {
		// Step 1. 두 개의 양의 정수를 아규먼트로 입력받아 각각 num1, num2 변수에 넣기
		if (args.length != 2) {
			System.out.println("사용법: 두개의 양의 정수를 입력하세요.");
			System.exit(1);
		}
		int num1 = Integer.parseInt(args[0]); //이것도 엄청쓰는 값이라 기억해야함
		int num2 = Integer.parseInt(args[1]);
		System.out.println("양의 정수 " + num1 + " & " + num2);

		// Step 2. 두 수중 작은 수만큼 for-loop를 돌면서 num1, num2로 나누어지는지 확인
		/*
		 * 1번 방법 int min = num2; if(num1 < num2) min = num1;
		 */
		// 2번 방법
		int min = (num1 < num2) ? num1 : num2; // 삼항연산자, 이걸쓰는게 라인 줄이고 바람직함
		for (int i = 1; i <= min; i++) {
			if (num1 % i == 0 && num2 % i == 0)
				System.out.println(i);
		}
		// Step 3. 찾은 수를 배열로 만들기
		// 1) 배열을 작은 수 만큼의 크기로 만든다.
		// 2) 스텝2에서 걸러진 공약수를 배열에 넣기
		// 3) 공약수의 갯수만큼 새로운 배열에 넣기
		int[]tmp = new int[min]; // temporary, 임시 라는 의미
		int index=0;
		for(int i = 1; i <=min; i++) { //(int i = 1; k=2; i <=min; i++; k++)같이 변수 추가도 가능함 
			if(num1 % i == 0 && num2 % i == 0)
				tmp[index++]=i;
		}
		System.out.println(index);
		System.out.println(Arrays.toString(tmp));
		
		int[] commonDivisors = Arrays.copyOf(tmp, index); //commonDivisors 공약수
		System.out.println(Arrays.toString(commonDivisors));
	}

}
