package ch04;
/**
 * Scanner 연습
 * https://colossus-java-practice.tistory.com/26 참조
 * 
 */
import java.util.Scanner;

public class Ex11_For_test {

	public static void main(String[] args) {

		
	/*	Scanner scan = new Scanner(System.in);
		int a = 0;
		int b = 0;
		int c = 0;
		System.out.print("숫자 3개를 입력하세요. : ");
		a = scan.nextInt();
		b = scan.nextInt();
		c = scan.nextInt();

		scan.close();
		System.out.println(a + b + c); */

	for(int i = 1; i<=10; i++) {
		if(i %2 == 0)
			System.out.print("짝수");
		else
			System.out.print("홀수");} 
}
}