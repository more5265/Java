package sub2;
/**
 * 날짜 : 2023/06/12
 * 이름 : 이황성
 * 내용 : Java 자료형 실습하기
 *
 * 자료형(Data Type)
 *  - 변수에 저장되는 데이터의 종류와 크기를 나타낸 키워드
 *  - 자료형은 기본형과 참조형(객체)으로 나뉨
 *  
 */
public class DataTypeTest {

	public static void main(String[] args) {
		
		// 정수형
		byte num1 = 127; //[1바이트] 가장 작은 크기의 정수 타입. -128 ~ 127 (2진법 8비트)
		short num2 = 32767; //[2바이트] -32,768 ~ 32,767
		int num3 = 2147483647; //[4바이트] -2,147,483,648 ~ 2,147,483,647, 가장 많이 쓰임
		long num4 = 9223372036854775807L; //[8바이트] 
		
		System.out.println("num1 : " + num1);
		System.out.println("num2 : " + num2);
		System.out.println("num3 : " + num3);
		System.out.println("num4 : " + num4);
		
		
		// 실수형
		float var1 = 0.123456789f; //소수점 8자리까지 표시(반올림)
		double var2 = 0.1234567890123456789; //소수점 17자리까지 표시(반올림), 많이씀
		
		System.out.println("var1 : " + var1);
		System.out.println("var2 : " + var2);
		
		// 논리형
		boolean data1 = true; // 많이씀
		boolean data2 = false;
		
		System.out.println("data1 : " + data1);
		System.out.println("data2 : " + data2);
		
		
		// 문자형 (활용도 떨어짐)
		char c1 = 'A';
		char c2 = '가';
		
		System.out.println("c1 : " + c1);
		System.out.println("c2 : " + c2);
		
		// 문자열
		String str1 = "A"; // 많이씀, int 다음으로. 객체라서 대문자
		String str2 = "가";
		String str3 = "Apple";
		String str4 = "가을";
		
		System.out.println("str1 : " + str1);
		System.out.println("str2 : " + str2);
		System.out.println("str3 : " + str3);
		System.out.println("str4 : " + str4);
		
	}
	
	
}
