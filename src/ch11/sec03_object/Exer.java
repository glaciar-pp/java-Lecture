package ch11.sec03_object;

public class Exer {

	public static void main(String[] args) {


//import java.util.HashMap;
//
///**
// * 자바에선 식별을 위해 자바에서 만들어두는 정수값
// */
//
//public class Ex02_HashCodeMain {
//
//	public static void main(String[] args) {
//		// key 객체를 식별키로 사용해서 String값을 저장하는 hashMap객체를 생성
//
//		HashMap<Key, String> hashMap = new HashMap<>();
//
//		hashMap.put(new Key(1), "James");
//		hashMap.put(new Key(2), "Maria");
//
//		// Key class에서 hashCode method를 재정의하기 이전
//		System.out.println(new Key(1).hashCode() + ", " + new Key(1).hashCode());
//		String value = hashMap.get(new Key(1));
//		System.out.println(value);
//
//		// Key class에서 hashCode method를 재정의
//		System.out.println(new Key(1).hashCode() + ", " + new Key(1).hashCode());
//		value = hashMap.get(new Key(1));
//		System.out.println(value);
//		System.out.println(hashMap.get(new Key(2)));
//	}
//
//}
//
		
//		package ch11.sec03_object;
//
//		public class Key {
//			public int number;
//
//			Key(int number) {
//				super();
//				this.number = number;
//			}
//
//			@Override
//			public int hashCode() {
//				return number; // Objects.hashCode(number);
//			}
//
//			@Override
//			public boolean equals(Object obj) {
//				if (obj instanceof Key) {
//					Key compareKey = (Key) obj;
//					if (number == compareKey.number)
//						return true;
//				}
//				return false;
//			}
//		}
	}

}
