package ch11.sec07_string;

import java.util.Scanner;

public class Q05_CaesarCipher {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("문장입력> ");
		String plainText = scan.nextLine();
		System.out.println("스텝> ");
		int step = scan.nextInt();
		scan.close();
		String cipherText = plain2cipher(plainText, step);
		System.out.println(cipherText);
		System.out.println(cipher2plain(cipherText, step));
	}
	//암호화
	static String plain2cipher(String text, int step) {
		char[] cipherText = new char[text.length()];

		for (int i = 0; i < text.length(); i++) {
			char c = text.charAt(i);
			if (c == ' ') {				//공백은 공백으로 두고 진행하겠다는 의미
				cipherText[i] = c;
				continue;
			}
			char d = (char) (c + step);
			if (d > 'Z')
				d = (char) (d - 26);
			cipherText[i] = d;
		}
		return new String(cipherText);
	}
	//복호화
	static String cipher2plain(String text, int step) {
		char[] plainText = new char[text.length()];

		for (int i = 0; i < text.length(); i++) {
			char c = text.charAt(i);
			if (c == ' ') {				//공백은 공백으로 두고 진행하겠다는 의미
				plainText[i] = c;
				continue;
			}
			char d = (char) (c - step);
			if (d < 'A')
				d = (char) (d + 26);
			plainText[i] = d;
		}
		return new String(plainText);
	}
}