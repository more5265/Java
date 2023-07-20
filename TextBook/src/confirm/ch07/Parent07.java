package confirm.ch07;

public class Parent07 {
	public String nation;
	
	public Parent07() { 
		this("대한민국");
		System.out.println("Parent07() call");
	}
	
	public Parent07 (String nation) {
		this.nation = nation;
		System.out.println("Parent07(String nation) call");
	}

}
