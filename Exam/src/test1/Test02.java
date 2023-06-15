package test1;

import java.util.Scanner;

/*
 * 날짜 : 2023/06/13
 * 이름 : 이황성
 * 내용 : 자바 기본 입출력 연습문제
 */

public class Test02 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); //스캐너
		
		int year;
		int birth;
		String name;
		
		System.out.print("올해 년도 입력 : ");
		year = sc.nextInt(); //빈칸
				
		System.out.print("태어난 년도 입력 : ");
		birth = sc.nextInt(); //빈칸
				
		System.out.print("이름 입력 : ");
		name = sc.next();  //빈칸
				
		int age = year - birth;
		          //        string                    %f (실수)
		System.out.printf("%s님 안녕하세요. \n당신은 올해 만 %d세 입니다.", name, age);
		          //위 빈칸 (문자열)                    (숫자열)
		sc.close();
		}
}
// 올해 년도 입력 :
// 태어난 년도 입력 :
// 이름 입력 :
// XXX님 안녕하세요.
// 당신은 올해 만 XX세 입니다.