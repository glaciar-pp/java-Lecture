package ch17_stream;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Ex08_Boxed {
	public static void main(String[] args) {
		int[] intArray = { 1, 3, 4, 6, 7 };

		IntStream intStream = Arrays.stream(intArray);
		intStream
		.asDoubleStream()
		.forEach(d -> System.out.println(d));

		intStream = Arrays.stream(intArray);
		// 스트림으로 열면 다시 닫히기 때문에 다시 열어줌..1회용이기에 다시 만들어주어야함
		intStream
		.boxed()
		.forEach(obj -> System.out.println(obj.intValue()));

	}
}
