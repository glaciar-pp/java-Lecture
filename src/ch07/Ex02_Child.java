package ch07;

public class Ex02_Child extends Ex02_Parent {
	int childInt;

	void childmethod() {
		super.parentMethod();
		System.out.println("child: " + childInt);
	}

	@Override
	void parentMethod() { //자식에서 부모에 대해 재정의
		System.out.println("child: "+parentInt);
	}
}
