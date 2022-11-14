package ch10.ex11_userDefineException;

public class Main {

	public static void main(String[] args) {
		Account account = new Account(); // 계좌 개설함

		// 예금하기
		account.deposit(100000);
		System.out.println("잔고" + account.getBalance());

		// 출금하기
		try {
			account.withdraw(50000);
		} catch (BalanceInsufficientException e) {
			System.out.println(e.getMessage()); // 예외상황에 대해 메세지 지정 가능
			e.printStackTrace();
		} finally {
			System.out.println("잔고" + account.getBalance());

		}

	}

}
