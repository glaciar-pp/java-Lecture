package ch11.sec11_Arrays;

//인터페이스에 해당 클래스 이름을 넣고 만들어주기 때문에 다른 클래스와 엮일 걱정 없이
//사용이 가능함

public class Ex04_Member implements Comparable<Ex04_Member> {
	int id;
	String name;

	Ex04_Member(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	@Override
	public int compareTo(Ex04_Member o) {
		return name.compareTo(o.name);

	}

	@Override
	public String toString() {
		return "Ex04_Member [id=" + id + ", name=" + name + "]";
	}

}
