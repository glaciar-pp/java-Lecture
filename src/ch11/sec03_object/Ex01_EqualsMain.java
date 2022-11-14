package ch11.sec03_object;

public class Ex01_EqualsMain {

	public static void main(String[] args) {
		Member member1 = new Member("hong", "홍길동");
		Member member2 = new Member("hong", "홍자바");
		Member member3 = new Member("hong", "홍길동");

		// Member에서 equals method를 재정의 하기 이전
		System.out.println(member1.equals(member3));	//아래 결과와 동일, F
		System.out.println(member1 == member3);			//참조하는 주소가 같으냐를 비교, F

		// Member에서 equals method를 id만 같으면 true라고 한 경우
		System.out.println(member1.equals(member3));
		System.out.println(member1.equals(member2));

		// Member에서 equals method를 id, name 둘다 같으면 true라고 한 경우
		System.out.println(member1.equals(member3));
		System.out.println(member1.equals(member2));
		
		// 이걸 한 이유는 정의에 따라 결과가 달라지기 때문!
		//객체의 순서...즉 서열 같은걸 정하거나 할때 재정의를 함
		
		System.out.println(member1);
		System.out.println(member2);
	}

}
