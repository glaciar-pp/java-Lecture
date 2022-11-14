package ch05;

import java.util.Arrays;
import java.util.Random;

/**
 * 
 * length가 30인 정수형 배열 score에 100보다 작은 임의의 정수값을 입력하고 이 배열에서 가장 큰 수를 찾으세요
 */
public class Ex17_MaxMin {

	public static void main(String[] args) {
		int[] score = new int[30];
		Random ran = new Random();
		for (int i = 0; i < score.length; i++)
			score[i] = ran.nextInt(100);
		int max = 0;		//최대값 구하는 로직, int max=score[0]; 도 가능
		for (int i = 0; i < score.length; i++) {
			if (score[i] > max)
				max = score[i];
		}
		int min = 100;		//최소값 구하는 로직, int max=score[0]; 도 가능
		for (int i = 0; i < score.length; i++) {
			if (score[i] < min)
				min = score[i];
		}
		System.out.println(Arrays.toString(score));
		System.out.println(max);
		System.out.println(min);

	}
}
