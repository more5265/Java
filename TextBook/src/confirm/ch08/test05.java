package confirm.ch08;

interface Remocon {
	public void powerOn();
}


class TV implements Remocon {
	@Override
	public void powerOn() {
		System.out.println("TV를 켰습니다.");
	}
}

class test05 {
	public static void main(String[] args) {
		Remocon r = new TV();
		r.powerOn();
	}

}
