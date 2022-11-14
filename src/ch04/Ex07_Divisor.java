package ch04;

import java.util.Scanner;

/*
 * 10보다 큰 정수를 입력으로 받아 약수(Divisor)를 찾아주는 프로그램을 작성하세요.
 * 
 */
public class Ex07_Divisor {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		int num; //while문 바깥에서 선언해서 쓰기 편하게 만들어주기
		while (true) {
			System.out.print("10보다 큰 숫자를 입력하세요> ");
			num = scan.nextInt();
			if (num > 10)
				break;
			System.out.println("10보다 작은 숫자를 입력했습니다");
		}
		
		scan.close();
		
		for(int i=1; i<=num; i++) {
		if(num % i == 0)
//			System.out.print(num+"약수 "+ i+", ");
			System.out.println(i);
		}
	}

}
