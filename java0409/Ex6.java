package java0409;

import java.util.Scanner;

public class Ex6 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); // 키보드 입력 객체 준비
		
		int num;
		System.out.print("숫자 한개를 입력(0이면 종료): ");
		num = scanner.nextInt();
		
		// while문
		while (num != 0) {
			System.out.print("숫자 한개를 입력(0이면 종료): ");
			num = scanner.nextInt();
		} // while
		
		System.out.println("=== 프로그램 종료 ===");
	} // main

}
