package ch07;

/**
 * 다형성 - Animal 사례
 *
 */
public class Ex12_Animal {

	public static void main(String[] args) {
		Cat cat = new Cat();
		cat.catField = 3;
		
		Animal animal = cat;
		animal.animalMethod();
		// animal.catMethod(); 는 사용할 수 없음! cat이 상속을 받은 거기 때문				
		// animal.catMethod(); //애니멀을 이미 상속 받았기 때문에 사용불가	
//		cat.catMethod(); // 사용가능
		Animal animal2= new Dog();
		animal2.animalMethod();
		
		Object obj = new Animal(); //Object의 경우 모든 것의 조상격이라 모든게 가능한 것
		obj = new Cat();
		obj = new Dog();
	}

}

class Animal{
	int animalField;
	void animalMethod() {
		System.out.println("Animal: " + animalField);
		System.out.println("동물이 소리를 냅니다.");
	}
}

class Cat extends Animal{
	int catField;
	void catMethod() {
		System.out.println("cat: " + catField);
	
	}
	@Override
	void animalMethod() {
		System.out.println("cat: " + animalField);
		System.out.println("야옹~~");
	}
}
class Dog extends Animal{
	int dogField;
	void dogMethod() {
		System.out.println("dog: " + dogField);
	}

@Override
void animalMethod() {
	System.out.println("Dog: " + animalField);
	System.out.println("멍멍!!");
}
}