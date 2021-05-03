package java0423;

public class Ex1 {

	public static void main(String[] args) {
		// 예외 : 프로그램 실행동안의 예기치 못한 오류
		// 예외 처리  try-catch문
		
		
		// 예외처리 코드를 사용하지 않고 예외상황을 처리함
		int a = 10, b = 2, result = 0;
		
		if (b == 0) {
			System.out.println("나누는 수는 0이 될 수 없습니다.");
			return;
		}
		
		result = a / b;
		
		System.out.println("result = " + result);
		
		System.out.println("=== 프로그램 정상종료 ===");
	} // main

}



