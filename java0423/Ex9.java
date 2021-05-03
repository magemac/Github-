package java0423;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class Ex9 {

	public static void main(String[] args) {
		// Ex7 예제에서 버퍼를 적용하기
		
		// 문자세트를 직접 지정해서 텍스트 파일 읽기
		BufferedReader reader = null;

		try {
			String path = "C:/devtools/temp/text2.txt";
			reader = new BufferedReader(new InputStreamReader(new FileInputStream(path), "MS949"));
			
			String line;
			while ((line = reader.readLine()) != null) {
				System.out.print(line + "\n");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	} // main

}
