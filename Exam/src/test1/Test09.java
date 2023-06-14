package test1;
/*
 * 날짜 : 2023/06/13
 * 이름 : 이황성
 * 내용 : 자바 반복문 연습문제
 */
public class Test09 {
	public static void main(String[] args) {
		
		int count = 0;
		
		for(int i=1; i<=9; i++) {
			
			if(i<=5) {
				count++; //빈칸
			} else {
				count--; //빈칸
			}
			
			for(int j=1; j<=5-count; j++) {
				System.out.print(" ");
			}
			for(int k=1; k<=2*count-1; k++) {
				System.out.print("*");
			}
			
			System.out.print("\n");
		}
	}

} //빈칸 채우기를 해봐야 실기에 도움된다
