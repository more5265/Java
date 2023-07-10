package sub2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class DeleteTest {
	public static void main(String[] args) {
		
		
		
		// DB
		String host = "jdbc:mysql://127.0.0.1:3306/userdb";
		String user = "root";
		String pass = "1234";
		
		
		try {
			//JDBC 드라이버 로드
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//데이터베이스 접속
			Connection conn = DriverManager.getConnection(host, user, pass);
			
			//SQL실행 객체 생성
			Statement stmt = conn.createStatement();
			
			//SQL실행
			String sql = "DELETE FROM `user1` WHERE `uid` = 'j101'";
			stmt.executeUpdate(sql);
			
			//결과처리 (스킵, select만)
			
			//연결해제
			conn.close();
			stmt.close();
			
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		
		System.out.println("Delete 완료...");
		
	}

}
