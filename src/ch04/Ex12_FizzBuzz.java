package ch04;

public class Ex12_FizzBuzz {

	public static void main(String[] args) {
		// 1~100까지 FizzBuzz
//				int product1 = 0; 틀렸음!
		for (int i = 1; i <= 100; i++)
//				product1 += i; 틀렸음!
		{
			if (i % 3 == 0 && i % 5 == 0)
				System.out.print(i + "FizzBuzz ");
			else if (i % 3 == 0)
				System.out.print(i + "Fizz ");
			else if (i % 5 == 0)
				System.out.print(i + "Buzz ");
			else
				System.out.print(i + " ");
		}
	}

}
