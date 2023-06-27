package sub4;
/*
 * 날짜 : 2023/06/27
 * 이름 : 이황성
 * 내용 : Java Math 클래스 실습하기 (p528)
 * 
 */
public class MastTest {
	public static void main(String[] args) {
		
		//Math math = new Math(); X
		
		// 기본 메서드
		System.out.println("절대값 : " + Math.abs(-5));
		
		System.out.println("재곱근 : " + Math.sqrt(9));
		
		System.out.println("올림값 : " + Math.ceil(1.2));
		
		System.out.println("올림값 : " + Math.ceil(1.8)); //사용빈도 많음
		
		System.out.println("내림값 : " + Math.floor(1.2)); //사용빈도 많음
		
		System.out.println("내림값 : " + Math.floor(1.8));
		
		System.out.println("반올림 : " + Math.round(1.2));
		
		System.out.println("반올림 : " + Math.round(1.8));
		
		// random 메서드
		double num1 = Math.random();
		System.out.println("num1 : " + num1); // 0 ~ 1 사이 실수
		
		double num2 = num1 * 10;
		System.out.println("num2 : " + num2); // 0 ~ 10 사이 실수
		
		double num3 = Math.ceil(num2);
		System.out.println("num3 : " + num3); // 1 ~ 10 사이 정수 (올림값)
		
		// 1 ~ 45 사이 임의의 정수
		int rand = (int) Math.ceil(Math.random() * 45);
		System.out.println("rand : " + rand);
		
	}
}
