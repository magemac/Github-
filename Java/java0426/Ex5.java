package java0426;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

public class Ex5 {

	public static void main(String[] args) {
		// 네트워크 프로그래밍
		//   URL 클래스 : URL주소를 사용하여 여러 기능을 제공해주는 클래스
		
		BufferedReader reader = null;
		StringBuilder sb = new StringBuilder(); // 문자열 버퍼 객체
		
		try {
			// 입력스트림 준비
			URL url = new URL("https://www.naver.com/");
			reader = new BufferedReader(new InputStreamReader(url.openStream(), "UTF-8"));

			String line = "";
			while ((line = reader.readLine()) != null) { // "\n" 줄바꿈문자 앞까지 한줄을 가져옴
				sb.append(line + "\n"); // 뒤에 추가
			} // while
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		// 출력
		System.out.println(sb.toString());
	} // main

}
