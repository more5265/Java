package sub4;
/*
 * 날짜 : 2023/06/14
 * 이름 : 이황성
 * 내용 : Java 반복문 while 실습하기
 */
public class WhileTest {
	public static void main(String[] args) {
		
		// 1부터 10까지 합
		int sum = 0; // 변수 sum 을 사용하여 숫자들의 합을 계산
		int k = 1; // 1부터 10까지의 숫자를 나타냄
		
		while(k <= 10) { // whlie문의 조건문은 k 가 10 이하인 동안 반복된다.
			
			sum += k; // 각 반복마다 sum 에 k 를 더하고,
			k++; // k 는 1씩 증가한다.
			// 반복이 종료되면 1부터 10까지의 합이 출력된다.
		}
		
		System.out.println("1부터 10까지 합 : " + sum);
		
		// do ~ while
		int tot = 0; // 짝수의 합을 저장할 변수
		int i = 1; // 1부터 10까지를 나타내기 위해
		
		do {
			if(i % 2 == 0) {
			tot += i;
			
			}
			
			i++;
		
		}
			
		while(i <= 10);
			
		System.out.println("1부터 10까지 짝수합 : " + tot);
			
		
		// break
		int num = 1; // num변수를 사용하여 숫자로 표현하고
		
		while(true) { //while 루프는 true 로 설정하여 무한히 반복한다
			
			if(num % 5 == 0 && num % 7 == 0) { // &&(그리고) 둘 다 포함되어야 true(참)
				break; //반복문 종료(반복문 탈출)
			}
			num++; // num을 1씩 증가
		}
		System.out.println("5와 7의 최소공배수 : " + num);
		
		
		// continue
		int total = 0; //total 변수 설정 및 0으로 초기화
		int j = 0; // j 변수 설정 및 0으로 초기화
		
		while(j <= 10) { // j가 10일 때까지 반복한다
			
			j++; // j가 1씩 증가함
			
			if(j % 2 == 1) { // j가 2로 나뉘었을 때 나머지가 1이면 참
				continue; // 참일 때 다음 반복으로 넘어감(위로 올라감) 이 경우 total에는
				 //짝수들의 합이 더해지지 않지만, j 가 짝수인 경우에는 total에 j가 더해진다
			}
			
			total += j;
		}
		
		System.out.println("1부터 10까지 짝수합 : " + total);
		
		
	}
}
