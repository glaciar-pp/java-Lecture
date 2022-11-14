package ch10.ex13_array;

/**
 * 몸풀기 문제 int[] arr = {5, 20, 4, 59, 8} 이 있다. arr배열 원소의 합을 구하려고 한다. 다음의 코드를
 * 완성하세요. int sum = 0 while (true){
 *
 * }
 *
 * 단, while문 안에서 if를 사용하면 안되고 try-catch를 이용해서 합계를 구해보세요.
 */

public class Main {

	public static void main(String[] args) {
		int[] arr = { 5, 20, 4, 59, 8 };
		int sum = 0, index = 0;

		try {
			while (true) {
				sum += arr[index++];
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("배열의 합: " + sum);
		}
	}

}
