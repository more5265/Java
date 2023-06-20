package step2;

import java.util.Scanner;

/*
 * Quadrant n = 제n 사분면
 * (12,5)좌표를 가진 점 A는 x, y좌표 모두 양수이므로 제1사분면에 속한다
 * (12,5) 점 B는 x좌표가 음수, y좌표가 양수이므로 제2사분면에 속한다
 * 
 * 예제 (세로로) 12 5  , 1
 *            9 -13 , 4
 */
public class Test04 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		int y = sc.nextInt();
		
			if(x > 0) {
				if(y > 0) {
					System.out.println("1");
				}else {
					System.out.println("4");
				}
			}else if(y > 0) {
				System.out.println("2");	
		}else {
			System.out.println("3");
		}
	sc.close();		
	}
		
}

