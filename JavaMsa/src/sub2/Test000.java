package sub2;
// 0부터 9999까지 8을 포함하지 않는 수는 총 몇개일까?
public class Test000 {
	public static void main(String[] args) {


		final int MAX_NUM = 9999;

	        int resultMinus = 0;
	        int i = 0;
	        for (; i <= MAX_NUM; i++) { // 9999까지 Loop

	            // break시작지점
	            char[] digit = String.valueOf(i).toCharArray();

	            for (int j = 0; j < digit.length; j++) { //  digit의 자리수 Loop
	                if (digit[j] == '8') { // 8이 포함된 자리가 있다면 Minus 카운트 후 break
	                    resultMinus++;
	                    break;
	                }
	            }
	        }

	        System.out.println("[0~9999] 의 숫자 중 8을 포함하지 않는 수의 갯수 : " + (i - resultMinus)); // 0부터 9999까지의 숫자 개수 - 8포함된 숫자 개수
	    }
	}
