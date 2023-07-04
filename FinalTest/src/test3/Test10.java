package test3;
/*
 * 날짜 : 2023/06/23  
 * 이름 : 이황성
 * 내용 : 
 */
interface Buyer {
	public void buy();
}

interface Seller {
	public void sell();
}

class Customers ?????{

	@Override
	public void sell() {
		System.out.println("판매하기");
	}

	@Override
	public void buy() {
		System.out.println("구매하기");
	}
}

public class Test10 {
	public static void main(String[] args) {
		Buyer  buyer  = ?????
		Seller seller = ?????

		buyer.buy();
		seller.sell();
	}
}