package test8;

import java.io.FileWriter;
import java.io.File;

/*
 * 날짜 : 2023/07/21
 * 이름 : 이황성
 * 내용 : 자바 총정리 연습문제
 */
public class Test09 {
	
	public static void main(String[] args) {
		
		String path = "C:\\Users\\Java\\Desktop\\Gugudan.txt";
		
		try {
			File file = new File(path);
			FileWriter fw = new FileWriter(file);
			
			for(int x=2 ; x<=9 ; x++) {
				
				fw.write(x + "단\n");
				
				for(int y=1 ; y<=9 ; y++) {
					int z = x * y;
					System.out.println(x + " x " + y + " = " + z + "\n");
				}
			}
			fw.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("구구단 파일생성 완료...");
	}

}
