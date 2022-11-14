package ch15_Collection_Q07_10;

import java.util.ArrayList;
import java.util.List;

public class BoardDao {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();

		for (int i = 1; i <= 3; i++) {
			list.add("제목" + i + "-" + "내용" + i);

		}

	}

}
