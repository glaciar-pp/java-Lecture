package ch11.sec11_Arrays;

import java.util.Comparator;

public class Ex05_MemberComparator implements Comparator<Ex05_Member> {

	public static void main(String[] args) {

	}

	@Override
	public int compare(Ex05_Member o1, Ex05_Member o2) {

		return o1.name.compareTo(o2.name);

	}

}
