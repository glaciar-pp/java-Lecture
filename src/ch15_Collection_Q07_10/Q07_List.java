package ch15_Collection_Q07_10;

import java.util.List;

public class Q07_List {

	public static void main(String[] args) {
		BoardDao dao = new BoardDao();
		List<Board> list = dao.getBoardList();
		for (Board board : list) {
			System.out.println(board.getTitle() + "-" + board.getContent());
		}
	}
}
