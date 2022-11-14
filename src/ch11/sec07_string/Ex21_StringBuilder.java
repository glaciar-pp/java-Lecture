package ch11.sec07_string;

public class Ex21_StringBuilder {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder(); // 지금 이건 ""...빈 상태
		
		sb.append("Java ");		//자바 들어감
		sb.append("Program Study");		//자바+프로그램 스터디 들어감
		System.out.println(sb.toString());
		
		// 문자 삽입
		sb.insert(4, 2);			//자바2 프로그램 스터디 들어감
		System.out.println(sb.toString());
		
		//문자 하나 변경
		sb.setCharAt(4, '6');		//자바6 프로그램 스터디 들어감
		System.out.println(sb.toString());
		
		//문자열 변경
		sb.replace(6, 13, "Book");
		System.out.println(sb.toString());

		//문자열 삭제
		sb.delete(4, 5);
		System.out.println(sb.toString());
		
		//문자열 뒤집기
		System.out.println(sb.reverse().toString());
	}

}
