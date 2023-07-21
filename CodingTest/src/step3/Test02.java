package step3;

import java.util.Scanner;

public class Test02 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for(int i = 0 ; i < T; i++){
			System.out.print("테스트 케이스 " + (i + 1) + " 입력 (A B): ");
			int a = sc.nextInt();

			int b = sc.nextInt();
			
		int sum = a + b;
        System.out.println("테스트 케이스 " + (i + 1) + ": " + sum);
		}
sc.close();
}
}