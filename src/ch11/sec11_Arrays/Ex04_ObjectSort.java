package ch11.sec11_Arrays;

/**
 * 비교하려는 Object가 Comparable 인터페이스를 구현한 경우
 * Arrays.sort를 바로 사용이 가능하다. 
 */
import java.util.Arrays;
import java.util.Comparator;

public class Ex04_ObjectSort {

	public static void main(String[] args) {
		Ex04_Member member1 = new Ex04_Member(0, "박자바");
		Ex04_Member member2 = new Ex04_Member(1, "이자바");
		Ex04_Member member3 = new Ex04_Member(2, "김자바");
		Ex04_Member[] members = {member1, member2, member3};
		
		
		//오름차순
		Arrays.sort(members);
		for(Ex04_Member member : members)
			System.out.println(member);
		//결과가 김자바, 박자바, 이자바 순으로 나오는 이유는 멤버에서
		//이름 순서대로 하는것을 지정해두었기 때문
		
		//내림차순
		Arrays.sort(members, Comparator.reverseOrder());
		for(Ex04_Member member : members)
			System.out.println(member);

	}

}
