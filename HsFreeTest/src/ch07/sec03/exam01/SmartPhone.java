package ch07.sec03.exam01;
/*
 * 부모 클래스가 기본 생성자를 가지고 있는 경우
 */
public class SmartPhone extends Phone{
	
	public SmartPhone(String model, String color) {
		super();
		this.model = model;
		this.color = color;
		System.out.println("SmartPhone(String model, String color) 생성자가 실행됨");
	}
}