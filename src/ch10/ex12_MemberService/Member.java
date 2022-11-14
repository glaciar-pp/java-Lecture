package ch10.ex12_MemberService;

public class Member {
	private String id;
	private String password;
	private String name;

	
	Member(){}
	Member(String id, String password, String name) {
		super();
		this.id = id;
		this.password = password;
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) throws NotExistIdException{
		this.id = id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) throws WrongPasswordException{
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Member [id=" + id + ", password=" + password + ", name=" + name + "]";
	}

}
