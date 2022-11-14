package ch13_generic_Q03;


public class Util {
	public static <K, V> Container<K, V> container(K t1, V t2) {
		Container<K, V> container = new Container<K, V>();
		container.set(t1, t2);
		return container;
	}
}
