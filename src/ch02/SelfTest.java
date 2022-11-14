package ch02;

public class SelfTest {

	public static void main(String[] args) {
		byte b = 127;
		short c =30000;
		int i = b; // 작은 수에서 큰수로 변환할때는 자동으로 변환된다.
		i = c;  //이것을 Promotion 이라고 한다.
		System.out.println(b);
		System.out.println(c);
		System.out.println(i);
		
		short s = (short)i; //큰수에서 작은 수로 변환할때는 강제..명시적으로 변환해야 한다.
		// 이것을 Casting 이라고 한다.
		long l = i;  // int -> long
		float f = l;  // long -> float
		double d = f; // float -> double
		System.out.println(s);
	}

}
