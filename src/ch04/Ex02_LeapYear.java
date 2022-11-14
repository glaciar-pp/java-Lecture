package ch04;

public class Ex02_LeapYear {

	public static void main(String[] args) {
		/*4의 배수면 윤년
		 * 100의 배수면 평년
		 * 400의 배수면 윤년
		 * 1996, 2000, 1900, 2022 
		 */

		/*int number = 1996;
		String year1;
		if (number % 4 == 0 && number % 400 == 0)
			year1 = "윤년";
		else if (number % 100 == 0)
			year1 = "평년";
		else
			year1 = "해당없음";
		System.out.println(number + "년은 " + year1 + " 입니다.");
		
		// 해답(다른 답도 있다고 하심)
		int year2 = 1996;
		if (year2 % 400 == 0)
			System.out.println(year2 + "년은 윤년입니다.");
		else if (year2 % 4 == 0 && year2 % 100 != 0)
			System.out.println(year2 + "년은 윤년입니다.");
		else
			System.out.println(year2 + "년은 평년입니다.");*/
		
/*		private static String leapYear(int year) {
			if (year % 400 == 0)
				return "윤년";
			if (year % 400 == 0 && year % 100 != 0)
				return "윤년";
			return "평년";] */
					// 하나도 이해 못함. 식 완성도 안되고 있음
		int year = 1900;
		if (year % 400 == 0)
			System.out.println(year + "년은 윤년입니다");
		else if (year % 4 == 0 && year % 100 != 0)
			System.out.println(year + "년은 윤년입니다");
		else
			System.out.println(year + "년은 평년입니다");
		// FizzBuzz듣고 만들어봄!! 으아!!!!!
		}
		
			
	}
