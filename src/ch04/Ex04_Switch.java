package ch04;

public class Ex04_Switch {

	public static void main(String[] args) {
		int score = 83;
		String grade;
		switch(score / 10) {
		case 10:
		case 9:
			grade = "A";
			break;	// break는 switch 블록을 탈출 의미
		case 8:
			grade = "B";
			break;
		case 7:
			grade = "C";
			break;
		case 6:
			grade = "D";
			break;
		default:	// 위에서 조건이 맞을 경우를 위함
			grade = "f";
		}
		System.out.println(score + "점은 " + grade + "학점 입니다.");
	}

}
