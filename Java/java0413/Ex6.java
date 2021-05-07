package java0413;

public class Ex6 {

	public static void func1(int num) {
		num = 20;
		System.out.println("func1() 에서 num 변수 값은 " + num); // 20
	} // func1
	
	// 배열을 매개변수로 전달받는 함수
	public static void func2(int[] numArr) {
		// 인덱스 1번 정수값을 200으로 수정
		numArr[1] = 200;
		
		// 배열요소 출력
		for (int i=0; i<numArr.length; i++) {
			System.out.print(numArr[i] + " "); // 10 200 30
		}
		System.out.println();
	} // func2
	
	// 배열을 리턴하는 함수
	public static int[] getOddNum() {
//		int[] oddNums = { 1, 3, 5, 7, 9 };
//		return oddNums;
		
		return new int[] { 1, 3, 5, 7, 9 };
	}
	
	public static void main(String[] args) {
		// 지역변수: 함수 내에서 선언된 변수
		int num = 10;
		func1(num);
		System.out.println("main() 에서 num 변수 값은 " + num); // 10
		
		int[] numArr = { 10, 20, 30 };
		func2(numArr);
		// numArr 배열요소 출력
		for (int i=0; i<numArr.length; i++) {
			System.out.print(numArr[i] + " "); // 10 200 30
		}
		System.out.println();
		
		int[] oddNumArr = getOddNum();
		for (int oddNum : oddNumArr) {
			System.out.print(oddNum + " ");
		}
		System.out.println();
		
		System.out.println("=== 프로그램 종료 ===");
	} // main

}
