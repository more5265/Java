package confirm.ch05;

/*
 * 날짜 : 2023/07/19
 * 이름 : 이황성
 * 내용 : p199
 */
public class test2 {
	public static void main(String[] args) {
		
		int[] array = {1, 5, 3, 8, 2};
		
		int maxNum = array[0];
		
		for(int num : array) {
			if(num > maxNum) {
				maxNum = num;
			}
		}
		System.out.println(maxNum);
	}

}
