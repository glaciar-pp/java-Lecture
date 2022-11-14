package ch08;

public class Q04_DbWork implements Q04_DataAcessObject {
	String program;

	@Override
	public void select() {
		System.out.println(program + "DB에서 검색합니다.");
	}

	@Override
	public void insert() {
		System.out.println(program + "DB에 삽입합니다.");
	}

	@Override
	public void update() {
		System.out.println(program + "DB를 수정하였습니다.");
	}

	@Override
	public void delete() {
		System.out.println(program + "DB에서 삭제되었습니다.");
	}

}
class Oracle extends Q04_DbWork{
	Oracle() {
		this.program = "Oracle";
	}
}
class MySql extends Q04_DbWork{
	MySql() {
		this.program = "MySql";
	}
}
