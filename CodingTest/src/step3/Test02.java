package step3;

import java.util.Scanner;

public class Test02 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();

		int b = sc.nextInt();
		
		int sum = a + b;
		System.out.println("합 : " + sum);
		
		sc.close();
	}

}
