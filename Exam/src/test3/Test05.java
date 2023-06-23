package test3;
/*
 * 날짜 : 2023/06/23  
 * 이름 : 이황성
 * 내용 : 싱글톤 객체 연습문제
 */

class Vehicle {
	private String name;
	private int price;
	
	public Vehicle(String name, int price) {
		this.name = name;
		this.price = price;
	}
	
	public void info() {
		System.out.println("============");
		System.out.println("차량명 : "+name);
		System.out.println("가격 : "+price);
		System.out.println("------------");
	}
	}
	
class CarFactory {
	private static CarFactory instance = new CarFactory();
	private CarFactory() {}
	
	public static CarFactory getinstance() {
		return instance;
	}
	public Vehicle CreateCar(String name, int price) {
		return new Vehicle(name, price);
		// Vehicle v = new Vehicle(name, price);
		// return v
	}
}
public class Test05 {
	public static void main(String[] args) {
		
		CarFactory  factory = CarFactory.getinstance();
				
		Vehicle avante = factory.CreateCar("아반테", 2500);
		Vehicle sonata = factory.CreateCar("소나타", 3000);
		
		avante.info();
		sonata.info();
	}
}
