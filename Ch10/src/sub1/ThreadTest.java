package sub1;
/*
 * 날짜 : 2023/07/03
 * 이름 : 이황성
 * 내용 : Java Thread 실습하기 
 * 
 * 스래드(Thread)
 * 	- 하나의 프로세스 안에서 실행되는 프로그램 실행흐름
 * 	- 스레드는 동시에 실행되는 병행 실행
 * 	- Thread 클래스를 상속 받아 start 실행
 */
public class ThreadTest {
	public static void main(String[] args) { //메인 실행
		
		SubThread st1 = new SubThread("Sub1");
		SubThread st2 = new SubThread("Sub2");
		
		// 자식 스레드 실행 (start)
		st1.start(); 
		st2.start();
		
		for(int i=0 ; i<10 ; i++) {
			
			try {
				//1초 대기
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			} //초퍼
			
			System.out.println("Main Thread 실행...");
		}
		
		System.out.println("Main Thread 종료...");
	}

}
