package ch14_lambda_Q08;

public class Q08_StudentAvgMain {
	private static Q08_Student[] students = {
			new Q08_Student("홍길동", 90, 96),
			new Q08_Student("신용권", 95, 93)
	};

	public static double avg(Q08_AvgInterface<Q08_Student> f) {
		double sum = 0;
		for (Q08_Student student : students)
			sum += f.apply(student);
		return sum / students.length;
		
	}
	//내가 쓴건 캐스팅이 너무 많고...이미 더블로 기능을 줬기 때문에 더블로 수정하는게 나음
//	public static double avg(Q08_AvgInterface<Q08_Student> f) {
//		int sum = 0;
//		for (Q08_Student student : students)
//			sum += f.apply(student);
//		double avg = (double) sum / students.length;
//		return avg;
//	}
	
	
	public static void main(String[] args) {
		double engAvg = avg(t -> t.getEnglishScore());
		System.out.println("영어 평균 점수 " + engAvg);

		double mathAvg = avg(t -> t.getMathScore());
		System.out.println("수학 평균 점수 " + mathAvg);
	}

}
