package ch11.sec07_string;

public class Q05_CaesarExample {

	public static void main(String[] args) {
		char c = 'A';
		char d = (char) (c + 5);
		System.out.println(d);
		
		char z= 'Z';
		char e = (char) ('Z'-26 + 5);
		System.out.println(e);
	}

}
