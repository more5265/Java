package sub1;

public class Account {
	
	// 속성
	String bank;
	String id;
	String name;
	int balance; //잔액
	
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


