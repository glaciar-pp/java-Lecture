package ch13_generic_sec02_generic;

public class Box<T> {
private T t;

public T get() {
	return t;
}
public void set(T t) {
	this.t = t;
}
}
