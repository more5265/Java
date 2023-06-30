package ch12.sec03.exam02;

public class Student {
	private int no; // 학번을 저장하는 멤버 변수
	private String name; // 이름을 저장하는 멤버 변수
	
	public Student(int no, String name) {
		this.no = no; // 학번을 초기화하는 생성자 매개변수
		this.name = name; // 이름을 초기화하는 생성자 매개변수
	}
	
	public int getNo() { return no; } // 학번을 반환하는 getter 메서드
	public String getName() { return name; } // 이름을 반환하는 getter 메서드
	
	public int hashCode() { // 학번과 이름의 해시코드를 더한 값을 반환하는 메서드
		int hashCode = no + name.hashCode();
		return hashCode; 	
	}
	public boolean equals(Object obj) {
		// 객체의 동등성을 검사하는 메서드
		if(obj instanceof Student target) { // obj가 Student 클래스의 인스턴스인지 확인
			if(no == target.getNo() && name.equals(target.getName())) { // 학번과 이름이 동일한지 확인
				return true; //동일하다면 true 반환
			}
		}
		return false; // 학번이나 이름이 다르다면 false 반환
		
	}

}
