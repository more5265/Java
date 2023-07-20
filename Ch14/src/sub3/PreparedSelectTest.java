package sub3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
/*
 * 날짜 : 2023/07/11
 * 이름 : 이황성
 * 내용 : PreparedStatment 실습하기
 * 
 * PreparedStatement
 * 	- 기존 Statement 보다 향상된 동적 SQL 생성을 위한 Statement
 * 	-  Query Parameter 에 값을 Mapping 시켜 쿼리 실행 (=?에 값을 입력)
 * 
 * 
 * VO (Value Object) 객체
 * 	- 도메인(컬럼값)값을 속성을 갖는 객체
 * 	- 테이블 개체(Entity)를 객체(Object)로 변환할 때 사용하는 객체
 * 	- DTO 구분
 * 
 */




 // VO개체 : 테이블 개체(entity)가 변환되는 객체
class UserVO { 
	private String uid;
	private String name;
	private String hp;
	private int age;
	
	// Alt + Shift S, R
	public String getUid() {
		return uid;
	}
	public void setUid(String uid) {
		this.uid = uid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getHp() {
		return hp;
	}
	public void setHp(String hp) {
		this.hp = hp;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
}
public class PreparedSelectTest {
	
	public static void main(String[] args) {
		
		// DB정보
		String host = "jdbc:mysql://127.0.0.1:3306/userdb";
		String user = "root";
		String pass = "1234";
		
		// 결과처리에 사용할 리스트 생성
		List<UserVO> users = new ArrayList<>();
		
		
		try {
			// 1 JDBC 드라이버 로드
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			// 2 데이터베이스 접속
			Connection conn = DriverManager.getConnection(host, user, pass);
			
			// 3 SQL 실행 객체 생성
			String sql = "SELECT * FROM `user1`";
			PreparedStatement psmt = conn.prepareStatement(sql);
			
			
			// 4 SQL 실행
			ResultSet rs = psmt.executeQuery();
			
			// 5 결과처리(Select 경우)
			while(rs.next()) {		
				
				// VO객체 생성 및 초기화
				UserVO vo = new UserVO();
				vo.setUid(rs.getString(1));
				vo.setName(rs.getString(2));
				vo.setHp(rs.getString(3));
				vo.setAge(rs.getInt(4));
				
				//VO객체 List저장
				users.add(vo);
			}
			
			
			// 6 연결해제
			rs.close();
			psmt.close();
			conn.close();
			
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		// List 결과출력 (배열 반복문)
		for(UserVO vo : users) {
			System.out.println("---------------------");
			System.out.println("아이디 : " + vo.getUid());
			System.out.println("이름 : " + vo.getName());
			System.out.println("휴대폰 : " + vo.getHp());
			System.out.println("나이 : " + vo.getAge());
			System.out.println("---------------------");
			
			
		}
		
		System.out.println("selete 완료...");
		
	} // main end

}
