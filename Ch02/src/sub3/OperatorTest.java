package sub3;

/*
 * 날짜 : 2023/06/13
 * 이름 : 이황성
 * 내용 : Ch02.Java 연산자 실습하기
 * 
 * 연산자(Operator)
 *  - 변수의 데이터를 처리하기 위한 연산식
 *  - 일반적으로 산술, 복합대입, 비교, 논리연산을 수행
 */
public class OperatorTest {

	public static void main(String[] args) {
		
		//산술연산자
		int num1 = 1; //변수선언
		int num2 = 2; 
		int num3 = 3; 
		int num4 = 4; 

		int result1 = num1 + num2; //사칙 연산
		int result2 = num1 - num2;
		int result3 = num2 * num3;
		int result4 = num4 / num2; 
		int result5 = num4 % num3; // 나눗셈의 나머지를 산출하는 연산
		
		System.out.println("result1 : " + result1); // result1 : 3
		System.out.println("result2 : " + result2); // result2 : -1
		System.out.println("result3 : " + result3); // result3 : 6
		System.out.println("result4 : " + result4); // result4 : 2
		System.out.println("result5 : " + result5); // result5 : 1
		
		
		//증감연산자
		int num = 0; //변수를 선언, 변수를 초기화
		
		num++; // num = num + 1;
		++num; // num = num + 1;
		System.out.println("num : " + num); // num : 2
		
		num--; // num = num - 1;
		--num; // num = num - 1;
		System.out.println("num : " + num); // num : 0
		//차이점 책으로 공부
		
		//복합대입연산자
		int n1 = 1, n2 = 2, n3 = 3, n4 = 4;
		
		n1 += 1; // n1 = n1 + 1 <이렇게 코딩해도 되지만 간락하게 +=를 더 많이 쓸 것
		n2 -= 2; // n2 = n2 - 2  2번 일할 것을 1번으로 줄인 것
		n3 *= 3; // n3 = n3 * 3
		n4 /= 4; // n4 = n4 / 4
		System.out.println("n1 : " + n1); // n1 : 2
		System.out.println("n2 : " + n2); // n2 : 0
		System.out.println("n3 : " + n3); // n3 : 9
		System.out.println("n4 : " + n4); // n4 : 1
		
		
		//비교연산자
		int var1 = 1; //var : 변수의 타입을 추론하는 데 사용함.
		int var2 = 2; // 변수의 선언과 초기화를 다 간결하게 작성
		//true and false
		boolean rs1 = var1 > var2;  // var1은 var2보다 크다.
		boolean rs2 = var1 < var2;  // var1은 var2보다 작다.
		boolean rs3 = var1 >= var2; // var1은 var2보다 크거나 같다.
		boolean rs4 = var1 <= var2; // var1은 var2보다 작거나 같다. (or개념, 이상이하개념X)
		boolean rs5 = var1 == var2; // var1은 var2와 서로 같다.
		boolean rs6 = var1 != var2; // var1은 var2와 서로 다르다.(논리 부정 연산자)
		
		System.out.println("rs1 : " + rs1); //false
		System.out.println("rs2 : " + rs2); //true
		System.out.println("rs3 : " + rs3); //false
		System.out.println("rs4 : " + rs4); //true
		System.out.println("rs5 : " + rs5); //false
		System.out.println("rs6 : " + rs6); //true
		
		
		//논리연산자
		int var3 = 3;
		int var4 = 4;
		
		//res : 결과를 저장하기 위해 사용되는 변수명
		// &&=and(그리고) , 둘 중에 하나가 거짓이면 거짓(false)
		// ||=or(또는), 둘 중에 하나가 참이면 참(ture)
		
		boolean res1 = (var3 > 3) && (var4 > 3); // var3은 3보다 크고 그리고 var4는 3보다 작다
		boolean res2 = (var3 > 2) && (var4 > 3); // var3은 2보다 크고 그리고 var4는 3보다 작다
		boolean res3 = (var3 > 3) || (var4 > 3); // var3은 3보다 크거나 var4는 3보다 작다
		boolean res4 = (var3 > 3) || (var4 > 5); // var3은 3보다 크거나 var4는 5보다 작다
		boolean res5 = !(var3 > var4); // var3은 var4보다 크지 않다
		                        // 크고 작음의 여부를 확인하고 ,결과를 반전시킨 값을 res5에 할당
		
		System.out.println("res1 : " + res1); // false
		System.out.println("res2 : " + res2); // true
		System.out.println("res3 : " + res3); // true
		System.out.println("res4 : " + res4); // false
		System.out.println("res5 : " + res5); // true
		
		
	}
}
