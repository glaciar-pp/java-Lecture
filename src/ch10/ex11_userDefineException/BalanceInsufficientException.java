package ch10.ex11_userDefineException;

public class BalanceInsufficientException extends RuntimeException{

	BalanceInsufficientException(String message) {
		super(message);
	}

}
