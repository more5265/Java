package sub1;
/*
 * 날짜 : 2023/06/14
 * 이름 : 이황성
 * 내용 : Java 배열 실습하기
 */
public class ArrayTest {
	public static void main(String[] args) {
		
		// 배열
		int[]    arr1 = {1, 2, 3, 4, 5};// []:배열 기호, {}:변수, arr1:참조타입
		char[]   arr2 = {'A', '1', 'C'};
		String[] arr3 = {"서울", "대전", "대구", "부산", "광주"};
		
		System.out.println("arr1[0] : " + arr1[0]); //첫 번째 배열 arr1[0] : 1
		System.out.println("arr1[2] : " + arr1[2]); //세 번째 배열 arr1[2] : 3
		System.out.println("arr1[3] : " + arr1[3]); //네 번째 배열 arr1[3] : 4
		
		System.out.println("arr2[2] : " + arr2[2]); //세 번째 배열 arr2[2] : C
		
		System.out.println("arr3[3] : " + arr3[3]); //네 번째 배열 arr3[3] : 부산
		
		// 원소 출력 
		System.out.println("arr1[0] : " + arr1[0]); // arr1[0] : 1
		System.out.println("arr1[2] : " + arr1[2]); // arr1[2] : 3
		System.out.println("arr1[3] : " + arr1[3]); // arr1[3] : 4
		
		System.out.println("arr2[2] : " + arr2[2]); // arr2[2] : C
		
		System.out.println("arr3[3] : " + arr3[3]); // arr3[3] : 부산
		
		// 배열 길이
		System.out.println("arr1 길이 : " + arr1.length); // arr1 길이 : 5 // 원소의 갯수 5
		System.out.println("arr2 길이 : " + arr2.length); // arr2 길이 : 3 // 원소의 갯수 3
		System.out.println("arr3 길이 : " + arr3.length); // arr3 길이 : 5 // 원소의 갯수 5
		
		// 배열 반복문(for문)
		for(int i=0 ; i<arr1.length ; i++) {
			System.out.print(arr1[i]+" "); // 1 2 3 4 5
		}
		System.out.println(); //개행
			
         //↓변수  //↓배열
		for(char c : arr2) {
			System.out.print(c+" "); // A 1 C
		}
		System.out.println(); //개행
		
		for(String city : arr3) {
			System.out.print(city+" "); // 서울 대전 대구 부산 광주
		}
		System.out.println(); //개행
		
		// 1차원 배열
		int[] scores = {80, 60, 78, 62, 92};
		int total = 0;
                //↓변수  //↓배열
		for(int score : scores) {
			total += score;
		}
		System.out.println("scores 합 : " + total); // scores 합 : 372
		
		// 2차원 배열
		int[][] arr2d = {{1,  2,  3,  4}, //2차원으로 표현하여 행과 열이 만들어짐
						 {5,  6,  7, 8}, 
						 {9, 10, 11, 12}};  //행렬 arr2d[0][0] : 1 / arr2d[0][3] : 4
		
		for(int a=0; a<3 ; a++) {
			
			for(int b=0 ; b<4 ; b++) {
				System.out.println("arr2d["+a+"]["+b+"] : " + arr2d[a][b]);
			}
		}
		
		// 3차원 배열
		int[][][] arr3d = {{{1,  2,  3}, //3차원 arr3d[0][0][0] : 1 , arr3d[0][0][2] : 3
							{4,  5,  6,},
							{7,  8,  9}},
						   {{10, 11, 12}, // arr3d[1][0][2] : 12
							{13, 14, 15}, 
							{16, 17, 18}}, // arr3d[1][2][2] : 18
						   {{19, 20, 21},
							{22, 23, 24}, 
							{25, 26, 27}}}; //arr3d[2][2][1] : 26
		
		for(int a=0; a<3; a++) {
			for(int b=0; b<3; b++) {
				for(int c=0; c<3; c++) {
					System.out.printf("arr3d[%d][%d][%d] : %d\n", a, b, c, arr3d[a][b][c]);
				}
			}
		}
	}
}

