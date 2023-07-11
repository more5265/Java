package sub3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class InsertTest {
	public static void main(String[] args) {
		
		//DB정보
		String host = "jdbc:mysql://127.0.0.1:3306/userdb";
		String user = "root";
		String pass = "1234";
		
		
		try {
			//1. JDBC 드라이버 로드
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//2. 데이터베이스 접속
			Connection conn = DriverManager.getConnection(host, user, pass);
			
			//3. SQL 실행 객체 생성
			Statement stmt = conn.createStatement();
			
			//4. SQL 실행
			String sql = "INSERT INTO `user1` VALUES ('', '')";
			stmt.executeUpdate(sql);
			
			//5. 결과 처리 (SETECT인 경우)
			
			//6. 연결 해제
			conn.close();
			stmt.close();
			

		}catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("Insert 종료");
		
		
		
	}
}
