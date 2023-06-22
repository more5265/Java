package sub9;

public class Cable implements Socket {

	private Bulb bulb;
	
	public Cable(Bulb bulb) {
		this.bulb = bulb;
	}
	
	public void SwitchOn() {
		bulb.lightOn();
	}
	public void SwitchOff() {
		bulb.ligntOff();
	}

}
