package ch05.sec12;

import java.util.Calendar;

public class WeekExample {
	
	public static void main(String[] args) {
		
		Week today = null;
		
		Calendar cal = Calendar.getInstance();
		
		int week = cal.get(Calendar.DAY_OF_WEEK);
		
		switch (week) {
		case 1: today = Week.SUNDAY; break;
		case 2: today = Week.MONDAY; break;
		case 3: today = Week.SUNDAY; break;
		case 4: today = Week.SUNDAY; break;
		case 5: today = Week.SUNDAY; break;
		case 6: today = Week.SUNDAY; break;
		case 7: today = Week.SUNDAY; break;
		
		}
		
		if(today == Week.WEDNESDTY) {
			System.out.println("오늘은 수요일입니다.");
		}else {
			System.out.println("열심히 자바를 공부합니다.");
		}
	}

}
