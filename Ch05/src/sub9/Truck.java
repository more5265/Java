package sub9;

public class Truck implements Car{

	private String name;
	private String color;
	private int speed;

	
	
	public Truck(String name, String color, int speed) {
		super();
		this.name = name;
		this.color = color;
		this.speed = speed;
	}

	@Override
	public void speedup(int speed) {
		this.speed += speed;
	}

	@Override
	public void speeddown(int speed) {
		this.speed -= speed;
	}

	@Override
	public void show() {
		System.out.println("치량명 : " + this.name);
		System.out.println("차량색 : " + this.color);
		System.out.println("현재속도 : " + this.speed);
		}
}

