package ch04;

import java.util.Random;
import java.util.Scanner;

public class Ex05_FizzBuzz {

	public static void main(String[] args) {
		/* 3의 배수 - Fizz
		 * 5의 배수 - Buzz
		 * 3과 5의 배수 - FizzBuzz
		 * 아니면 숫자
		 * 
		 * 임의의 정수값을 생성
		 */
		Random ran = new Random();
		int number = ran.nextInt(100) +1; // 1~100까지의 임의의 정수값 생성

		System.out.print("1에서 100까지의 정수를 입력하세요.>");
		Scanner scan = new Scanner(System.in); //객체 생성
		int num = scan.nextInt();
		number = num;
		scan.close(); //이거까지 입력해주면 오류 사라지긴 하는데 잘 안닫고 쓴다고 함
		
		// 문제 풀이
		//		int score = number; 요건 틀렸음
       //		 String result; 요것도..필요 없음!
		    if (number % 3 == 0 && number % 5 == 0)
			    System.out.println(number + "은/는 FizzBuzz");
		else if (number % 3 == 0)
				System.out.println(number + "은/는 Fizz");
		else if (number % 5 == 0)
			    System.out.println(number + "은/는 Buzz");
		else
			System.out.println(number + "성립안됨");
		// 문제 풀이 끝
		
			

	}

}
