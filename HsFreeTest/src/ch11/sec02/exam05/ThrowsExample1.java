package ch11.sec02.exam05;

public class ThrowsExample1 {
	public static void main(String[] args) {
		
		try {
			findClass();
		} catch(ClassNotFoundException e) {
			System.out.println("예외 처리 : " +e.toString());
			
		} // try~catch : 호출한 곳에서 예외 처리
	}
	
	public static void findClass() throws ClassNotFoundException {
		Class.forName("java.lang.String2");
	}

}
