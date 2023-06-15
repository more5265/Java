package sub2;
/*
 * 날짜 : 2023/06/15
 * 이름 : 이황성
 * 내용 : Java 메서드 실습하기
 */
public class methodTest { //클래스 구조 안에 메서드가 들어가있음
	
	// 전역변수
	int num = 1;
	
	
	// main method : 프로그램 진입점
	public static void main(String[] args) { 
		
		// 메서드 호출
		int y1 = f(1);
		         //↑인자값
		int y2 = f(2);
		
		int y3 = f(3);
		
		System.out.println("y1 : " + y1);	//5
		System.out.println("y2 : " + y2);	//7
		System.out.println("y3 : " + y3);	//9
		
		// 메서드 지역변수와 스택
		int t1 = sum(1, 10); //(t1 = total 1)
		int t2 = sum(1, 100);
		
		System.out.println("t1 : " + t1);
		System.out.println("t2 : " + t2);
		
		
	}

	// 메서드 정의
	public static int f(int x) {
		          
		int y = 2 * x + 3;
		return y;
		
	}
	
	// 메서드 정의
	public static int sum(int start, int end) {
		         //↑ total 변수에 맞추기 위해 void가 아닌 int
		
	 //↓ 지역변수 : 메서드가 종료되면 스택에서 해제
		int total = 0;
		
		for(int k=start; k<=end ; k++) {
			
			total += k;
		}
		
		return total;
		
		
	}
}
