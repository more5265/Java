package test4;

import java.util.Scanner;

/*
 * 날짜 : 2023/06/30
 * 이름 : 이황성
 * 내용 : 문자열 연습문제
 */
public class Test04 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String[] names = {"김유신", "김춘추", "장보고", "강감찬", "이순신", "정약용"};
		
		System.out.print("이름 검색 : ");
		String name = sc.next();
		
		int i = 0;
		while(!name.??????(names[i])) { //문자열비교, == 주의
			i++;	//
		}
		System.out.println(name + "은 배열의 "+i+"번에 있습니다ㅏ.");
		sc.close();
	}

}
