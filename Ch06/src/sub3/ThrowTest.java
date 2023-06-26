package sub3;
/*
 * 날짜 : 2023/06/26
 * 이름 : 이황성
 * 내용 : Java 예외 발생 시키기 실습하기 (p480)
 */

//사용자 정의 예외클래스
class MinusException extends Exception {
	
	public MinusException(String msg) {
		super(msg);
	}
}

class OverException extends Exception {
	
	public OverException(String msg) {
		super(msg);
	}
}

class Score {
	public void check(int score) throws MinusException, OverException{ //Exception 가능
		
		if(score < 0) {
			// 예외 발생 시키기 (점수가 -)
			throw new MinusException("점수는 음수가 될 수 없습니다."); // 예외 객체를 던진다, throws 선언
			
		}else if(score > 100) {
			// 예외 발생 시키기 (점수가 100이상)
			throw new OverException("100점을 초과할 수 없습니다.");
		}
		
	}
	
}



public class ThrowTest {
	public static void main(String[] args) {
		
		Score score = new Score();
		try {
		score.check(-3);
		
		score.check(102);
		
		score.check(96);
		}catch (MinusException e) {
			e.printStackTrace(); 
				
		}catch (OverException e) {
			e.printStackTrace();
		}
		System.out.println("프로그램 정상 종료...");
	}
}




