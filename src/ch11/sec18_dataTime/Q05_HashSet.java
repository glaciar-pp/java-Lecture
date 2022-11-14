package ch11.sec18_dataTime;

import java.util.HashSet;

public class Q05_HashSet {

	public static void main(String[] args) {
		HashSet<Q01_No5Student> hashSet = new HashSet<Q01_No5Student>();
		//Student를 저장하는 hashSet 생성
		
		//Student 저장
		hashSet.add(new Q01_No5Student("1"));
		hashSet.add(new Q01_No5Student("1"));
		hashSet.add(new Q01_No5Student("2"));
		
		//저장된 학생 수 출력
		System.out.println("저장된 학생 수: "+ hashSet.size());
		for(Q01_No5Student st: hashSet)
			System.out.println(st.hashCode());

	}

}
