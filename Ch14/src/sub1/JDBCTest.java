package sub1;

import java.sql.Connection;
import java.sql.DriverManager;

/*
 * 날짜 : 2023/07/10
 * 이름 : 이황성
 * 내용 : JDBC 프로그래밍 실습하기
 * 
 * JDBC (Java DataBase Connectivity)
 * 	- Java에서 데이트베이스와 연결을 위한 기술표준
 * 	- Java는 기본적으로 Java.sql 패키지를 포함하고 별도로 DBMS에 맞는 드라이버 설정
 */
public class JDBCTest {
	
	public static void main(String[] args) {
		
		// DB정보
		String host = "jdbc:mysql://127.0.0.1:3306/userdb";
		String user = "root";
		String pass = "1234";
		

		try {
			// JDBC 드라이버 로드
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			// 데이터베이스 접속
			Connection conn = DriverManager.getConnection(host, user, pass);
			
			if(conn !=null) {
				System.out.println("데이터베이스 접속 성공!");
			}else {
				System.out.println("데이터베이스 접속 실패!");
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
	}
}
