package ch10;

public class Exerxise {

	public static void main(String[] args) {
		int[]a=new int[5];
		try {
			System.out.println(a[4]);  //문제발생 가능성이 높은 곳에 suround with에 Catch~기능 사용
		} catch (Exception e) {
			e.printStackTrace(); 
			// 에러...즉 예외가 발생했을때 처리절차가 따로 있는게 아니라면 이 문장을 제일 많이 씀
			// 프로그램이 죽지 않게 하기 위해서..삶을 위해서 ㅠㅠㅎ
		}
		System.out.println("출력합니다.");

	}

}
