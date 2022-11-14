package ch11.sec07_string;

public class Ex06_Substring {  //이 기능도 정말 많이 사용됨

	public static void main(String[] args) {
		String ssn = "880823-1234567";
		
		String firstPart = ssn.substring(0, 6);
		System.out.println(firstPart);
		
		String secondPart = ssn.substring(7);
		System.out.println(secondPart);
		System.out.println();
		
		//ssn에서 생년월일을 YYYY-MM-DD형태로 표시
		//뒷자리 -앞자리 하면 갯수가 나옴
		String year = ssn.substring(0, 2);
		System.out.println(year);
		String month = ssn.substring(2, 4);
		System.out.println(month);
		String day = ssn.substring(4, 6);
		System.out.println(day);

		char gender = ssn.charAt(7);
		if (gender == '1' || gender == '2')
			year = "19" + year;
		else
			year = "20" + year;

//		System.out.println("생년월일은 19" + year + "-" + month + "-" + day + " 입니다.");
		System.out.println("생년월일은 " + year + "-" + month + "-" + day + " 입니다.");

	}

}
