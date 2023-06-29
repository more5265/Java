package sub1;
/*
 * 날짜 : 2023/06/28
 * 이름 : 이황성
 * 내용 : Java 제네릭 실습하기 (p570)
 *
 * 제네릭(Generic)
 * 	- 클래스 내부의 속성 타입을 동적으로 일반화 시키는 문법
 * 	- 제네릭 사용으로 클래스를 범용성있게 사용
 */
public class GenericTest {
	public static void main(String[] args) {
		
		Apple a = new Apple("한국", 3000); //Apple클래스의 인스턴스를 생성
		Banana b = new Banana("일본", 2000); //Banana클래스의 인스턴스를 생성
		
		FruitBox<Apple> applebox = new FruitBox<>();
		//Apple객체를 저장할 수 있는 FruitBox객체 생성
		
		applebox.setFruit(a); 
		// applebox에 과일을 설정. applebox는 Apple객체만 받을 수 있으므로 Apple객체 설정
		
		
		
		System.out.println(applebox.getFruit());
		
		FruitBox<Banana> bananabox = new FruitBox<>();
		//Banana객체를 저장할 수 있는 FruitBox객체 생성
		
		bananabox.setFruit(b); 
		// banana에 과일을 설정. bananaBox는 banana 객체만 받을 수 있으므로 banana객체 설정
		
		System.out.println(bananabox.getFruit());
	}
}
