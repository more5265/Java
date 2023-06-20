package step3;
import java.util.Scanner;
/*
 * N을 입력받은 뒤, 구구단 N단을 출력하는 프로그램을 작성하시오. 출력 형식에 맞춰서 출력하면 된다.
 * 첫째 줄에 N이 주어진다. N은 1보다 크거나 같고, 9보다 작거나 같다.
 * 출력형식과 같게 N*1부터 N*9까지 출력한다.
 * 예제 입력 2 , 출력 2 x 1 = 2 ......
 */
public class Test01 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt(); {

			for (int y = 1; y <= 9; y++) {
			int z = n * y;
				System.out.println(n + " * " + y + " = " + z);
			}
		}
	}
}