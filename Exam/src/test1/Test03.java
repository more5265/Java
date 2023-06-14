package test1;
/*
 * 날짜 : 2023/06/13
 * 이름 : 이황성
 * 내용 : 자바 연산자 연습문제
 */
public class Test03 {
	public static void main(String[] args) {
		
		int num = 1;   //빈칸 (변수 선언이 나와야 함)
		int result = 0;		//빈칸
		
		result = num++; //대입먼저, 그다음 증가연산
		System.out.println("result : " +result);
		
		result = ++num; //증가연산 먼저, 그다음 대입연산
		System.out.println("result : " +result);
		
		result = num--;
		System.out.println("result : " +result);
		
		result = --num;
		System.out.println("result : " +result);
	}

}
//1
//3
//3
//1
