package java0423;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) {
		// 키보드로 입력받은 내용을 텍스트 파일로 쓰기
		
		Scanner scanner = new Scanner(System.in); // 키보드 입력스트림 객체 준비
		
		// 텍스트 파일 출력스트림 객체 준비
		// 출력스트림은 내부적으로 항상 버퍼를 가지고 있어서
		// 출력스트림 객체를 닫거나, 버퍼를 비워야만 출력이 일어남
		FileWriter fileWriter = null;
		
		try {
			fileWriter = new FileWriter("C:/devtools/temp/text3.txt", false);
			
			System.out.println("=== /q 를 입력하면 종료합니다. ===");
			System.out.println("텍스트 파일로 출력할 내용을 키보드로 입력해 보세요.");
			
			while (true) {
				String line = scanner.nextLine(); // \n은 내용에 포함되지 않고 가져옴
				if (line.equals("/q")) {
					break;
				}
				fileWriter.write(line + "\n");
			}
			// 출력스트림 객체의 버퍼 안의 내용을 비우기 -> 출력이 발생
			//fileWriter.flush();
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				fileWriter.close(); // 출력스트림 객체 닫으면 내부적으로 flush() 자동 호출
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		System.out.println("=== 프로그램 정상 종료 ===");
	} // main

}
