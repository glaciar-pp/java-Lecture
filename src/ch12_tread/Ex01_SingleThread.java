package ch12_tread;

import java.awt.Toolkit;

public class Ex01_SingleThread {

	public static void main(String[] args) throws InterruptedException {
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		for (int i = 0; i < 5; i++) {
			toolkit.beep(); // 또링 소리남
			Thread.sleep(1000);// 1000 ms 만큼 중지
		}
		for (int i = 0; i < 5; i++) {
			System.out.println("Beep");
			Thread.sleep(1000);

		}

	}
}
