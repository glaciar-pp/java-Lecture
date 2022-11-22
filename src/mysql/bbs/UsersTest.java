package mysql.bbs;

import java.util.List;
import java.util.Scanner;

import org.mindrot.jbcrypt.BCrypt;

public class UsersTest {
	static UsersDAO dao = new UsersDAO();

	public static void main(String[] args) {

		dao.registerUser(new Users("maria", "maria", "마리아", "maria@mysql.com"));
		dao.registerUser(new Users("kevin", "kevin", "케빈", "kevin@mysql.com"));

		// 정보 가져오기
//		Users user = dao.getUserInfo("admin"); //없는 객체를 찾으면 전부 null로 나옴
//		System.out.println(user);

		// 목록 보기
		List<Users> list = dao.listUsers();
		for(Users u : list)
			System.out.println(u);

		// 로그인 하기(간단하게 테스트 격으로 진행해봄)
//		Scanner scan = new Scanner(System.in);
//		System.out.println("uid>");
//		String uid = scan.nextLine();
//		System.out.println("pwd>");
//		String pwd = scan.nextLine();
//		login(uid, pwd);
//	}
//
//	static void login(String uid, String pwd) {
//		Users user = dao.getUserInfo(uid);
//		if (!uid.equals(user.getUid()))
//			System.out.println("ID가 없습니다.");
//		else {
//			if (BCrypt.checkpw(pwd, user.getPwd()))
//				System.out.println("Login이 성공하였습니다.");
//			else
//				System.out.println("패스워드가 틀립니다.");
//		}
	}
 }

