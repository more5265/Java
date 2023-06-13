package test1;
/*
 * 날짜 : 2023/06/13
 * 이름 : 이황성
 * 내용 : 자바 반복문 연습문제
 */
public class Test08 {
	public static void main(String[] args) {
		
		int n = 5;
		
		for(int i = 0; i<n; i++) {
			
			for(int j=n-1; j > i; j--) {   //중간 빈칸
				System.out.print(" ");
			}
			
			for(int j=0; j < (2 * i + 1) ; j++) {  //중간 빈칸
				System.out.print("*");
			}
			System.out.print("\n");
		}
	}

}
