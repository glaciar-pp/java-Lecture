package ch11.sec07_string;

public class Ex08_Trim {

	public static void main(String[] args) {
		// 문자열 공백 잘라내기
		String oldStr = "      자바 프로그래밍   \t \r\n";
		String newStr = oldStr.trim();
		
		System.out.println(newStr);
		System.out.println(newStr.length());
		//		\t, \r, \n과 같은 기호도 없애줌, 다만 사이에 있는건 못자르고 문자로 포함
	}

}
