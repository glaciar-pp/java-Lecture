package ch11.sec18_dataTime;

import java.util.Objects;

public class Q01_No5Student {

	private String studentNum;

	Q01_No5Student(String studentNum) {
		super();
		this.studentNum = studentNum;
	}

	public String getStudentNum() {
		return studentNum;
	}

	public void setStudentNum(String studentNum) {
		this.studentNum = studentNum;
	}

	@Override
	public int hashCode() {
		return Integer.parseInt(studentNum);
//		return Objects.hash(studentNum);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Q01_No5Student other = (Q01_No5Student) obj;
		return Objects.equals(studentNum, other.studentNum);
	}

}
