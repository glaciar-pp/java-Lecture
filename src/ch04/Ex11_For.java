package ch04;

import java.util.Scanner;

public class Ex11_For {

	public static void main(String[] args) {
		//for 반복문은 정말 수업 끝날때까지 천번은 할 정도로 중요하고 많이함
		// 1에서 1000까지의 합
		int sum = 0;
		for (int i = 1; i <= 1000; i++)
			sum += i;
		System.out.println(sum);

		// 1에서 10까지 곱(factorial)
		int product = 1;
		for (int i = 1; i <= 10; i++)
			product *= i;
		System.out.println(product);

		// 사용자가 입력한 문자열을 5회 받아서 하나의 문자열로 만들기
		Scanner scan = new Scanner(System.in);
		String line = "";
		for (int i = 0; i < 5; i++) { // 5회 반복을 의미함
			System.out.println("입력하세요> ");
			String s = scan.nextLine();
			line += s + " ";
		} // 괄호가 없어서 한번에 5번 입력하세요 나오는 사람도 있었는데 아직 익숙하지 않을땐 괄호 왠만해서 넣는게 낫다고 한다.

		System.out.println(line);
		scan.close();
				
	}

}
