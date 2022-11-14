package ch14_lambda_Q04_06;

public class Q04_LambdaThread {

	public static void main(String[] args) {
		Thread thread = new Thread(() -> {
			for (int i = 0; i < 3; i++)
				System.out.println("작업스레드가 실행됩니다.");
		});

		thread.start();
	}

}
