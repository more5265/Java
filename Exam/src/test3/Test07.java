package test3;
/*
 * 날짜 : 2023/06/23  
 * 이름 : 이황성
 * 내용 : 클래스 상속 연습문제
 * 
 * private 에서 protected 변경
 * 상속 extends customer
 * 생성자를 호출해야함 super(id, name);
 * 
 */

class Customer {
	protected int id;
	protected String name;
	protected String grade;
	protected int point;
	protected double pointRatio;
	
	public Customer (int id, String name) {
		this.id = id;
		this.name = name;
		this.grade = "SILVER";
		this.point = 100;
		this.pointRatio = 0.01;
	}
	public void showInfo() {
		System.out.println("======================");
		System.out.println("고객번호 : "+id);
		System.out.println("고객이름 : "+name);
		System.out.println("고객등급 : "+grade);
		System.out.println("현재 포인트 : "+point);
		System.out.println("포인트 적립율 : "+pointRatio);
		System.out.println("----------------------");
	}
	
}
public class Test07 {

}

