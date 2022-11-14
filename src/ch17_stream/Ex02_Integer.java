package ch17_stream;

import java.util.Arrays;
import java.util.List;

public class Ex02_Integer {

	public static void main(String[] args) {
//		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7);
		List<Integer> list = Arrays.asList(1, 6, 3, 5, 4, 8, 2);

		list.stream()
		.filter(i -> i % 2 == 1) // 중간 스트림(=중간 처리), 여러개 사용가능
		.map(i -> i * i)
		.sorted()
		.forEach(i -> System.out.println(i)); //최종 처리는 한개만!! 사용가능
	}

}
