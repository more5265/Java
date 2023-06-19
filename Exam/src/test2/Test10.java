package test2;
/*
 * 날짜 : 2023/06/15
 * 이름 : 이황성
 * 내용 : 자바 피보나치 수열 재귀 메서드 연습문제
 */
public class Test10 {
	public static void main(String[] args) {
		
		for(int i=0; i<10 ; i++) {
			System.out.print(fibo(i)+" ");
		}
	}

	public static int fibo(int n) {
		
		if(n <= 1) {
			return n;
		}
		
		return fibo(n-1) + fibo(n-2);
	}              //빈칸      //빈칸
	
}
//f(2) = f(1) + f(0)
// n    =  (n-1)  + (n-2)