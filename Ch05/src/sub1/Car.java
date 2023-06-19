package sub1;

// Car 클래스 정의
public class Car {
	
	// 필드(속성) 변수선언
	String name; //이름들은 짓기나름
	String color;
	int speed;
	
	// 메서드(기능)
	public void speedUp(int speed) {
		this.speed += speed;
		
	}
		
	public void speedDown(int speed) {
		this.speed -= speed;
		
	}
		
	public void show() {
		
		System.out.println("차량명 : " + this.name);
		System.out.println("차량색 : " + this.color);
		System.out.println("현재속도 : " + this.speed);
		
	}
	
		
}

