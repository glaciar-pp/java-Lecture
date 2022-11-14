package ch06;
/**
 * 음수값이 될수 없는 조건 ->int
 * 최대 100만원 설정 ->범위값에 대한 조건 설정
 * 외부 변경 금지..-> private
 * 게터세터 이용
 */
public class Ex05_Balance {
	private int Balance;
	private boolean success;

	 void in() {
			System.out.println("입금 합니다.");
			 }
	 void out() {
			System.out.println("출금 합니다.");
			 }
	
	 void money() {
	System.out.println("잔고를 확인합니다.");
	 }

	Ex05_Balance(int balance, boolean success) {
		super();
		Balance = balance;
		this.success = success;

	}

	public int getBalance() {
		return Balance;
	}

	public void setbalance(int balance) { // 0원 이상 100만원 미만
		if (balance >= 100 && balance < 1000) {
			this.Balance = balance;
			success = true;
			return;
		}
		success = false;
	}
	public boolean isSuccess() {
		return success;
	}

	public void setSuccess(boolean success) {
		this.success = success;
	}

}
