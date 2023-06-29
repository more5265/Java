package sub5;
/*
 * 날짜 : 2023/06/21
 * 이름 : 이황성
 * 내용 : Java 클래스 상속 실습
 * 
 * 상속(Inheritance)
 * 	- 기존 클래스(부모)의 속성과 기능을 그대로 자식 클래스에게 확장시키는 프로그래밍 문법
 * 	- 공통적인 로직 내용을 부모클래스에 두고 자식클래스에서 상속받아 일관된 프로그래밍 수행
 * 	- 부모클래스의 속성 접근권한을 protected로 변경하고 자식클래스에서는 부모 속성을 초기화
 * 
 */

class Parent {
	private int num1;
	private int num2;
	
	public Parent(int num1, int num2) {//생성자
		this.num1 = num1;
		this.num2 = num2;
	}
	
	public int plus() {
		return num1 + num2;
	}
}

class Child extends Parent {//상속 (extends) 부모클래스도 매개변수 넣고 생성자로 넘겨줘야함
	private int num3;
	private int num4;
	
	public Child(int num1, int num2, int num3, int num4) {
		super(num1, num2); //자식 생성자의 super()에 의해 부모 생성자가 호출된다
		this.num3 = num3;
		this.num4 = num4;
	}
	
	public int minus() { 
		return num3 - num4;
	}
}
public class InheritTest {
	
	public static void main(String[] args) {
		
		// 상속객체 생성
		Child c1 = new Child(1, 2, 3, 4);
		int rs1 = c1.plus();
		int rs2 = c1.minus();
		
		System.out.println("rs1 : " + rs1);
		System.out.println("rs2 : " + rs2);
		
		// Car 상속객체 생성
		Sedan sonata = new Sedan("소나타", "흰색", 0, 2000);
		
		sonata.speedup(80);
		sonata.speedTurbo();
		sonata.show();
		
		Truck bongo = new Truck("봉고" , "남색", 0, 0);
		
		bongo.load(100);
		bongo.speedup(60);
		bongo.show();
		
		// Account 상속객체 생성
		StockAccount KB = new StockAccount("KB증권", "101-11-1020", "홍길동", 10000, "삼성전자", 5, 10000);
		
		KB.deposit(1000000);
		KB.buy(58000, 5);
		KB.sell(62000, 5);
		KB.show();
				
				
		
	}

}
