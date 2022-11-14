package ch08;

public class Ex03_Main {

	public static void main(String[] args) {
		Ex03_SmartTV smartTV = new Ex03_SmartTV();
		smartTV.turnOn();
		smartTV.search("Naver");
		smartTV.setVolume(4);
		smartTV.turnOff();
		
		//인터페이스 구현 객체의 다형성
		Ex01_RemoteControllable rc = new Ex03_SmartTV();
		rc.turnOn();
		rc.setVolume(3);
		rc.turnOff();
		
		Ex03_Searchable sc = new Ex03_SmartTV();
		sc.search("Google");
	}

}
