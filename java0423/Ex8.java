package java0423;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Ex8 {

	public static void main(String[] args) {
		// Ex6 예제에서 버퍼를 적용하기

		// 텍스트 파일 읽기
		
		BufferedReader reader = null;
		// 입력 스트림 객체 준비
		try {
			// FileReader 는 베이스 클래스로서 직접 외부자원 처리를 담당하는 클래스이다.
			reader = new BufferedReader(new FileReader("C:/devtools/temp/text.txt"));

			// readLine() 메소드는 파일 등의 입력내용의 끝을 만나면 null 값을 리턴해줌
			// 한번 호출때마다 줄바꿈 문자(\n) 이전까지 내용을 문자열로 리턴해줌
			// 줄바꿈문자는 포함하지 않기때문에 필요하면 줄바꿈 문자를 넣어줄필요가 있음
			String line;
			while ((line = reader.readLine()) != null) {
				System.out.print(line + "\n");
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
