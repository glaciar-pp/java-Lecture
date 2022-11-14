package ch11.sec10_regex;

import ch11.sec07_string.Strings;

/**
 * 
 * 팔린드롬 3자리 정수 두개를 곱해서 나온 값(예시)100*100=10000) 이 팔린드롬이라고 할때 가장 큰 팔린드롬 수는? 답 얘시:
 * 23532 for loop2
 *
 */

public class Q01_Palindrome {

	public static void main(String[] args) {
		int max = 0, x = 0, y = 0;
		for (int i = 100; i <= 999; i++) {
			for (int k = i; k <= 999; k++) {
				int mul = i * k;
				if (Strings.ispalindrome(String.valueOf(mul)) && mul > max) {
					max = mul;
					x = i;
					y = k;
				}
			}
		}
		System.out.println(x + "x" + y + "=" + max);

//		int max = 0;
//		for(int i=100; i<=999; i++) {
//			for(int k=i; k<=999; k++) {
//				int result = i * k;
//				if (result > max)
//					max = result;
//			}
//		}
//		System.out.println();
//	}
//	
//	//팔린드롬을 위한 식
//		public static boolean ispalindrome(String src) {
//			return src.equals(reverse(src));
//		}
//		public static String reverse(String src) {
//				String reverseStr = "";
//				int len = src.length();
//			for(int i=1; i<=len; i++)
//				reverseStr += src.charAt(len-i);
//				return reverseStr;	
//	}

	}
}
