package sub3;
/*
 * 날짜 : 2023/07/11
 * 이름 : 이황성
 * 내용 : PreparedStatment 실습하기
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class PreparedUpdateTest {
	
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
			
			// 3 SQL실행 객체 생성
			String sql = "UPDATE `user1` SET `hp`=?, `age`=? WHERE `uid`=?";
			PreparedStatement psmt = conn.prepareStatement(sql);
			psmt.setString(1, "010-1234-1111");
			psmt.setInt(2, 25);
			psmt.setString(3, "j101");
			
			// 4 SQL 실행
			psmt.executeUpdate();
			
			// 5 결과처리(Select)
			
			// 6 연결해제
			psmt.close();
			conn.close();
			
			
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("Update 완료...");
	}
}
