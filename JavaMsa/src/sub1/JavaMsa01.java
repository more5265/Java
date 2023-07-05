package sub1;
/*
 * 날짜 : 2023/07/05
 * 이름 : 이황성
 * 내용 : JAVA, MSA 교과 수행평가 - 작업형 문제1
 * 	- 첫째 줄에는 별 1개, 둘째 줄에는 별 2개, N번째 줄에는 별 N개를 찍는 프로그램 작성
 * 단, 오른쪽 기준 정렬
 */
import java.util.Scanner;

public class JavaMsa01 {
	
	public static void main(String[] args) {
    	
		Scanner sc = new Scanner(System.in);
        
		System.out.print("숫자 입력: ");
        
		int num = sc.nextInt();
        
		if(num >= 1 && num <= 100) {
        	
			for (int i = 1; i <= num; i++) {
        	
				for (int j = num - i; j > 0; j--) {
            	
				System.out.print(" ");
				}
				for (int k = 1; k <= i; k++) {
            	
				System.out.print("*");
				}
				System.out.println();
			}
		}
	}
}


