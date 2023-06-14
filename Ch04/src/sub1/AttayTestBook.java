package sub1;
/*
 * 책 예문 p166
 */
public class AttayTestBook {
	public static void main(String[] args) {
		
		int[] score = {85, 90, 70, 75, 95, 65, 90, 85, 80, 85};
		
		int sum = 0;
		for(int i=0; i<10; i++) {
			sum += score[i];
		}
		int avg = sum / 10;
		System.out.println("10명의 평균 점수는 : " + avg);
	}
}


