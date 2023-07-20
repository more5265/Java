package confirm.ch04;

public class Test4 {
	public static void main(String[] args) {
		
		while(true) {
			
		int dice1 = (int) (Math.random() * 6) +1;
		int dice2 = (int) (Math.random() * 6) +1;
		int sum = dice1 + dice2;
		
		System.out.println("(" + dice1 + ", " + dice2 + ")");
		
		if (sum ==5) {
			System.out.println("주사위 합이 5입니다. 실행을 멈춥니다.");
			break;
		}
	}
	}
}
