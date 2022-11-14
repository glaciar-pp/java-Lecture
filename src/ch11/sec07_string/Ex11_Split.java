package ch11.sec07_string;

import java.util.Arrays;

public class Ex11_Split { // & Join

	public static void main(String[] args) {
		//2022-11-02
		String fruits = "감, 배, 밤, 귤";
		String[] fruitArr = fruits.split(",");
		System.out.println(Arrays.toString(fruitArr));

		String fruits2 = "사과, 대추. 망고: 포도";
		String[] fruitArr2 = fruits2.split("[,|.|:] "); //정규표현식
		System.out.println(Arrays.toString(fruitArr2));
		
		//2022-11-03
		//시스템 루트 같이 긴 정보를 편하게 잘라내 구분할 수 있는 방법
		String paths = System.getenv("PATH");
		System.out.println(paths);
		String[] pathArr = paths.split(";");
//		for(String path : pathArr)
//			System.out.println(path);
		String pathStr = String.join("\n", pathArr);
		System.out.println(pathStr);

	}

}
