package ch07;

public class Ex04_Person {
	String name;
	String gender;
	int age;

	Ex04_Person(String name, String gender, int age) { //부모에서 생성자를 만들어주면 자식이 가져갈 수 있게 됨
		super();
		this.name = name;
		this.gender = gender;
		this.age = age;
	}
	Ex04_Person() {};
	void eat() {
		System.out.println("식사를 합니다.");
	}

	void sleep() {
		System.out.println("수면에 듭니다.");
	}
}
