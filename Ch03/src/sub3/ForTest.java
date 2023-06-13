package sub3;
/*
 * 날짜 : 2023/06/13
 * 이름 : 이황성
 * 내용 : Java 반복문 for 실습하기
 */
public class ForTest {
	
	public static void main(String[] args) {
	
		// 1부터 10까지 합
		int sum = 0;
		
		for(int k=1 ; k<=10 ; k++) {
			sum += k;
		}
		
		System.out.println("1부터 10까지 합 :" + sum);
	
		// 1부터 10까지 짝수합
		int tot = 0;
		for(int k=1 ; k <=10 ; k++) {
			if (k % 2 == 0) {
				tot += k;
			}
		}
		
		System.out.println("1부터 10까지 짝수 합 :" + tot);
		
		// for 중첩
		for(int a=1; a<=3; a++) {  //false일 때까지 true를 반복
			
			System.out.println("a : "+ a);
			
			for(int b=1; b<=5; b++) {
				
				System.out.println("b : " + b);
				
				for(int c=1; c<=7; c++) {
					
					System.out.println("c : " + c);
				}
			}
		}
		
		// 구구단
		for(int x=2; x<=9; x++) {
			
			for(int y=1; y<=9; y++) {
				
				int z = x * y;
				System.out.printf("%d x %d = %d\n"	, x, y, z);
			}
		}
		
		
		// 별삼각형
		for(int start=1; start<=10; start++) {
			
			for(int end=1; end <= start; end++) {
				
				
				System.out.print("★");
			}
			
			System.out.println("\n"); // 개행(줄바꿈)
		}
		
		for(int start=10; start>=1; start--) {
			
			for(int end=1; end <=start; end++) {
				
				System.out.print("★");
			}
			System.out.println("\n");
		}
		// for(초기식 ; 조건식 ; 증감식) true를 반복하다 false가 나오면 종료
		for(int i=1 ; i<=5 ; i++) {
			
			System.out.println("i = " + i);
		}
		
		for(int start=1; start<=5; start++) {
			
			for(int end=1; end<=start; end++) {
				
				System.out.print("★");
			}
			System.out.println("\n");
		}
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10 - i; j++) {
                System.out.print(" "); // 공백 출력
            }

            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("★"); // 별(*) 출력
            }

            System.out.println(); // 줄바꿈
        }
	}
}


