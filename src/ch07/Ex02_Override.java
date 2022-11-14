package ch07;

public class Ex02_Override {

	public static void main(String[] args) {
		Ex02_Parent parent = new Ex02_Parent();
		parent.parentInt =10;
		parent.parentMethod();  //Parent: 10
		
		Ex02_Child child = new Ex02_Child();
		child.childInt = 200;
		child.parentInt = 300;
		child.parentMethod(); // child: 300
		
		child.childmethod();  //Parent: 300(이게 나타나는 이유는 super를 통해 상속 받았기 때문)
							  // child: 200

	}

}
