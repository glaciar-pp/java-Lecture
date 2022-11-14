package ch07;

public abstract class Ex22_Animal {
	String kind;

	public void breathe() {
		System.out.println("숨을 쉽니다.");
	}

	public abstract void sound(); // 추상 메소드
}

class Cow extends Ex22_Animal {
	Cow() {
		this.kind = "소";
	}

	@Override
	public void sound() {
		System.out.println("음메~~");
		
	}

	}

	class Cock extends Ex22_Animal {
		Cock() {
			this.kind = "닭";
		}

		@Override
		public void sound() {
			System.out.println("꼬끼오~");

		}

	}
	//추상 클래스를 재정의 하지 않으면 하등 쓸모가 없음
	abstract class Bird extends Ex22_Animal{ // 추상 클래스를 상속 받아서 다시 추상도 가능
		Bird(){
			this.kind = "조류";
		}
	}