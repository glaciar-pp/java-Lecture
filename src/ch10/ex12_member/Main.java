package ch10.ex12_member;
/**
 * 우리에게 Try - Catch - Finally 라는 좋은 무기가 있음!
 */
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		MemberService memberService = new ArrayMemberService();
		// 인터페이스 뒤에 구현한 객체명을 넣으면 됨!
		memberService.register("kim", "9876", "김자바");
		memberService.register("hong", "12345", "홍길동");
		memberService.register("park", "1234", "박자바");
		memberService.printAllMembers();
		System.out.println();

		Scanner scan = new Scanner(System.in);
		System.out.print("아이디(Id): ");
		String id = scan.nextLine();
		System.out.print("패스워드: ");
		String password = scan.nextLine();
		scan.close();

		try {
			boolean result = memberService.login(id, password);
			if (result) {
				System.out.println("로그인 되었습니다.");
				memberService.logout(id);
			}
//		} catch (NotExistIdException | WrongPasswordException e) {  //둘다 가능, 다형성
		}catch (RuntimeException e) {								//둘다 가능, 다형성
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}
}
