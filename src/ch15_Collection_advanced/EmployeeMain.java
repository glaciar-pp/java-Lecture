package ch15_Collection_advanced;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class EmployeeMain {

	public static void main(String[] args) {
		// TreeSet
		Set<Employee> ts = new TreeSet<>();
		ts.add(new Employee(123, "김자바", Position.부장, LocalDate.of(1998, 1, 1)));
		ts.add(new Employee(133, "강자바", Position.부장, LocalDate.of(2000, 8, 1)));
		ts.add(new Employee(143, "은전자", Position.차장, LocalDate.of(2003, 1, 1)));
		ts.add(new Employee(163, "이마이", Position.차장, LocalDate.of(2009, 10, 1)));
		ts.add(new Employee(153, "정마이", Position.과장, LocalDate.of(2008, 1, 1)));
		ts.add(new Employee(203, "노전자", Position.과장, LocalDate.of(2018, 8, 11)));
		ts.add(new Employee(173, "권표준", Position.대리, LocalDate.of(2022, 1, 1)));
		ts.add(new Employee(193, "유표준", Position.대리, LocalDate.of(2017, 4, 1)));
		ts.add(new Employee(183, "천디비", Position.사원, LocalDate.of(2016, 1, 1)));
		ts.add(new Employee(213, "홍정부", Position.사원, LocalDate.of(2019, 1, 1)));

		// 다음 두 줄의 결과는?
		ts.add(new Employee(513, "한정부", Position.사원, LocalDate.of(2019, 1, 1)));
		// 제외됨
		ts.add(new Employee(153, "정마이", Position.과장, LocalDate.of(2010, 1, 1)));
		// 포함됨

		for (Employee emp : ts)
			System.out.println(emp); // 직급을 기준으로 배치됨
		System.out.println();

		// HashSet
		Set<Employee> hs = new HashSet<>();
		hs.add(new Employee(123, "김자바", Position.부장, LocalDate.of(1998, 1, 1)));
		hs.add(new Employee(133, "강자바", Position.부장, LocalDate.of(2000, 8, 1)));
		hs.add(new Employee(143, "은전자", Position.차장, LocalDate.of(2003, 1, 1)));
		hs.add(new Employee(163, "이마이", Position.차장, LocalDate.of(2009, 10, 1)));
		hs.add(new Employee(153, "정마이", Position.과장, LocalDate.of(2008, 1, 1)));
		hs.add(new Employee(203, "노전자", Position.과장, LocalDate.of(2018, 8, 11)));
		hs.add(new Employee(173, "권표준", Position.대리, LocalDate.of(2022, 1, 1)));
		hs.add(new Employee(193, "유표준", Position.대리, LocalDate.of(2017, 4, 1)));
		hs.add(new Employee(183, "천디비", Position.사원, LocalDate.of(2016, 1, 1)));
		hs.add(new Employee(213, "홍정부", Position.사원, LocalDate.of(2019, 1, 1)));

		// 다음 두 줄의 결과는?
		ts.add(new Employee(513, "한정부", Position.사원, LocalDate.of(2019, 1, 1)));
		// 포함됨(해쉬셋, 아이디와 이름..키값이 홍정부와 다르기 때문에)
		ts.add(new Employee(153, "정마이", Position.과장, LocalDate.of(2010, 1, 1)));
		// 제외됨(값 중 이름이 겹침)

		for (Employee emp : hs)
			System.out.println(emp); // 기준없이 배치됨
		System.out.println();

		// Stream을 이용화면 순서도 조정할 수 있음!(입사일자 기준으로 배치해봄)
		hs.stream()
		.sorted((o1, o2) -> o1.getJoinDate().compareTo(o2.getJoinDate()))
		.forEach(s -> System.out.println(s));
		System.out.println();
		
		// Stream을 이용화면 순서도 조정할 수 있음!(이름 기준으로 배치해봄)
				hs.stream()
				.sorted((o1, o2) -> o1.getName().compareTo(o2.getName()))
				.forEach(s -> System.out.println(s));
		
	}

}
