package test1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

// 2023/07/11
public class PreparedInsertTest {
	
	public static void main(String[] args) {
		
		// DB정보
		String host = "jdbc:mysql://127.0.0.1:3306/userdb";
		String user = "root";
		String pass = "1234";
		
		
		try {
			// 1 JDBC 드라이버 로드
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			// 2 데이터베이스 접속
			Connection conn = DriverManager.getConnection(host, user, pass);
			
			// 3 SQL 실행 객체 생성
			String sql = "INSERT INTO `user1` VALUES (?, ?, ?, ?)";
			PreparedStatement psmt = conn.prepareStatement(sql);
			psmt.setString(1, "j101");
			psmt.setString(2, "홍길동");
			psmt.setString(3, "010-1234-1001");
			psmt.setInt(4, 25);
			
			// 4 SQL 실행
			psmt.executeUpdate();
			
			// 5 결과처리(select)
			
			
			// 6 연결해제
			psmt.close();
			conn.close();
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("insert 완료");
	}
	
}
