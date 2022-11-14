package ch11.sec03_object;

public class Member {
	String id;
	String name;

	Member(String id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Member) {
			Member member = (Member) obj;
			//id, name이 모두 같아야 true, name을 지우면 id만 같으면 true 조건이 됨
//			if (id.equals(member.id)) {
			if (id.equals(member.id) && name.equals(member.name)) {
				return true;
			}
		}
		return false;
	}

	@Override
	public String toString() {
		return "Member [id=" + id + ", name=" + name + "]";
	}
	
}
