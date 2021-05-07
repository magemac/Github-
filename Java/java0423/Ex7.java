package java0423;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;

public class Ex7 {

	public static void main(String[] args) {
		// 문자세트를 직접 지정해서 텍스트 파일 읽기
		InputStreamReader reader = null;
		FileInputStream fis = null;
		
		try {
			fis = new FileInputStream("C:/devtools/temp/text2.txt"); // 베이스 클래스
			reader = new InputStreamReader(fis, "MS949");
			
			int data;
			while ((data = reader.read()) != -1) {
				System.out.print((char) data);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	} // main

}



