package test1;

import java.util.Scanner;

/*
 * 날짜 : 2023/06/13
 * 이름 : 이황성
 * 내용 : 자바 연습문제
 */
public class Test04 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("점수 입력 : ");
		int score = sc.nextInt();
		char grade;    //빈칸
		
		System.out.print("입력한 점수는 "+score+"입니다.");
		
		if(score >= 90 && score <= 100)  {         //if(빈칸)
			grade = 'A';
		} else if(score >= 80 && score < 90) {	//if(빈칸)
			grade = 'B';
		} else if(score >= 70 && score < 80) {	//if(빈칸)
			grade = 'C';
		} else if(score >= 60 && score < 70) {	//if(빈칸)
			grade = 'D';
		} else {
			grade = 'F';
		}
		
		System.out.printf("등급은 %c입니다.", grade);
	}

}
