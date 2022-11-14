package ch13_generic_sec04_method;

public class MainBox {

	public static void main(String[] args) {
		Box<Integer> box1 = Util.<Integer>boxing(100);
		int intValue = box1.get();
		System.out.println(intValue);

		Box<String> box2 = Util.boxing("홍길동");
		// 위에 Int로 선언했음에도 에러가 안나는건 컴파일러가 <String>으로 추정했기 때문
		String strValue = box2.get();
		System.out.println(strValue);
	}

}
