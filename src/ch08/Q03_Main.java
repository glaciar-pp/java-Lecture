package ch08;

public class Q03_Main {

	public static void main(String[] args) {
		Q03_printSound ps = new Q03_printSound();
		Cat cat = new Cat();
		Dog dog = new Dog();
		
		ps.printSound(cat);
		ps.printSound(dog);

	}

}

class Cat implements Q03_Soundable {

	@Override
	public void sound() {
		System.out.println("야옹~");

	}
}

class Dog implements Q03_Soundable {

	@Override
	public void sound() {
		System.out.println("멍멍!");
	}
}