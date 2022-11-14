package ch15_Collection.sec01_arrayList;

import java.util.ArrayList;
import java.util.List;

public class Ex01_ArrayList {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();

		list.add("Java");
		list.add("JDBC");
		list.add("JSP/Servlet");
		// 기존 for문, 배열에서 필요한 경우 사용
		for (int i = 0; i < list.size(); i++)
			System.out.println(list.get(i));
		// enhanced for 문, 리스트는 이걸 주로 사용
		for (String str : list)
			System.out.println(str);
		System.out.println();

		list.add(2, "Database");
		list.add("iBATIS");			//add..append 정말 많이 사용하니 잊지말기
		for (String str : list)
			System.out.println(str);
		System.out.println();

		list.remove(2);
		list.remove(2);
		for (String str : list)
			System.out.println(str);
		System.out.println();

		for (String str : list)
			System.out.println(str + ": " + str.length()); // 글자 수 세줌
		System.out.println();

		list.removeIf(s -> s.length() > 5); // 5글자 초과 데이터 삭제한다는 내용
		for (String str : list)
			System.out.println(str);
		System.out.println();
		
		list.set(0, "Java-11");
		list.set(1, "JDBC 8.0");
		for (String str : list)
			System.out.println(str);
		System.out.println();
		
		System.out.println(list.isEmpty());			//비었는지 물어봄
		System.out.println(list.contains("Java-11"));		//들어있는지 물어봄
		System.out.println();
		
		list.clear();							//리스트 싹다 날림
		System.out.println(list.isEmpty());		//비었으니 true
		System.out.println(list.size());		//비었으니 0
	}

}
