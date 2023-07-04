package test3;
/*
 * 날짜 : 2023/06/23  
 * 이름 : 이황성
 * 내용 : 
 */

class Student {
	public static String studentName;
	private String major;
	private int grade;
	????? studentId;
	
	public Student(String studentName, String major, int grade) {
		Student.studentId++;
		Student.studentName = studentName;
		this.major = major;
		this.grade = grade;
	}
	
	public void studentInfo() {
		System.out.println("===============");
		System.out.println("학번 : "+studentId);
		System.out.println("이름 : "+studentName);
		System.out.println("전공 : "+major);
		System.out.println("학년 : "+grade);
		System.out.println("---------------");
	}
}

public class Test04 {
	public static void main(String[] args) {
		
		Student.studentId = 20201000;
		
		Student kim = ?????
		kim.studentInfo();
		
		Student lee = ?????
		lee.studentInfo();
		
		Student lim = ?????
		lim.studentInfo();
		
	}
}
