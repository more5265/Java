package test6;
/*
 * 날짜 : 2023/07/18
 * 이름 : 이황성
 * 내용 : 자바 연습문제6
 */
public class Test08 {
	public static void main(String[] args) {
		
		int count = 0;
		
		for(int i = 2 ; i <= 100 ; i++) {
			
			if(isPrime(i)) {
				
				System.out.print(i+"");
				count++;
			}
		}
		System.out.printf("\n2~100까지 소수는 모두 %d개 입니다.", count);
	}
	public static boolean isPrime(int x) {
		for(int i = 2 ; i <= 100 ; i++) {
		if(isPrime(i)) {
			return false;
		}
	}
	return true;
}
}
