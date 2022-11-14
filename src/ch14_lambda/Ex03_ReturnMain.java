package ch14_lambda;

import java.util.function.BiFunction;

/**
 * 
 * With argument, With return value
 *
 */

public class Ex03_ReturnMain {

	public static void main(String[] args) {
		Ex03_MyfunctionalInterface fi;

		fi = (x, y) -> {
			int result = x + y;
			return result;
		};
		System.out.println(fi.method(3, 4));
		
		fi = (x, y) -> {
			return x + y;
		};
		System.out.println(fi.method(3, 4));

		fi = (x, y) -> x + y; // 이게 람다식 베스트, return을 붙이면 에러
		System.out.println(fi.method(3, 4));

//		fi = (x, y) -> sum(x + y);
//		System.out.println(fi.method(3, 4));

		// 기능 활용, 대상이 두개라서 Bi-가 붙은 기능 사용
		BiFunction<Integer, Integer, Integer> f = (x, y) -> x + y;
		System.out.println(f.apply(3, 4));
	}

	static int sum(int a, int b) {
		return a + b;

	}
}
