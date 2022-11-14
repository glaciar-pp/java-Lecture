package ch06;

public class Ex11_Calc {

	public static void main(String[] args) {
		Calc calc = new Calc(1.2, 3.4);
		double res = calc.add();
		System.out.println(res);

		System.out.println(new Calc(2.5, 4.6).add());
		System.out.println(new Calc(2.5, 4.6).sub());
		System.out.println(new Calc(2.5, 4.6).mul());
		System.out.println(new Calc(2.5, 4.6).div());
	}

}

class Calc { // 앞에 퍼블릭 프라이빗 안쓰면 default로 잡힘
	double x; // field...속성값을 갖는 변수
	double y;

	Calc(double x, double y) { // 생성자라서 타입 없음.
		this.x = x; // 멤버 변수는 this 가 붙음
		this.y = y;
	}

	double add() { // Method
		return this.x + this.y;
	} // 이 내용이 새로운 class가 된것

	double sub() {
		return this.x - this.y;
	}

	double mul() {
		return this.x * this.y;
	}

	double div() {
		return this.x / this.y;
	}
}