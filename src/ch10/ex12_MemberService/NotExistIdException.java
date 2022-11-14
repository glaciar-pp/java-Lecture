package ch10.ex12_MemberService;

public class NotExistIdException extends Exception{

	NotExistIdException(String message) {
		super(message);
	}

}
