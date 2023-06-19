package sub2;

public class Account {
	
	// 속성
	private String bank;
	private String id;
	private String name;
	private int balance; //잔액
	
	public Account() {
		
	}
	
	//캡슐화
	public Account(String bank, String id, String name, int balance) {
		
		this.bank = bank;
		this.id = id;
		this.name = name;
		this.balance = balance;
		
	}
	
	// 기능
	public void deposit(int balance) {
		this.balance += balance; //속성this
		
	}
	public void witharaw(int balance) {
		this.balance -= balance;
		
	}
	public void show() {
		System.out.println("-------------------");
		System.out.println("은행명 : " + this.bank);
		System.out.println("계좌번호 : " + this.id);
		System.out.println("입금주 : " + this.name);
		System.out.println("현재잔액 : " +this.balance);
		System.out.println("-------------------");
		
	}
		
	

}