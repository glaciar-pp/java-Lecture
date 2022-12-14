package ch08;

public class Ex01_Television implements Ex01_RemoteControllable{
	// 인터페이스 구현 한번 더~
	private int volume;

	@Override
	public void turnOn() {
		System.out.println("티비를 켭니다.");
	}

	@Override
	public void turnOff() {
		System.out.println("티비를 끕니다.");
	}

	@Override
	public void setVolume(int volume) {
		if(volume > Ex01_RemoteControllable.MAX_VOLUME)
			this.volume = (Ex01_RemoteControllable.MAX_VOLUME);
		else if (volume < Ex01_RemoteControllable.MIN_VOLUME)
			this.volume = Ex01_RemoteControllable.MIN_VOLUME;
		else
			this.volume = volume;
		
		System.out.println("현재 TV의 볼륨: "+ this.volume);
		
	} 

}