package ch10;
/**
 * NumberFormatException
 *
 */
public class Ex03_NumberFormat {

	public static void main(String[] args) {
		int value = Integer.parseInt("100원");
		//해결하려면 정규표현식을 사용하여 숫자이외의 문자는 다 삭제해야함
		//정규표현식은 뒤에 나옴!
		System.out.println(value);

	}

}
