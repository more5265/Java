package sub1;

public class constant2 {

    public static void main(String[] args) {
        final int NUM = 100; // int 유형의 상수 MAX_VALUE를 선언하고 100을 할당
        System.out.println(NUM); // 출력: 100

        // MAX_VALUE = 200; // 오류: 상수는 값을 변경할 수 없음
    }
}
