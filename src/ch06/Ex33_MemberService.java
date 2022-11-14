package ch06;

import java.util.Scanner;

public class Ex33_MemberService {
	private Ex33_Member[] members = new Ex33_Member[10]; // 데이터 모을 자리를 만듬, 나중엔 DB로 처리할 내용
	Ex33_Member MS = new Ex33_Member();
	Scanner scan = new Scanner(System.in);

	void register(String id, String password, String name) {
		
		Ex33_Member member = findById(id);
		if(member != null) { //id에 대한 중복확인 절차
			System.out.println("id가 중복되었습니다.");
			return;
		}
		member = new Ex33_Member(id, password, name);
		for (int i = 0; i < members.length; i++) {
			if (members[i] == null) {//null에서 특정 정보를 가르키도록 만들어줘야함
				members[i] = member;
				break;
			}
		}

	}
	void printAllMembers() {
		for(Ex33_Member member : members) {
			if(member == null) //null 정보 상태면 볼 필요가 없으니 정지
				break;
			System.out.println(member);  //있으면 목록이 나올 예정
		}
		
	}
	Ex33_Member findById(String id) {
		for (Ex33_Member member : members) {
			if (member == null)  // id에 해당하는 member 정보를 찾지 못하고 끝까지 갈 경우
//				return null;  // null, 없음으로 표기...가져올게 없으니까!
				break; //보기 지저분하니 break를 걸어줌
				if (id.equals(member.getId())) // 가져오는 데이터가 맞는지 확인
				return member;
		}
		return null; //두번 들어가있긴 하지만 내부 과정 돌아서 없으면 null로 해야하기 때문
	}
	boolean login(String id, String password) {
		// 나중에 비번 * 처리, 데이터 암호화 등 DB로 암호화 안해놓으면 정보 보호법으로 잡혀가기 딱 좋음
		Ex33_Member member = findById(id);
		if(member == null)		//id에 해당하는 member가 없는 경우
		return false; 
		else {					//id에 해당하는 member를 찾은 경우
			if (password.equals(member.getPassword())) {
				System.out.println(member.getName()+"님 환영합니다.");
			
				return true;
			}else
				return false;
		}
		/* 암호화?
		 * 평문(plain text) ---> 비문(cypher text)
		 * 평문 --> 암호화  /  평문 <--> 비문
		 * 전자서명, 부인봉쇄...부인봉쇄는 말 그대로 본인이 안했다 잡아떼는걸 막기 위함
		 */
	}
	void logout(String id) {
		Ex33_Member member = findById(id);
		System.out.println(member.getName()+"님이 로그아웃 되셨습니다.");
		
	}
}



