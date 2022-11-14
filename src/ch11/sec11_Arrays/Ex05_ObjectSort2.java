package ch11.sec11_Arrays;
/**
 * 별도의 Comparator를 구현한 객체를 이용함
 */
import java.util.Arrays;

public class Ex05_ObjectSort2 {

	public static void main(String[] args) {
		Ex05_Member member1 = new Ex05_Member(0, "박자바");
		Ex05_Member member2 = new Ex05_Member(1, "이자바");
		Ex05_Member member3 = new Ex05_Member(2, "김자바");
		Ex05_Member[] members = {member1, member2, member3};
		// 오름차순
		Arrays.sort(members, new Ex05_MemberComparator());
		for(Ex05_Member member : members)
			System.out.println(member);
		
		// 내림차순
		Arrays.sort(members, new Ex05_MemberReverseComparator());
		for(Ex05_Member member : members)
			System.out.println(member);
		// 자바가 워낙 엄격한 언어여서 그런지 소팅이 유난히 어렵다고 하심
		// 새로 만드는거보다 지금 한 것 처럼 있는걸 쓰는게 낫다고 하심...
	}

}