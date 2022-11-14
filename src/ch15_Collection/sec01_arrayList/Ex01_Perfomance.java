package ch15_Collection.sec01_arrayList;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Ex01_Perfomance {

	public static void main(String[] args) {

		// ArrayList와 LinkedList의 연산 속도 차이

		List<String> al = new ArrayList<>();
		List<String> ll = new LinkedList<>();

		// List앞에 추가하는 것은 ArrayList가 시간이 더 소요됨
		System.out.println("List 앞에 추가하는 경우");
		long startTime = System.nanoTime();
		for (int i = 0; i < 10000; i++)
			al.add(0, String.valueOf(i));
		long endTime = System.nanoTime();
		System.out.println("ArrayList 소요시간: " + (endTime - startTime) + " nano-sec");

		startTime = System.nanoTime();
		for (int i = 0; i < 10000; i++)
			ll.add(0, String.valueOf(i));
		endTime = System.nanoTime();
		System.out.println("LinkedList 소요시간: " + (endTime - startTime) + " nano-sec");

		System.out.println("\nList 뒤에 추가하는 경우");
		startTime = System.nanoTime();
		for (int i = 0; i < 10000; i++)
			al.add(String.valueOf(i));
		endTime = System.nanoTime();
		System.out.println("ArrayList 소요시간: " + (endTime - startTime) + " nano-sec");

		startTime = System.nanoTime();
		for (int i = 0; i < 10000; i++)
			ll.add(String.valueOf(i));
		endTime = System.nanoTime();
		System.out.println("LinkedList 소요시간: " + (endTime - startTime) + " nano-sec");
	}
}
