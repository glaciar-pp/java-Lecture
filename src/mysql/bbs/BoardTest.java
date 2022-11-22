package mysql.bbs;

import java.util.List;



public class BoardTest {
	static BoardDAO dao = new BoardDAO();

	public static void main(String[] args) {
		dao.incrementViewCount(0);
	
		
		// 목록 보기
		List<Board> list = dao.listBoard();
		for (Board b : list)
			System.out.println(b);

		List<Bbs> bbsList = dao.getBbsList(0);
		for (Bbs b : bbsList)
			System.out.println(b);
	}
}
