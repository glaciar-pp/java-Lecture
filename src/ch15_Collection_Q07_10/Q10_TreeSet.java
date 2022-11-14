package ch15_Collection_Q07_10;

import java.util.TreeSet;

public class Q10_TreeSet {

	public static void main(String[] args) {
		TreeSet<Q10_Student> ts = new TreeSet<>();
		ts.add(new Q10_Student("blue", 96));
		ts.add(new Q10_Student("hong", 86));
		ts.add(new Q10_Student("blue", 92));

		Q10_Student s = ts.last();
		System.out.println("최고 점수: " + s.score);
		System.out.println("최고 점수를 받은 아이디: " + s.id);

	}

}
