package java0409;

import java.util.Scanner;

public class Ex9 {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); // 키보드 입력 객체 준비
		
		// 숫자 맞추기 게임
		// 컴퓨터가 1~100 사이의 임의의 정수를 생각한다.
		// 사람은 컴퓨터가 생각하고있는 숫자를 맞히면 게임에서 이긴다.
		
		int comNum = 77;
		// 컴퓨터가 생각한 숫자가 짝수면 "맞힐 수는 짝수입니다"라고 힌트를 줌
		//                        홀수면 "맞힐 수는 홀수입니다"라고 힌트를 줌
		

		System.out.print("숫자를 입력: ");
		int myNum = scanner.nextInt();
		
		// 컴퓨터수와 나의 숫자 비교
		// 컴퓨터수가 나의수보다 크면 "더 큰 수입니다"
		// 컴퓨터수가 나의수보다 작으면 "더 작은 수입니다"
		// 컴퓨터수가 나의수와 같으면 "맞혔습니다!"
		
		// 게임은 맞힐때까지 반복하기 // (제일 마지막에 생각해보기)
		
//		while (true) {
//			if (조건식) {
//				break; // 자신을 감싸는 가장 가까운 반복문과 switch문을 탈출함
//			}
//		}
		
	}// main
}




