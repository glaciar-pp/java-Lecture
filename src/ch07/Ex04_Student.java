package ch07;

public class Ex04_Student extends Ex04_Person {
	String major;
	
	Ex04_Student(String name, String gender, int age, String major) {
		super(name, gender, age);
		this.major = major;
	}
	
	Ex04_Student() {};
	void study() {
		System.out.println("자바를 공부합니다.");
	}

	@Override //상속 포함 생성
	public String toString() {
		return "Ex04_Student [major=" + major + ", name=" + name + ", gender=" + gender + ", age=" + age + "]";
	}

}
