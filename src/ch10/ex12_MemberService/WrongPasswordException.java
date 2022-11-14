package ch10.ex12_MemberService;

public class WrongPasswordException extends Exception {

	WrongPasswordException(String message) {
		super(message);
	}

}
