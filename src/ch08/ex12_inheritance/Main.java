package ch08.ex12_inheritance;

public class Main {

	public static void main(String[] args) {
		InterfaceC ic = new ImplememtClass();
		ic.methodA();
		ic.methodB();
		ic.methodC();

		Misc misc = new Misc();
		misc.methodA();
		misc.methodB();
		misc.methodC();
		misc.methodParent();
		
		ic = misc; //다형성
		ic.methodA();
		ic.methodB();
		ic.methodC();
//		ic.methodParent(); //여기선 Parentmethod가 나오지 않는다. 인터페이스에 있던게 아니니까!
	}

}
