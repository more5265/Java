package sub1;
/*
 * 날짜 : 2023/07/04
 * 이름 : 이황성
 * 내용 : 함수형 프로그래밍 실습하기 (p694)
 * 
 * 함수형 프로그래밍
 * 	- 프로그래밍 단위를 함수 단위로 실행하는 프로그래밍 패러다임
 * 	- 함수형 프로그래밍의 함수는 람다식으로 표현
 */

interface A {
	public void method();
}

class B implements A {

	@Override
	public void method() {
		System.out.println("method 실행...");
	}
}

public class functionalTest {
	public static void main(String[] args) {
		
		// 객체지향 방식 (일반적이고 보편적인 방식)
		A a1 = new B();
		a1.method();
		
		// 익명클래스[인터페이스를 바로 객체로 생성] (스윙, 이벤트처리때 사용多)
		A a2 = new A() { // 
			@Override
			public void method() {
				System.out.println("method 실행...");
			}
		}; // 덩어리 자체가 객체, A는 인터페이스(클래스가 아님)
		
		a2.method();
		
		// 함수형 프로그래밍 방식(람다식) / (매개변수, ...) -> { 처리 내용 }
		A a3 = () -> { System.out.println("metohd 실행...");}; 
		a3.method();
	
		
	}
}
