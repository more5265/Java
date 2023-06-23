package Ch03;

public class Sedan extends Car{

	private int cc;
	
	public Sedan(String name, String color, int speed, int cc) {
		super(name, color, speed);
		this.cc = cc;
	}
	public void speedTrubo() {
		this.speed += 20;
	}

}
