package step2;

import java.util.Scanner;

/*
 * 90 ~ 100점은 A, 80 ~ 89점은 B, 70 ~ 79점은 C, 60 ~ 69점은 D, 나머지 점수는 F
 * 
 */
public class Test02 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int score = sc.nextInt();
		String grade;
		
		if(score >= 90 && score <= 100) {
			grade = "A";
		} else if(score>=80) {
			grade = "B";
		} else if(score>=70) {
			grade = "C";
		} else if(score>=60) {
			grade = "D";
		} else {
			grade = "F";
		}
		System.out.println(grade);
		
	}

}

/*
 * 		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		
		if(a>=90 && a<=100) {
			System.out.println("A");
		} else if(a>=80 && a<90) {
			System.out.println("B");
		} else if(a>=70 && a<80) {
			System.out.println("C");
		} else if(a>=60 && a<70) {
			System.out.println("D");
		} else {
			System.out.println("F");
		}
		
	}

}
 */
