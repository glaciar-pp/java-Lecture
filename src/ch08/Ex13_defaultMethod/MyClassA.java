package ch08.Ex13_defaultMethod;

/**
 * 최초에 method1()을 만들고,
 * 나중에 method2()을 만들고 싶을 경우
 */

public class MyClassA implements MyInterface{

	@Override
	public void method1() {
		System.out.println("MyClassA method1()");
	}

}
