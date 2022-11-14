package practice_221104;

import java.util.Scanner;

/**
 * 23을 각자 남긴다고 하면 정수 나누기는 정수만 남으니 23/10으로 2를 남기고 모듈 연산으로 23%10하면 3이 남음 int a =
 * 0<= a <=99
 *
 */

public class Q02_PlusCycle {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("1~99사이의 정수 입력> ");
		int num = sc.nextInt();
		sc.close();

//		int originalNum = num;
//		int cycle = 0;
//		while (true) {
//			cycle++;
//			int digit10 = (num < 10) ? 0 : num / 10; // 10의 자릿수
//			int digit1 = num % 10;
//			num = digit1 * 10 + (digit10 + digit1) % 10;
//			System.out.println(num);
//			if (num == originalNum)
//				break;
//		}
//		System.out.println("해당 숫자의 반복 수는 "+cycle+"회 이다.");
		System.out.println("해당 숫자의 반복 수는 "+PlusCycle(num)+"회 이다.");
	}


	static int PlusCycle(int num) {
		int cycle = 0;
		int originalNum = num;
		while (true) {
			cycle++;
			int digit10 = (num < 10) ? 0 : num / 10; // 10의 자릿수
			int digit1 = num % 10;
			num = digit1 * 10 + (digit10 + digit1) % 10;
			System.out.println(num);
			if (num == originalNum)
				return cycle;

		}
	}
}