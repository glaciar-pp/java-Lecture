package ch06;

public class Ex03_Overload {

	public static void main(String[] args) {
		int min = getMinimum(3, 4, 5);
		System.out.println("미니멈은 "+ min);
		System.out.println("미니멈은 "+ getMinimum(10., 20., 5));
		System.out.println("미니멈은 "+ getMinimum(100, 83, 145));
		System.out.println("미니멈은 "+ getMinimum(5, 28));
	}
	//매개변수의 타입, 변수 갯수, 순서 같은 것들이 다르면 같은 메소드를 사용할 수 있는게 오버로드
	static int getMinimum(int a, int b) {
		return getMinimum(a, a, b);
	}
	
	static int getMinimum(int a, int b, int c) { //이게 정석적인 min메소드
		int min = (a < b) ? a : b;
		min = (min > c) ? c : min;
		return min;
	}

	static double getMinimum(double a, double b, double c) {
		double min = (a < b) ? a : b;
		min = (min > c) ? c : min;
		return min;
	}
}
