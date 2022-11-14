package ch15_Collection_Q07_10;

import java.util.ArrayList;
import java.util.List;

public class Q07_BoardDao {
		public List<Q07_Board> getBoardList() {
			List<Q07_Board> list = new ArrayList<Q07_Board>();
			list.add(new Q07_Board("제목1", "내용1"));
			list.add(new Q07_Board("제목2", "내용2"));
			list.add(new Q07_Board("제목3", "내용3"));
			return list;
		}
	}
