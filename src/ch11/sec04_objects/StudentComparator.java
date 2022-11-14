package ch11.sec04_objects;

import java.util.Comparator;

public class StudentComparator implements Comparator<Student>{
	//소팅해서 정렬해서 배열을 넣어줄 수 있음.Comparator 또는 Comparable기능

	@Override
	public int compare(Student o1, Student o2) {
//		if(o1.sno < o2.sno)
//			return -1;
//		else if (o1.sno == o2.sno)
//			return 0;
//		else
//			return 1;
		return Integer.compare(o1.sno, o2.sno);
		
//		return o1.name.compareTo(o2.name);	이렇게도 사용 가능함!
				}
}
