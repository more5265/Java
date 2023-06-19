package sub2;


public class Car {
	//클래스의 속성은 무조건 private 알아둬야 한다
	
	private String name; // (3) 캡슐화 (public으로 선언되어 있던 것들을 private)
	private String color;
	private int speed;
	//protected (상속 관계)
	
	// 생성자 (6) 클래스 이름과 동일한 메서드ㅡ(캡슐화된 속성을 초기화하기 위한 메서드)
	public Car(String name, String color, int speed) { //매개변수에 속성들을 다 넣는다 (7)
		
		this.name = name;
		this.color = color;
		this.speed = speed;
		
	}
	
	//메서드 (기능) 메서드는 private(캡슐화)를 하지 않는다
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
	
	//Getter , Setter - 필요에 따라서 정의한다. (Ctrl + spacebar)
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
	
		
}