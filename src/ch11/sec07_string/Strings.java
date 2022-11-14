package ch11.sec07_string;
/**
 *
 * 유용한 나만의 String method
 *
 */

public class Strings {
	//Palindrome: 정방향 역방향 둘다 동일하게 읽히는 단어가 맞는지 확인하는 method
	public static boolean ispalindrome(String src) {
		return src.equals(reverse(src));
	}
	
	//문자 뒤집는 method
	public static String reverse(String src) {
			String reverseStr = "";
			int len = src.length();
		for(int i=1; i<=len; i++)
			reverseStr += src.charAt(len-i);
			return reverseStr;	
	}
	//특정 단어를 카운트 할수 있게 해주는 method
	public static int count(String src, String target) {
		String eliminated = src.replace(target,"");
		int len = (src.length()-eliminated.length())/target.length();
		return len;
	}

}
