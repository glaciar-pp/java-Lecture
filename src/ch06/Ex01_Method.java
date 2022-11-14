package ch06;

public class Ex01_Method {

	public static void main(String[] args) {
// 메소드를 통해 값 얻기
		int min = getMin(3, 4, 5);
		System.out.println(min);
		System.out.println(getMin(10, 20, 5));
		System.out.println(getMin(100, 83, 145));
		
	}

	static int getMin(int a, int b, int c) {
		int min = (a < b) ? a : b; // 위 메인메소드와 다른 자리에 있기에 min 똑같이 사용 가능
		min = (min > c) ? c : min;
		return min;
	}

}
