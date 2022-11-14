package ch13_generic_Q02;

public class Container<T> {
	private T t;

	public T get() {
		return t;
	}
	public void set(T t) {
		this.t = t;
	}
}
