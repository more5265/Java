package Ch03;
/*
 * 상속(Inheritance)
 * 	- 기존 클래스(부모)의 속성과 기능을 그대로 자식 클래스에게 확장시키는 프로그래밍 문법
 * 	- 공통적인 로직 내용을 부모클래스에 두고 자식클래스에서 상속받아 일관된 프로그래밍 수행
 * 	- 부모클래스의 속성 접근권한을 protected로 변경하고 자식클래스에서는 부모 속성을 초기화
 */
class Parent {
	private int num1;
	private int num2;
	
	public Parent(int num1, int num2) {
		this.num1 = num1;
		this.num2 = num2;
	}
	
	public int plus() {
		return num1 + num2;
	}
}

class Child extends Parent { //상속
	private int num3;
	private int num4;

	public Child(int num1, int num2, int num3, int num4) {
		super(num1, num2); //자식 생성자 super로 부모 생성자 호출
		this.num3 = num3;
		this.num4 = num4;
	}
	public int minus() {
		return num3 - num4;
	}
	
}


public class Inheritance {
	
	public static void main(String[] args) {
		
	}

}
