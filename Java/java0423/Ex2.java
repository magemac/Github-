package java0423;

public class Ex2 {

	public static void main(String[] args) {
		// 예외 : 프로그램 실행동안의 예기치 못한 오류
		// 예외 처리  try-catch문
		
		
		// 예외처리 코드를 사용해서 예외상황을 처리함
		int a = 10, b = 2, result = 0;
		int[] numArr = { 100, 200, 300 };
		
		try {
			result = a / b; // 나누는 수가 0일때 예외 발생
			
			// 배열의 요소 한개 출력
			System.out.println(numArr[2]); // 인덱스 번호 범위를 초과하여 접근시 예외 발생
			
		} catch (ArithmeticException e) {
			// try 블록 안에서 예외 발생 시 예외를 처리하는 부분
			e.printStackTrace();
			System.out.println(e.getMessage());
		} catch (RuntimeException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("result = " + result);
		
		System.out.println("=== 프로그램 정상종료 ===");
	} // main

}



