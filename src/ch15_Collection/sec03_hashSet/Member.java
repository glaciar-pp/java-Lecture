package ch15_Collection.sec03_hashSet;

import java.util.Objects;

public class Member {
	private String name;
	private int age;

	Member(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	@Override
	public int hashCode() { // 두가지 방법 사용 가능

		return Objects.hash(name, age);
//	return name.hashCode() + age;

	}

	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof Member))
			return false;

		Member target = (Member) obj;
		return name.equals(target.name) && age == target.age;

		//책에 나온 방법
//		if (obj instanceof Member target) //자바버전 16 부터 사용가능한 기능
//			return name.equals(target.name) && age == target.age;
//
//		else
//			return false;
	}

}
