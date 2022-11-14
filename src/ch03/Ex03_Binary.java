package ch03;

public class Ex03_Binary {

	public static void main(String[] args) {
		int a = 2000000000;  //int는 범위 약 20억
		int b = a * 2;  //int 표시 범위를 벗어나게 됨
		System.out.println(b);  //에러 표시만 없지 이상한 값이 출력되버림
		System.out.println(b);
		System.out.printf("%d, %d%n", Integer.MAX_VALUE, Integer.MIN_VALUE);
		System.out.println(safeadd(a, a));  //범위를 벗어나므로 에러
		System.out.println(safeadd(a, 100000000));  //가동 가능
		
		int c =3, d =4;
		int res1 = c / d; // 0.75인데 int이다보니 정수라 0으로 처리되버림
		System.out.println(res1);
		double res2 = c / d;
		System.out.println(res2); // 이것도 정수로 해서 0 처리 된거라 0.0으로 처리
		double res3 = c / (double)d; //둘 중 한 숫자를 double 처리해서 실수로 바꿔주면 됨
		System.out.println(res3); // 그러면 원하던 0.75 값이 나옴, 올바른 결과
		System.out.println(4 / 3.);  //숫자 뒤에 점을 찍어 소숫점을 만들어주기도 함..
		
		System.out.println(Double.NaN);  // 0.0/0.0, 부정
		System.out.println(Double.POSITIVE_INFINITY);  // 3.0/0.0 불능
		System.out.println(3. / 0.);  // 계산 제대로 안됨
/*		try {
		} catch (Exception e) {
			System.out.println(3. / 0.);  
			System.out.println("오버플로우 발생");
		}*/  //이건 원래 윗 계산이 아예 안될때 쓰던 식인데 10장에서 배운다고 함
		
		// 비교 연산자
		System.out.println(3 == 3);
		// 실수 비교
		System.out.println(3.0 == 3.0); //실수연산에서 같으냐를 비교하는건 위험함
//		System.out.println(3.0 == 1.2 + 3.3 - 1.5); //이것도 계산은 되는데 정확한 표현을 못하는데 이런 계산은 위험
//		System.out.println((3.0 - 1.2 + 3.3 - 1.5) < 1e-15);  //차이의 절대값이 1e-15보다 작은지? 같은 식은 가능
		System.out.println(Math.abs(3.0 - (1.2 + 3.3 - 1.5)) < 1e-15);  // 이게 좋은 식
		
		// 문자열 비교 - 문자열은 참조형
		String str1 = "홍길동"; //리터럴로 문자열 할당(Heap memory)
		String str2 = "홍길동";
		String str3 = new String("홍길동");  // 문자열 객체를 만들어서 할당(Stack memory)
		System.out.println(str1 + str2 + str3);
		System.out.println(str1 == str2);  //동일한 곳에 리터럴로 저장되어있어 true 출력
		System.out.println(str1 == str3);  //다른 곳에 다른 형태로 저장되어있어 false 출력
		// 근데 이건 String을 비교하는 정확한 방식이 아님
		System.out.println(str1.equals(str3)); // 해당 .equals 적용하는게 올바른 비교방법
		
		
	}
	private static int safeadd(int x, int y) {  //method, 다른 언어에서는 함수
//      if (y > Integer.MAX_VALUE - x)
		if (x > 0 && y > 0 && y > Integer.MAX_VALUE - x)
		return 0;
		if (x < 0 && y < 0 && y < Integer.MAX_VALUE - x)
			return 0;
		return x + y;
	}

}
