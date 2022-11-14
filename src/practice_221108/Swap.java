package practice_221108;
/**
 * 배열 안에서 i번째 요소와 j번째 요소를 교환하는 
 * swap(int i, int j)메소드를 제네릭 메소드로 작성하세요.
 *
 */
public class Swap {

	public static void main(String[] args) {
		String[] language = {"C++", "C#", "JAVA"};
		MyArrays.swap(language, 1, 2);
		for(String value : language)
			System.out.println(value);
	}
}

class MyArrays {
	public static <T> void swap(T[]t, int i, int k) {
		T tmp=t[i];
		t[i]=t[k];
		t[k]=t[tmp];
	}
}
