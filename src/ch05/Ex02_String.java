package ch05;

public class Ex02_String {

	public static void main(String[] args) {
		String s1 = "홍길동"; // 리터럴로 작성한 "홍길동"은 공통으로 사용됨
		String s2 = "홍길동";
		System.out.println(s1 == s2); // true, 동일한 기억장소를 가리킴

		String s3 = new String("홍길동"); // new를 붙여 만드는것을 생성자 라고 하며,
		String s4 = new String("홍길동"); // 생성자로 만든 "홍길동"은 다른 장소에 보관된다.
		System.out.println(s3 == s4); //false, 다른 기억장소를 가리킴
		
		//값이 같은지를 물어볼 경우에는 equals() method를 사용하자.
		System.out.println(s1.equals(s3));
		System.out.println(s1.equals(s4));
		
		//. 찍고 보면 다양한 식이 있다..나중에 쓸 것임! 그때까지 아자자자

	}

}
