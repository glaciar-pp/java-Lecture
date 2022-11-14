package ch07;

public class Ex01_Main {

	public static void main(String[] args) {
		Ex01_Parent parent = new Ex01_Parent(); //객체 생성
		Ex01_Child child = new Ex01_Child(); //객체, 근데 부모기반으로 만들어진 것이니 부모는 두번째 생성
		
		parent.parentInt = 5;
		parent.parentMethod();
		
		child.childInt = 10;
		child.childMethod();
		
		// 자식은 자식이 갖고있는 것 뿐만 아니라 부모에게 상속받은 기능까지 사용가능해짐
		child.parentInt = 20;  // 자식이 부모의 필드값 수정 가능
		child.parentMethod();  // 자식이 부모의 메소드 사용 가능
		
		Ex01_Child child2 = new Ex01_Child(200);
		child2.parentMethod();
		// * 2를 해놔서 두배로 바뀜
	}

}
