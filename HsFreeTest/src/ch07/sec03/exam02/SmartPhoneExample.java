package ch07.sec03.exam02;
//부모 클래스가 매개변수를 갖는 생성자가 있는 경우
public class SmartPhoneExample {
	
	public static void main(String[] args) {
		
		SmartPhone myPhone = new SmartPhone("갤럭시", "은색");
		
		System.out.println("모델: " + myPhone.model);
		System.out.println("색상: " + myPhone.color);
	}

}
/*
 * A 변수 = new A(); (A는 클래스이름, 변수는 인스턴스를 참조하기 위한 변수 이름.
 * new A() 는 a클래스의 인스턴스를 생성하는 부분으로, 생성자를 호출하여 인스턴스를 초기화합니다.
 * 생성된 인스턴스는 변수에 할당됩니다.
 * 
 * SmartPhone 클래스의 인스턴스인 myPhone을 생성하는 코드
 * 생성자 호출시에는 갤럭시를 model 매개변수로, 은색을 color 매개변수로 전달
 * 이를 통해 SmartPhone클래스의 생성자가 실행되고 , model과 color필드가 전달된 값으로 초기화
 */