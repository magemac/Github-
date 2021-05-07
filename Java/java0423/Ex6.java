package java0423;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Ex6 {

	public static void main(String[] args) {
		// 텍스트 파일 읽기
		FileReader reader = null;
		// 입력 스트림 객체 준비
		try {
			// FileReader 는 베이스 클래스로서 직접 외부자원 처리를 담당하는 클래스이다.
			reader = new FileReader("C:/devtools/temp/text.txt");
			
			// read() 메소드는 파일 등의 입력내용의 끝을 만나면 -1 음수값을 리턴해줌
			// 한번 호출때마다 한개의 문자(2byte)를 int형으로 리턴해줌
			int data;
			while ((data = reader.read()) != -1) {
				System.out.print((char) data);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				reader.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	} // main

}
