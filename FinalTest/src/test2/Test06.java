package test2;

import java.util.Scanner;

/*
 * 날짜 : 2023/06/15
 * 이름 : 이황성
 * 내용 : 자바 메서드 연습문제
 */
public class Test06 {
	public static ????? intro() { //static뒤빈칸 , 리턴값이 없는 메서드 (void)

		System.out.println("******* START *******");
		System.out.print("두개의 정수를 입력");
	}
	
	public static ????? input(Scanner sc, ?????) { //매개변수, 리턴값 다 있음. 빈칸
		System.out.print("변수 "+name+" 값 입력 : "); // 매개면수 name이 들어가야 한다.
		int input = sc.nextInt();
		return input;
	}
	
	public static ????? result(?????) { //빈칸 result (값)
		System.out.println("덧셈 결과 : "+aaa);
		System.out.print("******* END ********");

	}
	
	public static ????? add(int x, int y) { //빈칸(int)
		return x + y;
	}
	
	public static void main(String[] args) {
		

		
		Scanner sc = new Scanner(System.in);
		
		?????
		
		int a = input(sc, "a"); //""문자열 타입, 문자열이라 dnldpString
		int b = input(sc, "b");
		
		int output = add(a, b);
		result(output);
		
		sc.close();
		
		}
}
