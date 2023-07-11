package test1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class UpdateTest {
	
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
			String sql = "UPDATE `user1` SET ";
				sql += "`hp` = '010-1234-1001', ";
				sql += "`age` = 23 ";
				sql += "WHERE `name` = '김유신'";
			stmt.executeUpdate(sql);
			//5.결과처리(select 일때만)
			//6.연결해제
			conn.close();
			stmt.close();
			

			
		}catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("Update 완료...");
	}
}
