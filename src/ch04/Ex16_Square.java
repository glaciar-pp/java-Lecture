package ch04;

/*
 * 10보다 큰 정수를 입력으로 받아 1부터 입력받은 숫자까지의
 * 제곱의 합과 합의 제곱을 구하세요.
 * 
 */
import java.util.Scanner;

public class Ex16_Square {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num;
		while (true) {
			System.out.print("10보다 큰 숫자를 입력하세요> ");
			num = scan.nextInt();
			if (num > 10)
				break;
			System.out.println("10보다 작은 숫자를 입력했습니다");
//do-while 문을 안가르쳐주니 이상하다고 생각할 수 있지만 지금은 이게 맞음!
//일단 while문 자체가 익숙해지는게 중요
			
		}
		scan.close();
		int sum = 0, sumOfSquare = 0;
		for (int i = 1; i <= num; i++) {
			sum += i; // 합
			sumOfSquare += i * i; // 제곱의 합
		}
		int squareOfSum = sum*sum;
		System.out.println("제곱의 합: "+sumOfSquare);
		System.out.println("합의 제곱: "+squareOfSum);
	}
}
