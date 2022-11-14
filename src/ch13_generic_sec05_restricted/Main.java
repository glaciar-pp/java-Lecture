package ch13_generic_sec05_restricted;

public class Main {
	public static void main(String[] args) {
		int result = Util.Compare(10, 20);
		System.out.println(result);

		System.out.println(Util.Compare(5.5, 5.5));
		System.out.println(Util.Compare(4.5, 3));

	}
}
