package sub2;

import java.util.stream.IntStream;
/*
 * 10미만의 자연수에서 3과 5의 배수를 구하면 3, 5, 6, 9 이다. 총합은 23이다.
 * 1000미만의 자연수에서 3, 5의 배수의 총합을 구하라.
 */
class Multiples3And5 {
	public static void main(String[] args) {
		// 1000미만의 자연수에서 3과 5의 배수의 총합을 출력
        System.out.println(String.format("정답: %d", getSumOfMultiples(1000)));
    }
	// 주어진 범위에서 3과 5의 배수의 총합을 구하는 메소드
    private static int getSumOfMultiples(int end) {
    	// InStream 사용으로 1부터 end-1까지의 숫자 스트림을 생성
    	// filter를 사용하여 3의 배수 또는ㄴ 5의 배수인 숫자만 필터링
    	// sum을 사용하여 필터링된 숫자들의 합을 계산
        return IntStream.range(1, end).filter(j -> j%3==0 || j%5==0).sum();
    }

}
