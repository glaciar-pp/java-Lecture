package ch13_generic_sec01_non_generic;

public class Main {

	public static void main(String[] args) {
		Box box = new Box();
		box.set("홍길동"); // 오브젝트로 설정했는데 문자타입을 넣게되면서 자동변환이 일어난다.
		String name= (String) box.get(); // 런 타입 변환형태

		//캐스팅..instanceof 특성상 에러 가능성이 높아지기 때문에 추천하지는 않는다..
//		String name = null;
//		if (box.get() instanceof String)
//		name= (String) box.get();  // 강제타입변환
		
		box.set(new Apple());
		Apple apple = (Apple) box.get();
	}

}
