package mysql.baseballTeam;

import java.util.List;

public class PlayerInfo {

	public static void main(String[] args) {
		BaseballDAO dao = new BaseballDAO();
		dao.createTable();

//		dao.insertPlayer(new Player_DTO(1, "임찬규", "투수", "1992-11-20", 185, 0));
		dao.insertPlayer(new PlayerDTO(48, "송승기", "투수", "2002-04-10", 181, 0));
		dao.insertPlayer(new PlayerDTO(67, "채지선", "투수", "1995-07-11", 180, 0));
		dao.insertPlayer(new PlayerDTO(12, "김기연", "포수", "1997-09-07", 178, 0));
		dao.insertPlayer(new PlayerDTO(27, "유강남", "포수", "1992-07-15", 182, 0));
		dao.insertPlayer(new PlayerDTO(30, "허도환", "포수", "1984-07-31", 176, 0));
		dao.insertPlayer(new PlayerDTO(2, "이상호", "내야수", "1989-02-05", 180, 0));
		dao.insertPlayer(new PlayerDTO(10, "오지환", "내야수", "1990-03-12", 186, 0));
		dao.insertPlayer(new PlayerDTO(66, "송찬의", "내야수", "1999-02-20", 182, 0));
		dao.insertPlayer(new PlayerDTO(17, "박해민", "외야수", "1990-02-24", 180, 0));
		dao.insertPlayer(new PlayerDTO(22, "김현수", "외야수", "1988-01-12", 188, 0));
		dao.insertPlayer(new PlayerDTO(58, "한석현", "외야수", "1994-05-17", 181, 0));

		List<PlayerDTO> list = dao.getPlayers();
		for (PlayerDTO p : list)
			System.out.println(p);
	}
}
