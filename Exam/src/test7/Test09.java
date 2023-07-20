package test7;
/*
 * 날짜 : 2023/07/19
 * 이름 : 이황성
 * 내용 : 자바 연습문제7
 */
interface Tv {
	public void turnOn();
	public void turnOff();
}


public class Test09 {
	public static void main(String[] args) {
		
		Tv tv = new Tv() {
			@Override
			public void turnOn() {
				System.out.println("Tv를 켭니다.");
			}
			
			@Override
			public void turnOff() {
				System.out.println("Tv를 끕니다.");
			}
		};
		
		tv.turnOn();
		tv.turnOff();
	}

}
