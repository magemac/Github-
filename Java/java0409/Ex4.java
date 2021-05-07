package java0409;

public class Ex4 {

	public static void main(String[] args) {
		// 반복문 (for, while, do-while)

//		for (초기식; 조건식; 증감식) {
//			// 반복실행할 문장;
//		}

		// 변수의 수명주기(life cycle)
		int num;
		num = 10;
		{
			int num2 = 20;
			System.out.println("num2 = " + num2);
		}
//		System.out.println("num2 = " + num2);

		// 5번 반복해서 "안녕~" 출력하기
		// for문에서 반복 횟수를 세는 변수: 제어변수라고 부름.
		// 알파벳 i부터 시작하는 한글자를 주로 관례로 사용함
		// 조건: 참=>반복, 거짓=> 반복끝냄
		for (int i = 1; i <= 5; i++) { // 증감식 i+=1; i=i+1;
			System.out.println(i + " : 안녕~");
		}

		// 1 2 3 4 5 6 7 8 9 10
		for (int i = 1; i <= 10; ++i) {
			System.out.print(i + " ");
		}
		System.out.println();

		// 11 12 13 14 15 16 17 18 19 20
		for (int i = 11; i <= 20; i++) {
			System.out.print(i + " ");
		}
		System.out.println();

		// 0 1 2 3 4 5 6 7 8 9
		for (int i = 0; i < 10; i++) {
			System.out.print(i + " ");
		}
		System.out.println();

		// 2 4 6 8 10 12 14 16 18 20
		for (int i = 2; i <= 20; i += 2) { // 증감식 i=i+2;
			System.out.print(i + " ");
		}
		System.out.println();

		// 10 9 8 7 6 5 4 3 2 1
		for (int i = 10; i >= 1; i--) { // 증감식 i=i+2;
			System.out.print(i + " ");
		}
		System.out.println();

		// ==================================
		// 1+2+3+4+5+6+7+8+9+10
		int sum = 0; // 1~10 더한값(누적값)을 저장할 변수
		for (int i = 1; i <= 10; i++) {
			sum = sum + i; // 누적합
			System.out.println("i = " + i + ", sum = " + sum);
		}
		System.out.println("1~10 누적합 : " + sum);
		
		//==================================
		// 1~10 중에 홀수의 합 구하기 (for문만으로 해결방식, if문 중첩해서 해결방식)
		sum = 0; // 누적합을 구할 변수는 0으로 초기화 해야함
		
		// for문만으로 해결방식
		for (int i=1; i<=10; i=i+2) { // 증감식 i+=2
			System.out.println(i);
			sum = sum + i; // sum += i;
		}
		System.out.println("1~10 중에 홀수의 합 : " + sum); // 25
		
		// for문과 if문 중첩해서 해결방식
		sum = 0;
		for (int i=1; i<=10; i++) {
			if (i % 2 == 1) {
				sum += i;
			}
		} 
		System.out.println("1~10 중에 홀수의 합 : " + sum); // 25
	} // main

}
