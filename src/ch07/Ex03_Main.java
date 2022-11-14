package ch07;

public class Ex03_Main {

	public static void main(String[] args) {
		Ex03_SupersonicAirplane ss = new Ex03_SupersonicAirplane();
		//이름을 길게 쓰는 편이라 ctrl+ space 활용해도 좋음
		ss.takeOff();
		ss.fly();
		ss.flyMode = ss.SUPERSONIC;
		ss.fly();
		ss.flyMode = ss.NORMAL;
		ss.fly();
		ss.land();

	}

}
