package ch14_lambda;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

// 기본적인 Function 석 
public class Ex05_FunctionalMain {

	public static void main(String[] args) {
		Runnable r = () -> System.out.println("Runnable");

		// 입력은 있고 리턴값 없음..With args, No Return value
		Consumer<Integer> c = i -> System.out.println(i * i);
		// 입력은 없고 리턴값 있음..No args, With return value
		Supplier<Integer> s = () -> (int) (Math.random() * 6) + 1;
		// 입력도 있고 리턴값도 있음. With args, with return value
		Function<Integer, Integer> f = i -> i * i;
		// 입력도 있고 리턴값 불리안. With args, with return boolean, 정말 많이 쓰임.
		Predicate<Integer> p = x -> x % 2 == 1;

		r.run(); // - Runnable
		c.accept(5); // -Consumer
		System.out.println(s.get());// -Supplier
		System.out.println(f.apply(5)); // -Function
		System.out.println(p.test(3));// Predicate

		BiConsumer<Integer, Integer> bc = (x, y) -> System.out.println(x + y);
		bc.accept(3, 4);

		BiFunction<Integer, Integer, Double> bf = (x, y) -> Math.sqrt(x * x + y * y);
		System.out.println(bf.apply(3, 4));

		BiPredicate<Integer, Integer> bp = (x, y) -> x > y;
	}

}
