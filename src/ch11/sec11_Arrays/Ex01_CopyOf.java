package ch11.sec11_Arrays;
/**
 * 배열 복사하기
 */
import java.util.Arrays;

public class Ex01_CopyOf {

	public static void main(String[] args) {
		char[] src = {'J', 'A', 'V', 'A'};
		//
		char[] dst = Arrays.copyOf(src, src.length);//src 전부 복사 하겠다는 소리
		System.out.println(Arrays.toString(dst));
		
		//범위 내 복사
		dst= Arrays.copyOfRange(dst, 1, 3);			
		System.out.println(Arrays.toString(dst));
		
		//둘의 범위를 정해서 복사
		char[] newDst = new char[4];
		System.arraycopy(src, 0, newDst, 0, src.length); 
		System.out.println(Arrays.toString(newDst));
		
		//받는 배열에 기억장소가 확보되어야 하다보니 좋은 방법은 아님
		src[0] = 'j';
		newDst[1] = 'a';
		System.out.println(Arrays.toString(src));
		System.out.println(Arrays.toString(newDst));

		
	}

}
