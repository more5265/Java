package test7;
/*
 * 날짜 : 2023/07/19
 * 이름 : 이황성
 * 내용 : 자바 연습문제7
 */
interface Player {
    public void play();
}

class BaseBallPlayer implements Player {
	@Override
	public void play() {
		System.out.println("야구를 합니다.");
	}
}

class FootBallPlayer implements Player {
	@Override
	public void play() {
		System.out.println("축구를 합니다.");
	}
}


public class Test07 {
	public static void main(String[] args) {
		
		Player p1 = new BaseBallPlayer();
		Player p2 = new FootBallPlayer();
		
		playGame(p1);
		playGame(p2);
	}

	private static void playGame(Player p ) {
		p.play();
	}

}
