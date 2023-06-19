package sub1;
/*
 * 날짜 : 2023/06/19
 * 이름 : 이황성
 * 내용 : Java 클래스 실습하기
 * 
 * 클래스와 객체
 * 	- 클래스는 객체를 생성하는 구조체이고 속성(필드, 멤버변수)과 기능(멤버 메서드)으로 설계
 * 	- 객체(Object)는 클래스의 실제 인스턴스(instance), new 연산으로 생성 ★
 */
public class ClassTest {
	
	public static void main(String[] args) {
		
		// 객체(Object) 생성
		Car sonata = new Car(); //같은 패키지에 있는 Car클래스를 불러옴 + 대입연산자의 옆은 항상 변수
		   //↑참조변수
		
		// 객체 초기화
		sonata.name = "소나타";
		sonata.color = "흰색";
		sonata.speed = 0;
		
		// 객체 활용
		sonata.speedUp(60);
		sonata.speedDown(20);
		sonata.show();
		
		// 객체 선언, 생성, 초기화
		Car avante; // 선언
		avante = new Car(); // 생성
		avante.name = "아반테"; // 초기화
		avante.color = "검은색";
		avante.speed = 0;
		
		avante.speedUp(80);
		avante.speedDown(40);
		avante.show();
		
		// Account 객체 선언, 생성, 초기화
		Account KB;
		KB = new Account();
		KB.bank = "국민은행";
		KB.id = "123-0000-0001";
		KB.name = "김유신";
		KB.balance = 10000;
		
		KB.deposit(40000);
		KB.witharaw(30000);
		KB.show();
		
		//우리은행 
		Account WR;
		WR = new Account();
		WR.bank = "우리은행";
		WR.id = "123-45678-910";
		WR.name = "김춘추";
		WR.balance = 39000;
		
		WR.deposit(50000);
		WR.witharaw(0);
		WR.show();
		
	} // main end //변수선언이 몇개인가? 4
	
}