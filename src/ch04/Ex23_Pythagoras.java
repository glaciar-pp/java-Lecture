package ch04;

/**
 * 피타고라스 a * a + b * b = c * c a + b + c =1000, a < b < c 이때 a, b, c를 찾아라
 */
public class Ex23_Pythagoras {

	public static void main(String[] args) {
		for (int a = 1; a <= 1000; a++) {
			for (int b = a + 1; b <= 499; b++) {
				int c = 1000 - a - b;
				if (c * c == a * a + b * b) {
					System.out.println(a + "," + b + "," + c);
					break;
				}
			}

		}

	}

}
