package confirm.ch06;

import java.util.Scanner;

class Account {
	
	private int balance;
	
	public int getBalance() {
		return balance;
	}
	
	public void setBalance(int balance) {
		
		if(balance >= 0 && balance <= 1000000) {
			this.balance = balance;
		}
	}
}



public class Test19 {
	public static void main(String[] args) {
		
	Account account = new Account();
	
	account.setBalance(10000);
	System.out.println("현재 잔고 : " + account.getBalance()); // 10000
	
	account.setBalance(-100);
	System.out.println("현재 잔고 : " + account.getBalance()); // 10000
		
	account.setBalance(2000000);
	System.out.println("현재 잔고 : " + account.getBalance());	// 10000
	
	account.setBalance(300000);
	System.out.println("현재 잔고 : " + account.getBalance());	// 300000
	
	
	}
	
}
