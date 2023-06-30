package test4;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;
/*
 * 날짜 : 2023/06/30
 * 이름 : 이황성
 * 내용 : 로또번호 연습문제
 */
public class Test08 {
	public static void main(String[] args) {
		
		for(int count=1; count <=5; count++) {
			System.out.println(makeLotto());
		}
	}
					//
	public static Set<Integer> makeLotto() { //1 리턴값 확인 후 작성
		
		Set<Integer> lottoSet = new HashSet<>();
		
		for(;;) { //무한반복
			int num = (int) Math.ceil(Math.random() * 45); //1~45 정수 임의의 코드
									//
					lottoSet.add(num);
						//
					if(lottoSet.size() == 6	 ) {
						break;
					}
		}
		
		//정렬
		Set<Integer> treeSet = new TreeSet<>(lottoSet); //2 확인완료
		
		return treeSet;
	}
	
	
	
	
	
	
}
