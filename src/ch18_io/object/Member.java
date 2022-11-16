package ch18_io.object;

import java.io.Serializable;

public class Member implements Serializable {
	/**
	 * serialVersionUID 값은 프로그램 작성자가 버전 관리해야함.
	 */
//	private static final long serialVersionUID = 1L; //값 add할수는 있음...
	private static final long serialVersionUID = 1702543704907417785L;
	
	private String id;
	private String name;

	public Member(String id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Ex10_Member [id=" + id + ", name=" + name + "]";
	}

}
