package ch04;

import java.util.Scanner;

public class Ex13_While {

	public static void main(String[] args) {
		// 몇번에 해당 조건이 끝날지 알수가 없을때 while 사용
		Scanner scan = new Scanner(System.in);
//  1번 방법
		int sum = 0;
		while (sum < 100) { // 특성상 0이 되면 루프를 하지 않기에 0이 성립되지않음
			System.out.print("정수 입력 > ");
			int num = scan.nextInt();
			sum += num;
		}
		System.out.println(sum);

		// 2번 방법, 주로 쓰임, 의도적으로 무한 루프를 만들고 탈출 조건을 루프 안에서 만들어 줌
		sum = 0;
		while (true) {
			System.out.print("정수 입력 > ");
			int num = scan.nextInt();
			sum += num;
			if (sum >= 100)
				break;
			scan.close();
		}
		System.out.println(sum);
		// do-while문은 거의 사용하지 않지만 그냥 while과 다르게 무조건 한번은 실행된다.
		// 하지만 그다지 쓸모가 없음...
	}

}
