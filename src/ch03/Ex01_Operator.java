package ch03;
/**
 *연산자(Operator) 
 * (/*에서 * 하나가 더 붙으면 공식 설명문 같은 의미)
 */
public class Ex01_Operator {

	public static void main(String[] args) {
		int a = 3;
		int b = a++;		// post increment
		System.out.printf("a = %d, \tb = %d\n", a, b);
		// d는 decimal, f 는 float를 의미, \n, %n은 new line 의미, \t는 tab을 의미
		int c = ++a;		// pre increment
		System.out.printf("a = %d, c = %d%n", a, c);
				
		String s = (a % 2 == 0) ? "짝수" : "홀수";	//3항 연산자
		System.out.println(a + "은/는 " + s);
		
		int sum = 0;
		sum += 1;
		sum += 2;
		System.out.println(sum);
		//단순 연산
		sum = 0;
		for(int i=1; i<=10; i++)
			sum += i;
		System.out.println(sum);
		
		short s1 = 1;
		short ss = (short)-s1; //int 타입이 된걸 돌려주는 방법,,? 이해가 안됐음.

		
	}

}
