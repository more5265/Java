package step2;

import java.util.Scanner;

/*
 * 45분 일찍 알람 설정하기
 * 원래 설정되어 있는 알람을 45분 앞서는 시간으로 바꾸는 것
 * 
 * 첫째 줄에 두 정수 H와 M이 주어진다. (0 ≤ H ≤ 23, 0 ≤ M ≤ 59) 
 * 그리고 이것은 현재 상근이가 설정한 알람 시간 H시 M분을 의미한다.
 * 입력 시간은 24시간 표현을 사용한다. 24시간 표현에서 하루의 시작은 0:0(자정)이고, 
 * 끝은 23:59(다음날 자정 1분 전)이다. 시간을 나타낼 때, 불필요한 0은 사용하지 않는다.
 * 
 * 예제 10 10 , 출력 9 25
 */
public class Test05 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int h = sc.nextInt();
		int m = sc.nextInt();
		int total = h*60+m-45;
		
		if(total<0) {
			total+=24*60;
		}
		System.out.println(total/60 +" " +total%60);
		
	}
}
/*
 * m -=45;
 * h-1
 * m+60
 * 이런식으로 코드를 짜도 되지만,
 * 재활용이 안되는 풀어쓴 코드라서 지양해야함
 * 재활용이 가능한 함축된 코드를 사용
 */


