package java0409;

import java.util.Scanner;

public class Ex7 {

	public static void main(String[] args) {
		// do-while문
		// 첫번째 반복은 조건에 상관없이 무조건 수행이 한번 보장됨.
		
//		do {
//			// 반복수행할 문장;
//		} while (조건식); // 세미콜론으로 끝나는것에 주의!
		
		Scanner scanner = new Scanner(System.in); // 키보드 입력 객체 준비
		
		int num;
		// do-while문
		do {
			System.out.print("숫자 한개를 입력(0이면 종료): ");
			num = scanner.nextInt();
		} while (num != 0);
		
		System.out.println("=== 프로그램 종료 ===");
	} // main

}
