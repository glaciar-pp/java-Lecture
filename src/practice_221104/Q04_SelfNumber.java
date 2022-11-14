package practice_221104;

import java.util.Arrays;

/**
 * n이 1이라고 가정하면,, 
 * 1+0+1 = 2 
 * 2+0+2 = 4 . . . 
 * 16+1+6 = 23 . . . 
 * 91+9+1 = 101
 * 이러한 방식으로 수열을 만들어보자.
 * 
 */
public class Q04_SelfNumber {
	// 입사시험같은데에 나올법한 문제

	public static final int SELF_NUMBER = 0;
	public static final int NOT_SELF_NUMBER = 1;

	public static void main(String[] args) {
		int[] selfNum = new int[100]; // 숫자가 들어갈 배열 생성
		for (int n = 1; n <= 99; n++) {
			int dn = n;
			while (true) {
				dn = dn + dn / 10 + dn % 10;
//				System.out.println(dn);
				if (dn <= 99)
					selfNum[dn] = NOT_SELF_NUMBER;
				if (dn > 100)
					break; // 여기까진 완전수가 아님
			}

		}
		for (int i = 1; i <= 99; i++) {
			if (selfNum[i] == SELF_NUMBER)
				System.out.println(i); // 이렇게 해서 나오는 숫자는 완전수가 됨
		}
		System.out.println(Arrays.toString(selfNumber()));
	}

	static int[] selfNumber() {
		int[] selfNum = new int[100];
		for (int n = 1; n <= 99; n++) {
			if (selfNum[n] == NOT_SELF_NUMBER)
				continue;
			int dn = n;
			while (dn <= 99) {
				dn = dn + dn / 10 + dn % 10;
				if (dn <= 99)
					selfNum[dn] = NOT_SELF_NUMBER;
			}
		} // selfNumber값으로만 된 배열을 만들기 위한 준비
		int count = 0;
		for (int i = 1; i <= 99; i++) {
			if (selfNum[i] == SELF_NUMBER)
				count++;
		}
		// selfNumber값으로만 이루어진 배열 만들기
		int[] result = new int[count];
		for (int i = 1, index = 0; i <= 99; i++) {
			if (selfNum[i] == SELF_NUMBER)
				result[index++] = i;
		}
		return result;
	}
}
