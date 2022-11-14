package ch15_Collection.sec06_TreeSet;

import java.util.NavigableSet;
import java.util.TreeSet;

public class Ex01_TreeSet {

	public static void main(String[] args) {
		TreeSet<Integer> scores = new TreeSet<>();

		int[] arr = { 87, 98, 75, 91, 36 };
		for (int score : arr)
			scores.add(score);
		for (int score : scores)
			System.out.println(score);
		System.out.println();

		// 특정 객체 가져오기
		System.out.println("가장 낮은 점수: " + scores.first());
		System.out.println("가장 높은 점수: " + scores.last());
		System.out.println("95점 아래 점수: " + scores.lower(95));
		System.out.println("95점 위 점수: " + scores.higher(95));
		System.out.println("95점이거나 바로 아래 점수: " + scores.floor(95));
		System.out.println("85점이거나 바로 위의 점수: " + scores.ceiling(85));

		// 내림차순으로 정렬
		NavigableSet<Integer> descendingScores = scores.descendingSet();
		for (int s : descendingScores)
			System.out.println(s);
		System.out.println("내림차순 첫번째: " + descendingScores.first());
		
		//범위 검색(80 <= score) 80이상
		NavigableSet<Integer> rangeSet = scores.tailSet(80, true); //뒤에있는 표시는 80을 포함시킬건지 묻는 것
		for(int s : rangeSet)
			System.out.println(s);
		System.out.println();
		
		//범위검색(80 <= score < 90), 80이상 90미만
		rangeSet = scores.subSet(80, true, 90, false);
		for(int s : rangeSet)
			System.out.println(s);
	}

}
