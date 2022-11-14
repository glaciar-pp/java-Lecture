package ch02;

public class Ex03_TypeConversion {

	public static void main(String[] args) {
		byte b = 20;
		short c =300;
		int i = b; // 작은 수에서 큰수로 변환할때는 자동으로 변환된다.
		i = c;  //이것을 Promotion 이라고 한다.
		
		short s = (short)i; //큰수에서 작은 수로 변환할때는 강제..명시적으로 변환해야 한다.
		// 이것을 Casting 이라고 한다.
		long l = i;  // int -> long
		float f = l;  // long -> float
		double d = f; // float -> double
		
		byte bb = (byte)s; // 실행할 때 에러 발생..별로 좋은 코드가 아님
/*		if(s >= -128 && s <= 127) {
			byte bb = (byte)s;
		} 이런 조건문으로 해줘야 함*/ 
		System.out.println(s);
		System.out.println(bb);
		
		i = b + s;
		d = f + l;
		String str = "str" + d;
		// byte -> short -> int -> long -> float -> double -> String
		// 반대로는 방법이 따로있음...
	}
}
