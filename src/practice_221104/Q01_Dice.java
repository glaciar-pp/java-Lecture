package practice_221104;

import java.util.Random;

public class Q01_Dice {

	public static void main(String[] args) {
		Random ran = new Random();
		int num1 = ran.nextInt(6) + 1;
		int num2 = ran.nextInt(6) + 1;
		int num3 = ran.nextInt(6) + 1;
		int prize = getPrize(num1, num2, num3);
		System.out.println("주사위 눈:" + num1 + ", " + num2 + ", " + num3);
		System.out.printf("상금: %, d%n", prize);
	}

	private static int getPrize(int num1, int num2, int num3) {
		if (num1 == num2 && num2 == num3) {
			return 10000 + num1 * 1000;
		}
		if (num1 == num2 || num2 == num3 || num1 == num3) {
			if (num2 == num3) {
				return 1000 + num2 * 100;
			}
			return 1000 + num1 * 100;
		}
		int max = num1;
		if (max < num2)
			max = num2;
		if (max < num3)
			max = num3;
		return max * 100;
	}

	static int getPrize2(int num1, int num2, int num3) {
		int prize = 0;
		if (num1 == num2 && num2 == num3) {
			return 10000 + num1 * 1000;
		} else if (num1 == num2 || num2 == num3 || num1 == num3) {
			if (num2 == num3) {
				prize = 1000 + num2 * 100;
			} else {
				prize = 1000 + num1 * 100;
			}
		} else {
			int max = num1;
			if (max < num2)
				max = num2;
			if (max < num3)
				max = num3;
			prize = max * 100;
		}
		return prize;
	}
}