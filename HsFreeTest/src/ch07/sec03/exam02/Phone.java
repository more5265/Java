package ch07.sec03.exam02;
// 부모 클래스가 매개변수를 갖는 생성자가 있는 경우
public class Phone {
	
	public String model;
	public String color;
	
	public Phone(String model, String color) {
		this.model = model;
		this.color = color;
		System.out.println("Phone(String model, String color) 생성자 실행");
	}

}
/*생성자는 model과 color 매개변수를 받아 해당 값으로
 * 인스턴스의 필드를 초기화합니다. 이후 sysout을 출력합니다.
*/