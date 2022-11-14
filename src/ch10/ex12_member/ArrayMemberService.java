package ch10.ex12_member;

public class ArrayMemberService implements MemberService {
	private Member[] members = new Member[10]; // 고객 정보니까 다른데서 못쓰게 private

	@Override
	public void register(String id, String password, String name) {
		Member member = findById(id);
		if (member != null) { // id에 대한 중복확인 절차
			System.out.println("id가 중복되었습니다.");
			return;
		}
		member = new Member(id, password, name);
		for (int i = 0; i < members.length; i++) {
			if (members[i] == null) {// null에서 특정 정보를 가르키도록 만들어줘야함
				members[i] = member;
				break;
			}
		}
	}

	@Override
	public void printAllMembers() {
		for (Member member : members) {
			if (member == null) // null 정보 상태면 볼 필요가 없으니 정지
				break;
			System.out.println(member);
		}
	}

	@Override
	public Member findById(String id) {
		for (Member member : members) {
			if (member == null) // id에 해당하는 member 정보를 찾지 못하고 끝까지 갈 경우
//				return null;  // null, 없음으로 표기...가져올게 없으니까!
				break; // 보기 지저분하니 break를 걸어줌
			if (id.equals(member.getId())) // 가져오는 데이터가 맞는지 확인
				return member;
		}
		return null;
	}

	@Override
//	public boolean login(String id, String password) throws NotExistIdException, WrongPasswordException {
	public boolean login(String id, String password) throws RuntimeException {
		Member member = findById(id);
		if (member == null) // id에 해당하는 member가 없는 경우
			throw new NotExistIdException("ID " + id + " 이/가 없습니다.");
//		return false;
		else { // id에 해당하는 member를 찾은 경우
			if (password.equals(member.getPassword())) {
				System.out.println(member.getName() + "님 환영합니다.");
				return true;
			} else
				throw new WrongPasswordException("패스워드가 틀렸습니다.");
//				return false;
		}

	}

	@Override
	public void logout(String id) {
		Member member = findById(id);
		System.out.println(member.getName() + "님이 로그아웃 되셨습니다.");
	}

}
