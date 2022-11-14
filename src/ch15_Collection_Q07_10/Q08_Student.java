package ch15_Collection_Q07_10;

import java.util.Objects;

import ch15_Collection.sec03_hashSet.Member;

public class Q08_Student {
	public int studentNum;
	public String name;

	public Q08_Student(int studentNum, String name) {
		super();
		this.studentNum = studentNum;
		this.name = name;
	}

	public int getStudentNum() {
		return studentNum;
	}

	public void setStudentNum(int studentNum) {
		this.studentNum = studentNum;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public int hashCode() {
		
		return studentNum;
		
	}

	@Override
	public boolean equals(Object obj) {
			if (!(obj instanceof Q08_Student))
				return false;

			Q08_Student student = (Q08_Student) obj;
			return  studentNum == student.studentNum;
		
	}
	
	
}
