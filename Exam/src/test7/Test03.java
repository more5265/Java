package test7;
/*
 * 날짜 : 2023/07/19
 * 이름 : 이황성
 * 내용 : 자바 연습문제7
 */

class Bus {
	private String number;
	private int fee;



public Bus(String number, int fee) {
		super();
		this.number = number;
		this.fee = fee;
	}



public void Take(String name) {
	System.out.printf("%s은 %s버스를 탑니다.\n", name, number);
	System.out.printf("버스 요금은 %,d입니다.\n", fee);
	}
}

class Subway {
	private String line;
	private int fee;

	
	public Subway(String line, int fee) {
		super();
		this.line = line;
		this.fee = fee;
	}


	public void Take(String name) {
		System.out.printf("%s은 %s호선 지하철을 탑니다.\n", name, line);
		System.out.printf("지하철 요금은 %,d입니다.\n", fee);
	}
}

class User {
	private String name;
	private int age;
	public User(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}


	
	public void takeBus(Bus bus) {
		bus.Take(name);
	}
	public void takeSubway(Subway subway) {
		subway.Take(name);
	}
}

public class Test03 {
	public static void main(String[] args) {
		
		User kim = new User("김유신", 24);
		User lee = new User("이순신", 34);
		
		Bus bus = new Bus("64", 1350);
		Subway subway = new Subway("1", 1500);
		
		kim.takeBus(bus);
		lee.takeSubway(subway);
	}

}
