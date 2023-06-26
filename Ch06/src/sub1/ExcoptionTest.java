package sub1;
/*
 * 날짜 : 2023/06/26
 * 이름 : 이황성
 * 내용 : Java 예외처리 실습하기 (p464)
 * 
 */
public class ExcoptionTest {
	public static void main(String[] args) throws ClassNotFoundException {
		////////////////////////////////////////////
		//실행 예외
		////////////////////////////////////////////
		
		// 예외 상황 1 : 어떤 수를 0으로 나눌 때
		int num1 = 1;
		int num2 = 0;
		int rs1 = 0;
		int rs2 = 0;
		int rs3 = 0;
		int rs4 = 0;
		
		try {
			// 예외가 발생할 가능성이 있는 코드 작성
			rs1 = num1 + num2;
			rs2 = num1 - num2;
			rs3 = num1 * num2;
			rs4 = num1 / num2; // (2) rs4이 선언된 구역에서만 출력이 가능하기 때문에 rs4 빨간줄, main에서 선언을 해줘야함
			
		}catch (ArithmeticException e) { // Exception e 사용도 가능(모든 하위 에러들을 다 잡는 코드)
			// 예외가 발생했을 때 처리할 코드 작성
			e.printStackTrace(); // 예외 내용 출력
		}
		

		System.out.println("rs1 : "+rs1);
		System.out.println("rs2 : "+rs2);
		System.out.println("rs3 : "+rs3);
		System.out.println("rs4 : "+rs4); // (1) rs4 빨간줄
		
		// 예외 상황 2 : 배열의 인덱스 범위를 벗어났을 때
		int[] arr = {1, 2, 3, 4, 5};
		
		try {
			
			for(int i=0; i<6; i++) {
				System.out.println("arr["+i+"] : " + arr[i]);
			}
		}catch (ArrayIndexOutOfBoundsException e) {
			//배열의 인덱스 범위를 벗어났을 때
			e.printStackTrace();
		}
		
		
		// 예외 상황 3
		Animal ani = null; // 참조 변수
		try {
			
		ani.move();
		ani.hunt();
		}catch (NullPointerException e) {
			//객체 생성 없이 참조(Null 포인터 에러)
			e.printStackTrace();
		}
		
		// 예외 상황 4
		Animal a1 = new Tiger(); // 업캐스팅
		Animal a2 = new Eagle(); // 업캐스팅
		Animal a3 = new Shark(); // 업캐스팅

		try {
			
		Eagle eagle = (Eagle) a1; //다운캐스팅
		Shark shakr = (Shark) a2; //다운캐스팅
		Tiger tiger = (Tiger) a3; //다운캐스팅
		
		}catch (ClassCastException e) {
			//잘못된 캐스팅
			e.printStackTrace();
		}
		////////////////////////////////////////////
		//일반 예외
		////////////////////////////////////////////
		
		try {
			
		Class animal = Class.forName("sub1.Lion");
		}catch(ClassNotFoundException e) {
			//찾을 수 없는 클래스 선언
			e.printStackTrace();
		} finally {
			// 예외 처리 발생유무에 상관없이 마지막에 항상 실행되는 코드
			System.gc(); // 메모리 정리
			System.out.println("finally 실행...");
		}
		
		
		System.out.println("프로그램 정상 정료...");
	}
}
