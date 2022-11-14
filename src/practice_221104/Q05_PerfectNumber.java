package practice_221104;

public class Q05_PerfectNumber {

	public static void main(String[] args) {
		for (int i = 2; i < 10000; i++) {
			if (isPerfectNumber(i))
				System.out.println(i);
		}
		for (int i = 2; i < 10000; i++) {	//for문 활용
			int sumOfDivisors = 0;
			for (int k = 1; k < i; k++) { // k
				if (i % k == 0)
					sumOfDivisors += k;
			}
			if (i == sumOfDivisors)
				System.out.println(i);
		}
	}

	static boolean isPerfectNumber(int num) { // boolean을 사용할 경우
		int sumOfDivisors = 0;
		for (int i = 1; i < num; i++) { // i 가 num의 약수
			if (num % i == 0)
				sumOfDivisors += i;
		}
		return num == sumOfDivisors;
	}
}
