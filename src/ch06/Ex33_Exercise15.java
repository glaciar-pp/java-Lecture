package ch06;

import java.util.Scanner;

public class Ex33_Exercise15 {

	public static void main(String[] args) {
		Ex33_MemberService memberService = new Ex33_MemberService();
		memberService.register("kim", "9876", "김자바");
		memberService.printAllMembers();
		memberService.register("hong", "12345", "홍길동");
		memberService.printAllMembers();
		memberService.register("hong", "12345", "홍자바");
		memberService.printAllMembers();
		System.out.println();
		
		Scanner scan = new Scanner(System.in);
		System.out.print("아이디(Id): ");
		String id = scan.nextLine();
		System.out.print("패스워드: ");
		String password = scan.nextLine();
		boolean result = memberService.login(id, password);
		if(result) {
			boolean member = memberService.login(id, password);
			System.out.println("로그인 되었습니다.");
			memberService.logout(id);
		}else {
			System.out.println("id 또는 password가 올바르지 않습니다.");
		}

	}

}
