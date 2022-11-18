package mysql.baseballTeam;

import java.io.FileInputStream;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

public class BaseballDAO {
	private String host;
	private String user;
	private String password;
	private String database;
	private String port;

	// 정보 가져오기
	BaseballDAO() {
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

	//연결
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

	//테이블 생성
	public void createTable() {
		Connection conn = myGetConnection();
	String sql = "" +
					"CREATE TABLE if NOT EXISTS baseballTeam("
					+ "backNo INT PRIMARY KEY,"
					+ "`name` VARCHAR(8) NOT NULL,"
					+ "`Position` VARCHAR(4) NOT NULL,"
					+ "birthday DATE,"
					+ "height INT,"
					+ "isDeleted  INT DEFAULT 0"
					+ ");";
	try {
		Statement stmt = conn.createStatement();
		
		stmt.execute(sql);
		stmt.close();
		conn.close();
	} catch (Exception e) {
		e.printStackTrace();
	}
}

	// 선수목록
	public List<PlayerDTO> getPlayers() {
		Connection conn = myGetConnection();
		List<PlayerDTO> list = new ArrayList<>();
		String sql = "SELECT * FROM baseballteam WHERE isDeleted=0;";
		try {
			Statement stmt = conn.createStatement();
			
			// Select 실행
			ResultSet rs = stmt.executeQuery(sql);
			while (rs.next()) {
				PlayerDTO p = new PlayerDTO();
				p.setBackNo(rs.getInt(1));
				p.setName(rs.getString(2));
				p.setPosition(rs.getString(3));
				p.setBirthday(LocalDate.parse(rs.getString(4)));
				p.setHeight(rs.getInt(5));
				p.setIsDeleted(rs.getInt(6));
				
				list.add(p);
			}
			rs.close();
			stmt.close();
			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}

	//등록에 사용
	public PlayerDTO getPlayer(int backNo) {
		Connection conn = myGetConnection();
		String sql = "SELECT * FROM baseballTeam WHERE backNo=?;";
		PlayerDTO p = new PlayerDTO();
		try {
			PreparedStatement pStmt = conn.prepareStatement(sql);
			pStmt.setInt(1, backNo);
			
			// Select 실행
			ResultSet rs = pStmt.executeQuery();
			while (rs.next()) {
				p.setBackNo(rs.getInt(1));
				p.setName(rs.getString(2));
				p.setPosition(rs.getString(3));
				p.setBirthday(LocalDate.parse(rs.getString(4)));
				p.setHeight(rs.getInt(5));
				p.setIsDeleted(rs.getInt(6));
			}
			rs.close();
			pStmt.close();
			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return p;
	}
	
	// 선수등록
	public void insertPlayer(PlayerDTO p) {
		Connection conn = myGetConnection();
		String sql = "INSERT INTO baseballteam VALUES (?,?,?,?,?, DEFAULT);";
		try {
			PreparedStatement pStmt = conn.prepareStatement(sql);
			pStmt.setInt(1, p.getBackNo());
			pStmt.setString(2, p.getName());
			pStmt.setString(3, p.getPosition());
			pStmt.setString(4, p.getBirthday().toString());
			pStmt.setInt(5, p.getHeight());
			
			pStmt.executeUpdate();
			pStmt.close();
			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	//선수정보 수정
	public void upatePlayer(PlayerDTO p) {
		Connection conn = myGetConnection();
		String sql = "UPDATE baseballteam SET name=?, position=?,  birthday=?, height=?, isDeleted=? WHERE backNo=?;";
		try {
			PreparedStatement pStmt = conn.prepareStatement(sql);
			pStmt.setString(1, p.getName());
			pStmt.setString(2, p.getPosition());
			pStmt.setString(3, p.getBirthday().toString());
			pStmt.setInt(4, p.getHeight());
			pStmt.setInt(5, p.getIsDeleted());
			pStmt.setInt(6, p.getBackNo());
			
			// Update 실행
			pStmt.executeUpdate();
			pStmt.close();
			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	// 선수방출
	public void releasePlayer(int backNo) {
		Connection conn = myGetConnection();
		String sql = "UPDATE baseballteam SET isDeleted=1 WHERE backNo=?;";
		try {
			PreparedStatement pStmt = conn.prepareStatement(sql);
			pStmt.setInt(1, backNo);

			// Delete 사항 Update 실행
			// isDeleted 적용
			pStmt.executeUpdate();
			pStmt.close();
			conn.close(); 
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
