package test4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/*
 * 날짜 : 2023/06/30
 * 이름 : 이황성
 * 내용 : 컬렉션 연습문제
 */
public class Test10 {
	public static void main(String[] args) {
			//
		?????? list1 = new ArrayList<>();
		list1.add(new Apple("파주", 3000));
		list1.add(new Apple("이천", 3000));
		list1.add(new Apple("수원", 3000));
			//
		?????? list2 = new ArrayList<>();
		list2.add(new Apple("청주", 3000));
		list2.add(new Apple("충주", 3000));
		list2.add(new Apple("단양", 3000));
			//
		?????? list3 = new ArrayList<>();
		list3.add(new Apple("밀양", 3000));
		list3.add(new Apple("함안", 3000));
		list3.add(new Apple("합천", 3000));
			//
		?????? map = new HashMap<>();
		map.put("gyeonggi", list1);
		map.put("chungbuk", list2);
		map.put("gyungnam", list3);
		
		// 수원 사과 출력/////////////
		?????? list = map.get("gyeonggi");
		Apple apple = list.??????
		apple.show();
		
		// 충주 사과 출력/////////////
		map.??????
		
		// 밀양 사과 출력/////////////
		map.??????
		

	}
}
