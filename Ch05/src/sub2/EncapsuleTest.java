package sub2;
/*
 * 날짜 : 2023/06/19
 * 이름 : 이황성
 * 내용 : Java 캡슐화 실습하기
 * 
 * 캡슐화(정보은닉, Encapsulation)
 * 	- 캡슐화는 객체의 속성을 외부에 참조하지 못하게 객체의 정보(속성을) 은닉하는 특성
 * 	- 클래스의 속성은 반드시 private 선언을 통해 캡슐화
 * 	- private 속성의 초기화를 위해 생성자(Constructor) 정의
 * 	- 은닉된 정보의 안전한 사용을 위해서 Getter, Setter 제공
 * 
 */
public class EncapsuleTest {
	
	public static void main(String[] args) {
		
		// Car 객체 생성, 초기화 (1
		Car sonata = new Car("소나타", "흰색", 10); //내부에 있어야 할 내용이 외부에 있는 상태, 캡슐화 필요 (2)
		                     //↑(8) 여기에 적는다(생성자 호출)
		
		//sonata.name = ("소나타");
		//sonata.color = ("흰색"); //name color speed 빨간줄이 뜬다(참초를 못하는 상태) (4)
		//sonata.speed = 10; //(5) 그래서 생성자가 나온다
		
		sonata.setName("그렌져");
		sonata.speedUp(80);
		sonata.speedDown(20);
		sonata.show();
		
		//Car 객체 생성, 초기화
		Car avante = new Car("아반테", "검은색", 10);
		avante.setColor("남색");
		avante.speedUp(60);
		avante.speedDown(20);
		avante.show();
		
		//Account 객체 생성, 초기화
		Account KB = new Account("국민은행", "123-0000-0001", "김유신", 10000);
		KB.deposit(40000);
		KB.witharaw(25000);
		KB.show();
		
		Account WR = new Account("우리은행", "123-45678-910", "김춘추", 1000);
		
		WR.deposit(30000);
		WR.witharaw(5000);
		WR.show();
		
	}

}
