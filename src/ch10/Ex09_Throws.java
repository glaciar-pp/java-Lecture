package ch10;
/**
 * Throws - 예외를 호출한 곳으로 떠넘기기
 *
 */
public class Ex09_Throws {

	public static void main(String[] args) {
		try {
			findClass();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

	}
private static void findClass() throws ClassNotFoundException{
	Class clazz = Class.forName("java.lang.String2");
}
}
