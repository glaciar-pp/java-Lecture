package ch12_tread;

public class Ex02_MultiThreadRunnable {

	public static void main(String[] args) throws InterruptedException {
		Runnable beepTask = new Ex02_BeepTest();
		Thread thread = new Thread(beepTask);
		
		thread.start();
		
		for(int i=0;  i< 5; i++) {
			System.out.println("Beep");
			Thread.sleep(1000);
		
		//소리와 문자 출력이 동시에 가능해짐
		

	}
	}
}
