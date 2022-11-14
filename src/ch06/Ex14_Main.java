package ch06;

public class Ex14_Main {

	public static void main(String[] args) {
		Ex14_Member member = new Ex14_Member();
//		member.uid="admin"; //받아오려는 곳이 private이기 때문에 받을 수 없음
		member.setUid("admin");
		System.out.println(member.getUid()); // 가져오는것을 허용

		member = new Ex14_Member("admin", "운영자", "1234", 30);
		System.out.println(member.toString());
	}
}
