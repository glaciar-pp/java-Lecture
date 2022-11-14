package ch13_generic_Q04;

public class Util { 
	public static <K, V> V getValue(Pair<K, V> p, K k) { //첫번째 방법, 다형성 이용
		if (p.getKey().equals(k)) {
			return p.getValue();
		} else {
			return null;
		}
	}

//	public static <P extends pair<K, V>, K, V> V getValue(P p, K k) { //두번째 방법, Restricted 이용
//		if (p.getKey().equals(k)) {
//			return p.getValue();
//		} else {
//			return null;
//		}
//	}
}
