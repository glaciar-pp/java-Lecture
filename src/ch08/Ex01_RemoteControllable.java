package ch08;

/**
 * 인터페이스 선언
 * 실행블럭({})이 없다는 것도 클래스와 다른 점 중 하나
 */
public interface Ex01_RemoteControllable {
	//상수(Constant)는 언제나 대문자 표기
	public static final int MAX_VOLUME = 10;
	public int MIN_VOLUME = 0;
	//사실 static final은 생략됐을뿐 상수에 대해 붙어있음. 컴파일 과정에서 자동으로 붙음!
	
	//추상 메소드...인터페이스는 추상 메소드임!! 
	// 다른건 크게 중요하지 않음 이게 별 다섯개
	void turnOn();		//public abstract...시그니쳐가 생략되어 있음
	public void turnOff();
	public abstract void setVolume(int volume);  
	//근데 abstract 명시하는게 나음 순간 헷갈림
	
	//디폴트 메소드(Java 1.8부터 지원하는 기능)
	//시그니쳐인 디폴트 명시하지 않으면 추상 메소드로 처리되니 주의
	public default void setMute(boolean mute) {
		if(mute)
			System.out.println("무음 처리합니다.");
		else
			System.out.println("무음 해제합니다.");
	}
	// 정적 메소드(Java 1.8부터 지원하는 기능)
	//시그니쳐인 스태틱 명시하지 않으면 추상 메소드로 처리되니 주의
	public static void changeBattery() {
		System.out.println("건전지를 교환합니다.");
	}

}
