package sub6;
/*
 * 날짜 : 2023/06/21
 * 이름 : 이황성
 * 내용 : Java 오버라이드 실습하기
 * 
 * 오버라이드(메서드 재정의)
 * 	- 부모 클래스의 메서드를 자식 클래스에서 재정의하는 문법 (상위 클래스에서 정의된 메서드를 하위 클래스에서 재정의하는 것)
 * 	- 오버라이드 기능을 통해서 객체지향 프로그래밍의 다형성을 구현
 * 
 * 오버로드 오버라이드 차이점은? : 오버로드와 오버라이드는 객체 지향 프로그래밍에서 다형성을 구현하는 두 가지 개념으로서,
 * 오버로드는 같은 이름의 메서드를 다양한 매개변수 조합으로 정의하는 것을 말하며, 오버라이드는 상속 관계에서 상위 클래스의 메서드를
 * 하위 클래스에서 재정의하여 사용하는 것을 말합니다.
 */

class AAA {
	
	public void method1() {
		System.out.println("AAA::method1...");
	}
	
	public void method2() {
		System.out.println("AAA::method2...");
	}
	// Overload
	public void method3() {
		System.out.println("AAA::method3...");
	}
	
}

class BBB extends AAA {
	@Override
	public void method2() {
		System.out.println("BBB::method2...");
	}
	// Overload
	public void method3(int a) {
		System.out.println("BBB::method3...");
	}
	
}

class CCC extends BBB {
	@Override
	public void method1() {
		System.out.println("CCC::method1...");
	}
	@Override
	public void method2() {
		System.out.println("CCC::method2...");
	}
	// Overload
	public void method3(int a, int b) {
		System.out.println("CCC::method3...");
	}
	
}


public class OverrideTest {
	public static void main(String[] args) {
		
		// 오버라이드 메서드 호출
		CCC c = new CCC();
		
		c.method1();
		c.method2();
		c.method3();
		c.method3(1);
		c.method3(1, 2);
		
		// Car 상속객체 생성
		Sedan sonata = new Sedan("소나타", "흰색", 0, 2000);
		Truck bongo = new Truck("봉고", "남색", 0, 0);
		
		sonata.speedup(80);
		sonata.show();
		
		bongo.speedup(80);
		bongo.show();
		
		
	}

}
