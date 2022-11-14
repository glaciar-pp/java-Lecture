package ch01;
/*
 * 이렇게 블럭 단위로 많이 쓸땐 이런 주석 형태가
 * 적절합니다.
 */
public class HelloWorld {  //괄호 안 내용..Class(클래스는 대문자)

	public static void main(String[] args) {  //안 괄호(블럭)은 method(메소드는 특이 경우 제외하고 소문자)
		//void: 반환값 없음, main: 내용의 시작점
		// TODO Auto-generated method stub
		System.out.println("Hello World!!!");  //sysout+Ctrl+space(완성 도우미)
		System.out.println("안녕하세요?");  //ctrl+alt+위 또는 아래 화살표
		
		int x = 1;  //기억장소에 이 값을 저장하는것
		int y = x + 1;
		System.out.println("x = " + x + ", y = " + y);
	}

}
