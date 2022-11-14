package ch11.sec12_Wrapper;

public class Ex02_Misc {

	public static void main(String[] args) {
		double d = Double.parseDouble("3.14");
		Integer i = Integer.parseInt("300");
		Integer k = 300;
		
		System.out.println(i == k);		// -128~127까지만 사용 가능
		System.out.println(i.equals(k));

	}

}
