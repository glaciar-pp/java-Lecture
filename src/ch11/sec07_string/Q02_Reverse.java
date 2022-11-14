package ch11.sec07_string;

public class Q02_Reverse {

	public static void main(String[] args) {
		String str1 = "Hello World";
		String str2 = "안녕하세요";
		
		System.out.println(reverse(str1));
		System.out.println(reverse(str2));
		
		System.out.println(ispalindrome("토마토"));
	}
	static boolean ispalindrome(String src) {
		return src.equals(reverse(src));
	}
	
	//			charAt(src.length() - src.length())
		static String reverse(String src) {
			String reverseStr = "";
			int len = src.length();
		for(int i=1; i<=len; i++)
			reverseStr += src.charAt(len-i);
			return reverseStr;	

	}

}
// Palindrome: 정방향 역방향 둘다 동일하게 읽히는 단어. 토마토 같은거