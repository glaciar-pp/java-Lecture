package ch10;

public class Ex01_NullPointer {

	public static void main(String[] args) {
		String str = null;
		if (str != null)  //null이 아니면 실행하라는 의미, 이게 있으면 에러는 사라진다.
		System.out.println(str.length()); //그냥 돌리면 기본값이 null이기 때문에 예외가 생김
		
		if (str != null)  //null이 아니면 실행하라는 의미, 이게 있으면 에러는 사라진다.
			System.out.println(str.length());
	}

}
