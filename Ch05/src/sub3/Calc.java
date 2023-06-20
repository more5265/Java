package sub3;

public class Calc {
	
	//싱글톤 객체 (static을 활용한)
	private static Calc instance = new Calc();
	public static Calc getInstance() {
		return instance;
	}
	
	private Calc() {
		
	}
	
	
	public int plus(int x, int y) {
		return x + y;
		
	}
	public int minus(int x, int y) {
		return x - y;
		
	}
	public int mlti(int x, int y) {
		return x * y;
		
	}
	public int div(int x, int y) {
		return x / y;
		
	}

}
