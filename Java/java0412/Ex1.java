package java0412;

public class Ex1 {

	public static void main(String[] args) {
		// 반복문
		
		// (문제1) 구구단 2단 출력
		// 2 * 1 = 2
		// 2 * 2 = 4
		// 2 * 3 = 6
		// ...
		// 2 * 9 = 18
		for (int i=1; i<=9; i++) {
			System.out.println("2 * " + i + " = " + (2*i));
		}
		
		// (문제2) 구구단 5단 출력
		for (int i=1; i<=9; i++) {
			System.out.println("5 * " + i + " = " + (5*i));
		}
		
		// (문제3)
		// for문  1부터~100보다 작은수 중에서
		// if문   3과 4의 공배수를 출력
		// 공배수: 3으로 나누어 떨어지고 4로도 나누어 떨어지는 수
		for (int i=1; i<100; i++) {
			if (i%3 == 0 && i%4 == 0) {
				System.out.print(i + " ");
			}
		}
		System.out.println();
		
		// (문제4)
		// 1~10 사이의 홀수의 합:   짝수의 합:    출력하기
		int oddSum = 0;  // 홀수 누적합 변수
		int evenSum = 0; // 짝수 누적합 변수
		for (int i=1; i<=10; i++) {
			if (i%2 == 1) { // 홀수
				oddSum = oddSum + i; // oddSum += i;
			} else { // i%2 == 0  // 짝수
				evenSum = evenSum + i; // evenSum += i;
			}
		}
		System.out.printf("1~10 사이의 홀수의 합: %d   짝수의 합: %d\n", oddSum, evenSum);
	} // main

}
