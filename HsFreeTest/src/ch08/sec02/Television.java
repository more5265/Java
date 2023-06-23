package ch08.sec02;
				//Television객체를 인터페이스를 구현한(implements) 객체
public class Television implements RemoteControl {

	@Override
	public void turnOn() {
		System.out.println("TV를 켭니다.");
	}

}
