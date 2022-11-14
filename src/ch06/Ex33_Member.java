package ch06;

public class Ex33_Member /*override는 extends Object 라는 내용이 생략되어 있음*/{
	private String id;
	private String password;
	private String name;
	
	Ex33_Member(){}
	Ex33_Member(String id, String password, String name) {
		super();
		this.id = id;
		this.password = password;
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
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
		return "Ex33_MemberService [id=" + id + ", password=" + password + ", name=" + name + "]";
	}

}