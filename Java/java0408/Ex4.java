package java0408;

import java.util.Scanner;

public class Ex4 {

	public static void main(String[] args) {
		// 비교(관계)연산자:  >  >=  <  <=  ==  !=
		//   연산 결과로 논리값(불값)이 만들어짐: true / false
		//   논리값은 조건식에 사용됨.
		
		int a = 10, b = 20;
		
		System.out.println("a > b = " + (a > b));
		System.out.println("a < 100 = " + (a < 100));
		System.out.println("a == b = " + (a == b));
		System.out.println("a != b = " + (a != b));
		
		// 조건(삼항)연산자
		//   변수 = (조건식) ? 참값 : 거짓값;
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("첫번째 숫자를 입력: ");
		a = scanner.nextInt();
		
		System.out.print("두번째 숫자를 입력: ");
		b = scanner.nextInt();
		
		int max = 0;
		max = (a > b) ? a : b ;
		System.out.println("최대값: " + max);
		
		//======================
		// num의 절대값 구하기
		System.out.print("절대값을 구할 숫자(양수 또는 음수)를 입력: ");
		int num = scanner.nextInt();
		
		int abs = 0;  // 절대값 구할 변수
		abs = (num < 0) ? -num : num;
		System.out.println("절대값: " + abs);
	} // main

}
