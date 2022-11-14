package ch11.sec07_string;
//내용을 문자열로서 하나로 담아주는 기능
public class Ex12_Join {

	public static void main(String[] args) {
		String[] fruits = {"감", "밤", "귤", "배"};

		System.out.println(String.join(" ", fruits));
		System.out.println(String.join(", ", fruits));
		System.out.println(String.join(" - ", fruits));
	}

}
