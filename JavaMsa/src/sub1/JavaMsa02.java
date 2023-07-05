package sub1;
/*
 * 날짜 : 2023/07/05
 * 이름 : 이황성
 * 내용 : JAVA, MSA 교과 수행평가 - 작업형 문제2
 * 	- 다음과 같이 출력하는 프로그램을 작성
 * 		☆☆☆★☆☆☆
 * 		☆☆★★★☆☆
 * 		☆★★★★★☆
 * 		★★★★★★★
 */		
public class JavaMsa02 {
	public static void main(String[] args) {
		int r = 5; 

		for (int i = 1; i <= r; i++) {
           
			for (int j = 1; j <= r - i; j++) {
			System.out.print("☆");
			}
			
			for (int k = 1; k <= 2 * i - 1; k++) {
			System.out.print("★");
			}

			
			for (int j = 1; j <= r - i; j++) {
			System.out.print("☆");
			}
			
		System.out.println();
		}
	}
}

