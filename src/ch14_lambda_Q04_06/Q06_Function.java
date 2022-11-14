package ch14_lambda_Q04_06;


public class Q06_Function {
	
	public static double calc(Q06_FunctionInterface f) {
		double x = 10;
		double y = 4;
		
		return f.apply(x, y);
		
	}
	public static void main(String[] args) {
		double result = calc((x, y) -> (x/y) );
		System.out.println("result: " + result);

	}
}
