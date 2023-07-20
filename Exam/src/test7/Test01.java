package test7;
/*
 * 날짜 : 2023/07/19
 * 이름 : 이황성
 * 내용 : 자바 연습문제7
 */

class Box {
	private double width;
	private double height;
	private double depth;
	

	public Box(double width, double height, double depth) {
		super();
		this.width = width;
		this.height = height;
		this.depth = depth;
	}





	public double volume() {
		return width * height * depth;
	}
}

public class Test01 {
	
	public static void main(String[] args) {
		Box box1 = new Box(1, 2, 3);
		Box box2 = new Box(3, 6, 9);
		
		System.out.println("box1 부피 : " + box1.volume());
		System.out.println("box2 부피 : " + box2.volume());
	}

}
