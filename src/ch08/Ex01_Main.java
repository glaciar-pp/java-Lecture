package ch08;

/**
 * 인터페이스 구현 객체 실행
 * 다형성을 보여줌! Audio도 만들고 TV도 만들었는데 내용은 동일
 */
public class Ex01_Main {

	public static void main(String[] args) {
		Ex01_RemoteControllable rc = null;
		rc = new Ex01_Audio();
		rc.turnOn();
		rc.setVolume(5);
		rc.setMute(true);							//default Method
		Ex01_RemoteControllable.changeBattery();  //static Method
		rc.turnOff();
		
		rc = new Ex01_Television();
		rc.turnOn();
		rc.setVolume(5);
		rc.setMute(true);
		Ex01_RemoteControllable.changeBattery();
		rc.turnOff();

	}

}
