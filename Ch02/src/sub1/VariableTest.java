package sub1;

/*
 * 날짜 : 2023/06/12
 * 이름 : 이황성
 * 내용 : Ch02.Java 변수와 연산자 실습
 *
 * 변수(variable)
 * 	- 데이터 처리를 위한 데이터 그릇
 * 	- 변수는 메모리 공간이며 각 데이터의 종류에 따라 크기가 다름
 * 
 * 상수(constant)
 * 	- 최초 저장된 데이터로 고정되는 변수
 * 	- 대문자로 표기
 * 
 */

public class VariableTest {
	
	public static void main(String[] args) {
		
		// 변수 설정
		int a = 3;
		int b = 7;
		
		System.out.println("a : " + a);
		
		a = 5;
		System.out.println("a : " + a);
		System.out.println("b : " + b);
		
		String name = "홍길동"; // name = "홍길동"; X
		System.out.println(name+"님 반갑습니다.");
		
		// 상수
		final int NUM = 5; // (final) 쓰임 : NUM 이라는 변수를 상수로 바꾸고 싶다
		
		// 상수는 값이 고정
		//NUM = 7;  X
		System.out.println("NUM : " + NUM);
		
	}

}
