package ch15_Collection.sec04_HashMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Ex02_BoardHashMap {

	public static void main(String[] args) {
		Map<Integer, Board> map = new HashMap<>();

		// 자료구조 만들기
		for (int i = 1; i <= 5; i++)
			map.put(100 + i, new Board("제목" + i, "내용" + i, "글쓴이" + i));
		// 첫번째 방법, 요즘 트렌드
//		map.forEach((k, v) -> System.out.println(k + " : " + v));

		// 두번째 방법, 첫번째 방법을 못하겠을때
//		Set<Integer> keySet = map.keySet();
//		for(int key : keySet)
//			System.out.println(key+ " : "+map.get(key));

		// 세번째 방법, 그냥 한두번 부르고 말 변수일때
		for (int key : map.keySet())
			System.out.println(key + " : " + map.get(key));
		System.out.println();

		//객체 삭제
		map.remove(103);
		map.forEach((k, v) -> System.out.println(k+" : "+v));
	}

}
