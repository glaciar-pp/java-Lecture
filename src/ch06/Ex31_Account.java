package ch06;

public class Ex31_Account {
	public static final int MIN_BALANCE = 0;
	public static final int MAX_BALANCE = 1000000;

	private int Balance;

	public int getBalance() {
		return Balance;
	}

	public void setBalance(int balance) {
		// 내 어카운트의 total balance가 0 이상 100만 이하
		if (balance + this.Balance >= MIN_BALANCE && balance + this.Balance < MAX_BALANCE) {
			this.Balance += balance;
			// 내 balance가 0 이상 100만 이하
//			if (balance + this.Balance >= MIN_BALANCE && balance + this.Balance < MAX_BALANCE) {
//				this.Balance += balance;

		}

	}

	}
	
