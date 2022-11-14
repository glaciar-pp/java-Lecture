package ch15_Collection_Q07_10;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Q09_HashMap {

	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();
		map.put("blue", 96);
		map.put("hong", 86);
		map.put("white", 92);
		
		Set<String> keySet = map.keySet();
		for (String s : keySet)
			System.out.println(s + ": " + map.get(s));
		System.out.println();
		
		int maxScore = 0;
//		Entry<String, Integer> entry : map.entrySet()
		
		
		int minScore = 0;
		
		String name = null;
		
		
	}

}
