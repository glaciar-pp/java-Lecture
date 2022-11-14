package ch17_stream;

import java.util.stream.IntStream;

public class Ex05_Range {
	public static int sum; // 메인 안에서 옮겨나옴, 0으로 초기화 되기 때문에 =0 안붙여도됨

	public static void main(String[] args) {
		IntStream stream = IntStream.range(1, 10); // [1, 10), 1~9로 10은 미포함
		stream.forEach(i -> System.out.println(i));
		System.out.println();

		stream = IntStream.rangeClosed(1, 10);
		stream.forEach(i -> System.out.println(i)); // [1, 10] 이건 10도 포함

		stream = IntStream.rangeClosed(1, 100);
		stream.forEach(i -> sum += i);
		System.out.println("총합: " + sum);

	}

}
