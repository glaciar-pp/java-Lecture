package ch07;

public class Ex22_Main {

	public static void main(String[] args) {  //추상 클래스를 실체화 가능
		Cow cow = new Cow();
		Cock cock = new Cock();
		cow.sound();
		cock.sound();
		System.out.println();

		//자동 타입 변환
		Ex22_Animal animal = new Cow();
		animal.sound();
		animal = new Cock();
		animal.sound();
		System.out.println();
		
		//매개변수의 자동 타입 변환
		animalsound(new Cow());
		animalsound(new Cock());
	}

	static void animalsound(Ex22_Animal animal) {
		animal.sound();
		
	}

}
