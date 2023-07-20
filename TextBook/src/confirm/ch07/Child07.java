package confirm.ch07;

public class Child07 extends Parent07{
	public String name;
	
	public Child07() {
		this("홍길동");
		System.out.println("Child() call");
	}
	
	public Child07(String name) {
		this.name = name;
		System.out.println("Child07(String name) call");
	}

}
