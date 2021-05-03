package java0409;

public class Ex1 {

	public static void main(String[] args) {
		System.out.println("=== 프로그램 시작 ===");

		// 코드 블록
		{
			System.out.println("좋은 아침이에요~");
			System.out.println("좋은 아침이에요~");
		}

		// 제어문의 분류(조건문, 반복문)

		// 조건문의 종류(if, switch)
		// 반복문의 종류(for, while, do-while)

		/*
		 * if (조건식) { // 문장... }
		 */

		int a = -7;
		if (a < 0) {
			a = -a; // a = a * (-1); a *= -1;
		}
		System.out.println("절대값: " + a);

//		if (조건식) {
//			// 참일때 실행할 문장;
//		} else {
//			// 거짓일때 실행할 문장;
//		}

		a = 30;
		int b = 20;
		int max = 0;
		if (a > b) {
			max = a;
		} else { // a <= b
			max = b;
		}
		System.out.println("max = " + max);
		
		//=================================
		
		int num = 7;
		// 짝수 : num를 2로 나누었을때 나머지가 0이면
		// 홀수 : num를 2로 나누었을때 나머지가 1이면
		if (num % 2 == 0) {
			System.out.println("짝수입니다.");
		} else {  // num % 2 == 1
			System.out.println("홀수입니다.");
		}
		
		a = 30; b = 20;
		int min = 0;
		// 최소값 구하기
		if (a < b) {
			min = a;
		} else { // a >= b
			min = b;
		}
		System.out.println("min = " + min);
		
		// ====================
		// 중첩 if문
		/*
		if (num % 3 == 0) {
			
		} else { // 3으로 나눴을때 나머지가 1 또는 2인 경우
			if (num % 3 == 1) {
				
			} else { // num % 3 == 2
				if (num % 3 == 2) {
					
				}
			}
			// 문장;
		}
		*/
		
		/*
		 다중 if문
		if (조건1) {
			// 조건1이 참일때 실행문;
		} else if (조건2) {
			// 조건2가 참일때 실행문;
		} else if (조건3) {
			// 조건3이 참일때 실행문;
		} else {
			// 위에 조건식 모두 거짓일때 실행할 문장;
		}
		*/
		
		num = -5;
		// "양수"  "영"   "음수"   다중if문 사용해서 출력하기
		if (num > 0) {
			System.out.println("양수");
		} else if (num == 0) {
			System.out.println("영(zero)");
		} else {  // num < 0
			System.out.println("음수");
		}
		
		int score = 82;  // 점수
		// 90~100 점이면 A
		// 80~89  점이면 B
		// 70~79  점이면 C
		// 60~69  점이면 D
		//  0~59  점이면 F
		
		// score 점수가 해당하는 학점을 다중if문 사용해서 출력하기
		//  90 <= score <= 100
		//  (90 <= score) && (score <= 100)
		//  (score >= 90) && (score <= 100)
		
		if ((score >= 90) && (score <= 100)) {
			System.out.println("A");
		} else if ((score >= 80) && (score <= 89)) {
			System.out.println("B");
		}
		
		if (score >= 90) {
			System.out.println("A");
		} else if (score >= 80) {
			System.out.println("B");
		} else if (score >= 70) {
			System.out.println("C");
		} else if (score >= 60) {
			System.out.println("D");
		} else {
			System.out.println("F");
		}
		
		score = 98; // 점수
		// 90점 이상이면 "A" (94~97)
		//    98점 이상이면 "A+" (98~100)
		//    94점 미만이면 "A-" (90~93)
		String grade = "";
		// 다중if문 방식
		if (score >= 98) {
			grade = "A+";
		} else if (score >= 94) { // score < 98
			grade = "A";
		} else if (score >= 90) { // score < 94
			grade = "A-";
		}
		System.out.println("학점: " + grade); // 학점: A+
		
		// 중첩if문 방식
		if (score >= 90) {
			grade = "A";
			if (score >= 98) {
				grade += "+";  // grade = grade + "+";
			} else if (score < 94) {
				grade += "-";  // grade = grade + "-";
			}
		}
		System.out.println("학점: " + grade); // 학점: A+
	} // main

}
