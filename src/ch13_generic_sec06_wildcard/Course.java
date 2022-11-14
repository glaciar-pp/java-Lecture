package ch13_generic_sec06_wildcard;

public class Course<T> {
	private String name;
	private T[] students;

	public Course(String name, int capacity) {
		this.name = name;
		students = (T[]) (new Object[capacity]);
	}

	public String getName() {
		return name;
	}

	public T[] getStudents() {
		return students;
	}

	public void add(T t) {
		for (int i = 0; i < students.length; i++) {
			if (students[i] == null) {
				students[i] = t;
//			break;  //둘중 뭐든 상관 없을듯 한데 리턴이 나아보인다고 하심
				return;
			}
		}

	}
}
