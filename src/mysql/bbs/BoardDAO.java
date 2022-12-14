package mysql.bbs;

import java.io.FileInputStream;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

public class BoardDAO {
	private String host;
	private String user;
	private String password;
	private String database;
	private String port;

	//정보 가져오기
	BoardDAO() {
		try {
			InputStream is = new FileInputStream("/workspace/mysql.properties");
			Properties props = new Properties();
			props.load(is);
			is.close();
			host = props.getProperty("host");
			user = props.getProperty("user");
			password = props.getProperty("password");
			database = props.getProperty("database");
			port = props.getProperty("port", "3306");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
		
	//연결하기
	public Connection myGetConnection() {
		Connection conn = null;
		try {
			String connStr = "jdbc:mysql://" + host + ":" + port + "/" + database;
			conn = DriverManager.getConnection(connStr, user, password);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return conn;
		
	}
	//부가기능 - 카운트 증가
	public void incrementViewCount(int bid) {
		Connection conn = myGetConnection();
		String sql = "UPDATE board SET viewCount=viewCount+1 WHERE bid=?;"; //올리려는 게시글 번호
			try {
				PreparedStatement pStmt = conn.prepareStatement(sql);
				pStmt.setInt(1, bid);

				pStmt.executeUpdate();
				pStmt.close();
				conn.close();
			} catch (Exception e) {
				e.printStackTrace();
			}

	}
	
	//부가기능2-게시글 갯수 확인해서 목록 넘겨주는 기능
	public int getCount() {
		Connection conn = myGetConnection();
		String sql = "SELECT COUNT(*) FROM board;";
		int count = 0;
		try {
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			while (rs.next()) {
				count = rs.getInt(1);
			}
			rs.close();
			stmt.close();
			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return count;
		
	} 
	//부가기능 3, 정제된 게시판 목록 띄우기
	public List<Bbs> getBbsList(int offSet){
		Connection conn = myGetConnection();
		String sql = "SELECT b.bid, b.btitle, u.uname, b.modTime b.viewCount,b.replyCount"
				+ "	FROM board AS b JOIN users AS u ON b.uid=u.uid"
				+ "	LIMIT 10 OFFSET ?;";
		List<Bbs> list = new ArrayList<>();
		try {
			PreparedStatement pStmt = conn.prepareStatement(sql);
			pStmt.setInt(1, offSet);
			ResultSet rs = pStmt.executeQuery();
			while (rs.next()) {
				Bbs b = new Bbs();
				b.setBid(rs.getInt(1));
				b.setBtitle(rs.getString(2));
				b.setUname(rs.getString(3));
				b.setModTime(LocalDateTime.parse(rs.getString(4).replace(" ", "T")));
				b.setViewCount(rs.getInt(5));
				b.setReplyCount(rs.getInt(6));
				list.add(b);
			}
			rs.close();
			pStmt.close();
			conn.close();

		} catch (Exception e) {
			e.printStackTrace();
		}

		return list;

	}
	
	//부가기능은 여기까지
	
	//삭제
	public void deleteBoard(int bid) {
		Connection conn = myGetConnection();
		String sql = "DELETE FROM Board WHERE bid=?;";
		try {
			PreparedStatement pStmt = conn.prepareStatement(sql);
			pStmt.setInt(1, bid);

			pStmt.executeUpdate();
			pStmt.close();
			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	
	
	//업데이트
public void updateBoard(Board b) {
	Connection conn = myGetConnection();
	String sql = "UPDATE board SET btitle=?, bcontent=?, uid=?, modTime=NOW(), viewCount=?, replyCount=? WHERE bid=?";
	try {
		PreparedStatement pStmt = conn.prepareStatement(sql);
		pStmt.setString(1, b.getBtitle());
		pStmt.setString(2, b.getBcontent());
		pStmt.setString(3, b.getUid());
		pStmt.setInt(5, b.getViewCount());
		pStmt.setInt(6, b.getReplyCount());
		pStmt.setInt(7, b.getBid());
		
		pStmt.executeUpdate();
		pStmt.close();
		conn.close();
	} catch (Exception e) {
		e.printStackTrace();
	}
}
	
	// 보드 정보 확인하기
	public Board getBoard(int bid) {
		Connection conn = myGetConnection();
		String sql = "SELECT * FROM board WHERE bid=?;";
		Board b = new Board();
		try {
			PreparedStatement pStmt = conn.prepareStatement(sql);
			pStmt.setInt(1, bid);

			ResultSet rs = pStmt.executeQuery();
			while (rs.next()) {
				b.setBid(rs.getInt(1));
				b.setBtitle(rs.getString(2));
				b.setBcontent(rs.getString(3));
				b.setUid(rs.getString(4));
				b.setModTime(LocalDateTime.parse(rs.getString(5).replace(" ", "T")));
				b.setViewCount(rs.getInt(6));
				b.setReplyCount(rs.getInt(7));
			}
			rs.close();
			pStmt.close();
			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return b;
	}

	//목록보기
	public List<Board> listBoard() {
		Connection conn = myGetConnection();
		String sql = "SELECT * FROM board ORDER BY bid DESC;";
		List<Board> list = new ArrayList<>();
		try {
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			while (rs.next()) {
				Board b = new Board();
				b.setBid(rs.getInt(1));
				b.setBtitle(rs.getString(2));
				b.setBcontent(rs.getString(3));
				b.setUid(rs.getString(4));
				b.setModTime(LocalDateTime.parse(rs.getString(5).replace(" ", "T")));
				b.setViewCount(rs.getInt(6));
				b.setReplyCount(rs.getInt(7));
				
				list.add(b);
			}
			rs.close();
			stmt.close();
			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}		
		return list;
	}
	
	//등록하기
	public void insertBoard(Board b) {
		Connection conn = myGetConnection();
		String sql = "INSERT INTO Board VALUES (?, ?, ?, ?, DEFAULT, ?, ?);";
		try {
			PreparedStatement pStmt = conn.prepareStatement(sql);
			pStmt.setInt(1, b.getBid());
			pStmt.setString(2, b.getBtitle());
			pStmt.setString(3, b.getBcontent());
			pStmt.setString(4, b.getUid());
			pStmt.setInt(6, b.getViewCount());
			pStmt.setInt(7, b.getReplyCount());
			
			pStmt.executeUpdate();
			pStmt.close();
			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}
}