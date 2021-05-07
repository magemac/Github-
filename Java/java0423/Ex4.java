package java0423;

import java.util.Scanner;

public class Ex4 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
//		scanner.hasNextInt(); // 다음 입력 정수가 있는지 확인 true/false 리턴
//		scanner.nextInt(); // 호출할때마다 공백문자(엔터키,탭,스페이스바 키 입력) 이전의 숫자 한개를 가져옴
//		
//		scanner.hasNext(); // 다음 입력 문자열이 있는지 확인 true/false 리턴
//		scanner.next(); // 호출할때마다 공백문자(엔터키,탭,스페이스바 키 입력) 이전의 문자열 한개를 가져옴
//		
//		scanner.hasNextLine(); // 한줄 입력된 문자열("\n" 으로 끝나는)이 있는지 확인 true/false 리턴
//		scanner.nextLine(); // 호출할때마다 줄바꿈문자(엔터키 입력) 이전의 문자열 한개를 가져옴
		
		int num = 0;
		
		try {
			System.out.print("숫자를 입력하세요: ");
			num = scanner.nextInt();
			// nextInt는 사용자 입력값을 문자열로 받아서 Integer.parseInt()를 시도함
			// 사용자가 정수값이 아닌 문자열 등을 입력시 정수형으로 변환 실패로 예외 발생함
			System.out.println("입력한 숫자는 " + num);
		} catch (Exception e) {
			// catch 블록은 예외 발생시 예외처리를 담당함
			e.printStackTrace();
		} finally {
			// finally 블록은 예외처리와 관련없음
			// 예외가 발생하든 안하든 try블록 실행 후 정리작업이 필요할때 finally블록 사용할수 있음
			
			// 입출력 객체는 사용이 끝난 시점에는 시스템 자원을 반환해워야 함
			// 하드웨어 사용과 관련된 자원은 운영체제가 담당함
			// 하드웨어 사용하려면 운영체제의 자원을 사용해야 함
			// 운영체제로부터 빌려온 자원을 사용이 끝나면 반납해줘야 함
			
			scanner.close(); // 비유: 가스밸브 잠그기는 예외 발생 여부와 관계없이 공통작업
		}
		
		System.out.println("num = " + num);
		
		System.out.println("=== 프로그램 정상종료 ===");
	} // main

}
