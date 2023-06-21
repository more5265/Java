package Ch02;

public class Encapluetest {
	
	public static void main(String[] args) {
		
		Car sonata = new Car("소나타", "흰색", 10);
		
		sonata.setName("그렌져");
		sonata.speedup(80);
		sonata.speeddown(20);
		sonata.show();
		
		Car avante = new Car("아반테", "검정", 10);
		avante.setColor("남색");
		avante.speedup(60);
		avante.speeddown(15);
		avante.show();
		
		Account KB = new Account("국민", "123-1234-1", "김유신", 1000);
		
		KB.deposit(45000);
		KB.witharaw(16000);
		KB.show();
		
		Account WR = new Account("우리", "101-2211-33", "김춘추", 5000);
		
		WR.deposit(64000);
		WR.witharaw(8000);
		WR.show();
		
	}

}
