package ch15_Collection_Q07_10;

import java.util.HashSet;
import java.util.Set;

public class Q08_HashSet {

	public static void main(String[] args) {
		Set<Q08_Student> set = new HashSet<>();
		
		
		set.add(new Q08_Student(1, "홍길동"));
		set.add(new Q08_Student(2, "신용권"));
		set.add(new Q08_Student(1, "조민우"));
		
		System.out.println("저장된 객체 수: "+ set.size());
		for(Q08_Student s : set)
			System.out.println(s.studentNum + " : "+ s.name);
	}

}
