package sub3;

import java.io.Serializable;

public class Apple implements Serializable{ //인터페이스 구현
	private static final long serialVarsionUiD = 1L;
	private String country;
	private int price;
	
	public Apple(String country, int price) {
		this.country = country;
		this.price = price;
	}
	public void show() {
		System.out.println("원산지 : " + country);
		System.out.println("가격 : " + price);
	}
	
	
}
