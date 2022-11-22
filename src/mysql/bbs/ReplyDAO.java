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
/**
 * - 댓글의 특성상 전체 댓글을 보려고 하지않고 
 * 특정 게시글의 댓글을 보려하는 점 고려해야함
 *
 */
		
public class ReplyDAO {
	private String host;
	private String user; 
	private String password;
	private String database;
	private String port;

	//정보 가져오기
	ReplyDAO() {
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
	
	//삭제
	public void deleteReply(int rid) {
		Connection conn = myGetConnection();
		String sql = "DELETE FROM reply WHERE rid=?;";
		try {
			PreparedStatement pStmt = conn.prepareStatement(sql);
			pStmt.setInt(1, rid);

			pStmt.executeUpdate();
			pStmt.close();
			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	
	
	//업데이트
public void updateReply(Reply r) {
	Connection conn = myGetConnection();
	String sql = "UPDATE reply SET rcontent=?, regTime=?, isMine=?, uid=?, bid=? WHERE rid=?;";
	try {
		PreparedStatement pStmt = conn.prepareStatement(sql);
		
		pStmt.setString(1, r.getRcontent());
		pStmt.setString(2, r.getRegTime().toString());
		pStmt.setInt(3, r.getIsMine());
		pStmt.setString(4, r.getUid());
		pStmt.setInt(5, r.getBid());
		pStmt.setInt(6, r.getRid());
		
		pStmt.executeUpdate();
		pStmt.close();
		conn.close();
	} catch (Exception e) {
		e.printStackTrace();
	}

}
	
	//가져오기
	public Reply getReply(int rid) {
		Connection conn = myGetConnection();
		String sql = "SELECT * FROM reply WHERE rid=?;";
		Reply r = new Reply();
		try {
			PreparedStatement pStmt = conn.prepareStatement(sql);
			pStmt.setInt(1, rid);
			
			ResultSet rs = pStmt.executeQuery();
			while (rs.next()) {
				r.setRid(rs.getInt(1));	
				r.setRcontent(rs.getString(2));
				r.setRegTime(LocalDateTime.parse(rs.getString(3)));
				r.setIsMine(rs.getInt(4));
				r.setUid(rs.getString(5));
				r.setBid(rs.getInt(6));
				
			}
				rs.close();
				pStmt.close();
				conn.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
			return r;
		}

	//목록보기
	public List<Reply> listReply() {
		Connection conn = myGetConnection();
		String sql = "SELECT * FROM reply ORDER BY rid DESC;";
		List<Reply> list = new ArrayList<>();
		try {
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			while (rs.next()) {
				Reply r = new Reply();
				r.setRid(rs.getInt(1));
				r.setRcontent(rs.getString(2));
				r.setRegTime(LocalDateTime.parse(rs.getString(3)));
				r.setIsMine(rs.getInt(4));
				r.setUid(rs.getString(5));
				r.setBid(rs.getInt(6));

				list.add(r);
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
	public void insertReply(Reply r) {
		Connection conn = myGetConnection();
		String sql = "INSERT INTO reply VALUES (?, ?, ?, DEFAULT, ?, ?, ?);";
		try {
			PreparedStatement pStmt = conn.prepareStatement(sql);
			
			pStmt.setInt(6, r.getRid());
			pStmt.setString(1, r.getRcontent());
			pStmt.setString(2, r.getRegTime().toString());
			pStmt.setInt(3, r.getIsMine());
			pStmt.setString(4, r.getUid());
			pStmt.setInt(5, r.getBid());
			
			pStmt.executeUpdate();
			pStmt.close();
			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}
}

