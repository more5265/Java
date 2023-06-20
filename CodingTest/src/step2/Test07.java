package step2;

import java.util.Scanner;
/*
 * 1에서부터 6까지의 눈을 가진 3개의 주사위를 던져서 다음과 같은 규칙에 따라 상금을 받는 게임이 있다. 
 1. 같은 눈이 3개가 나오면 10,000원+(같은 눈)×1,000원의 상금을 받게 된다. 
 2. 같은 눈이 2개만 나오는 경우에는 1,000원+(같은 눈)×100원의 상금을 받게 된다. 
 3. 모두 다른 눈이 나오는 경우에는 (그 중 가장 큰 눈)×100원의 상금을 받게 된다.  
 * ex)
 * 3개의 눈 3, 3, 6이 주어지면 상금은 1,000+3×100으로 계산되어 1,300원을 받게 된다
 * 3개의 눈이 2, 2, 2로 주어지면 10,000+2×1,000 으로 계산되어 12,000원을 받게 된다
 * 
 * 예제1 입력 3 3 6 , 출력 1300
 * 예제2 입력 2 2 2 , 출력 12000
 * 예제3 입력 6 2 5 , 출력 600
 */
public class Test07 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		 int[] dice = new int[3];
		 
	        for (int i = 0; i < 3; i++) {
	            dice[i] = sc.nextInt(); 
	        }

	        int prize = 0; 

	        if (dice[0] == dice[1] && dice[1] == dice[2]) { 
	            prize = 10000 + dice[0] * 1000;
	        } else if (dice[0] == dice[1] || dice[1] == dice[2] || dice[0] == dice[2]) { 
	            if (dice[0] == dice[1]) {
	                prize = 1000 + dice[0] * 100;
	            } else if (dice[1] == dice[2]) {
	                prize = 1000 + dice[1] * 100;
	            } else {
	                prize = 1000 + dice[0] * 100;
	            }
	        } else { 
	            int max = Math.max(dice[0], Math.max(dice[1], dice[2]));
	            prize = max * 100;
	        }
	        

	        System.out.println(prize);

	        sc.close();
	    }
	}

