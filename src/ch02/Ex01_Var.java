package ch02;

public class Ex01_Var { // 자바는 특이성 때문에 클래스에 Ex01_Var를 붙여준 것이라고 함

	public static void main(String[] args) {
		int score = 90; //초기값은 변수 선언과 동시에 값을 부여해주는 것이 가능하다. 그리고 지금 90이 리터럴
		int result = score * 2;
		
		/*Literal*/
		int intLiteral = 30; //정수형(integer)
		int octal = 036;  //8진수(octal)
		int hexa = 0x1E;  //16진수(hexadecimal)
		System.out.println(intLiteral);
		System.out.println(octal);
		System.out.println(hexa);
		System.out.printf("%d, %d, %d\n", intLiteral,octal,hexa); 
		// 다른언어는 여러가지 변수가 들어가지만, 자바는 조금 세팅 문제가 있어 내일로 보류함(10-24)
		// 10-25 오늘 컴파일 에러 인거 확인해서 .metadata 지우고 윈도우-프리퍼런스-컴파일러 가서 버전 고쳐줬음!
		// 그거랑 인스톨드 JRE 맞춰줌
		double doubleintLiteral = 3.14159; //실수형(floating point)
		char charLiteral = 'a'; //싱글형, 문자나 글자 1개(single quote)
		String strLiteral = "A quick brown fox"; //문자열
		boolean boolLiteral = true; //true or false
		
		if (result > 100) {
			int score1 = 30;
			System.out.println(score1);
		}
//		System.out.println(score1);  //score1 변수는 if block 밖에서는 사용할 수 없다.
		
	}

}
