package ch06;

public class Ex22_GetterSetter { // Object
	private int number;
	private boolean success;
	private boolean acceptable;
	private String name;

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) { // number는 100이상 1000 미만
		if (number >= 100 && number < 1000) {
			this.number = number;
			success = true;
			return;
		}
		success = false;
	}

	public boolean isSuccess() { // number가 수정되면 true 아니면 false를 리턴
		return success;
	}

	public boolean isAcceptable() { // boolean인 경우에는 is 로 시작함
		return acceptable;
	}

	public void setAcceptable(boolean acceptable) {
		this.acceptable = acceptable;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override // 부모에게서 상속받은 것들을 재정의 하는 기능..
	// 상속이 없는 경우 객체의 조상격인 Object에서 받아옴
	// 컴파일러에게 오버라이드된 것을 알리며 문법확인 주의하길 알리는 어노테이션
	public String toString() {
		return "Ex22_GetterSetter [number=" + number + ", success=" + success + ", acceptable=" + acceptable + ", name="
				+ name + "]";
	}

}
