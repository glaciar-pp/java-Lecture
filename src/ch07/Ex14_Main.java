package ch07;
/**
 * 
 * 강제변환(Casting)
 */
public class Ex14_Main {

	public static void main(String[] args) {
		Ex14_Parent parent = new Ex14_Parent();
		Son son = new Son();
		Daughter daughter = new Daughter();

		parent = son;
		parent.parentMethod();

		parent = daughter;
		parent.parentMethod();
		
/* 강제 타입 변환 - 올바르지 못한 방법
		daughter = (Daughter) parent;  //강제 타입 변환(casting)
		daughter.daughterMethod();
*/
		//강제 타입 변환 - 올바른 방법
		if(parent instanceof Daughter) {  //true
			daughter = (Daughter)parent;
			daughter.daughterMethod();
		}
		if(parent instanceof Son) {  //false
			son = (Son)parent;
			son.sonMethod();
		}

	}

}