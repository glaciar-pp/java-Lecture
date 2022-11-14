package ch11;

import java.util.Arrays;
import java.util.Random;

public class Ex14_Random {

	public static void main(String[] args) {
//		Random random = new Random(2022);
		// seed 값으로 2022, 값이 없을땐 시간 기반으로 주는 값이라 예측 불가능
		Random random = new Random();
		// seed 값으로 2022, 값이 없을땐 시간 기반으로 주는 값이라 예측 불가능
		System.out.println(random.nextInt(100));

		// 로또 번호 추첨 로직, 2번 방법
		System.out.println("Lotto");
		int[] lotto = new int[6];
		int index = 0;
		while (index < 6) {
			int num = random.nextInt(45) + 1;
			if (!isValidNumber(num, lotto))			//중복 배제
				continue;
			lotto[index++] = num;
//1번 방법			
//			int index = 0;
//			while (true) {
//				int num = random.nextInt(45) + 1;
//				if (!isValidNumber(num, lotto))			//중복 배제
//					continue;
//				lotto[index++] = num;
//				if (index == 6)
//					break;
		}
		Arrays.sort(lotto);
		System.out.println(Arrays.toString(lotto));
	}

	static boolean isValidNumber(int num, int[] lotto) {
		for (int a : lotto)
			if (num == a)
				return false;
		return true;
	}
}


//번호 추첨은 원래 for 문으로 하려고 했는데 중복숫자 때문에 바꿈!
//for(int i=0; i<6; i++) {
//	lotto[i] = random.nextInt(45)+1;

//양이 많지 않아서 이렇게 간단한 식으로 하지만 혹시 양이 많다면 
//Array sort 통해서 정리해서 진행해야함