package java0408;

import java.util.Scanner;

public class Ex7 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); // 키보드 입력받는 객체 준비

		// 사용자가 입력할 교과목 점수를 저장할 변수
		int kor, eng, math;
		int sum = 0;      // 세 과목의 합계를 구할 변수
		double avg = 0;   // 세 과목의 평균을 구할 변수
		
		System.out.print("국어 점수를 입력: ");
		kor = scanner.nextInt();
		
		System.out.print("영어 점수를 입력: ");
		eng = scanner.nextInt();
		
		System.out.print("수학 점수를 입력: ");
		math = scanner.nextInt();
		
		// 합계 구하기
		sum = kor + eng + math;
		// 평균 구하기. 소수점 이하까지 구함
		avg = sum / 3.0;
		
		// 출력형식
		// 국어: ㅇㅇ  영어: ㅇㅇ  수학: ㅇㅇ
		// 합계: ㅇㅇ  평균: ㅇㅇ
		System.out.printf("국어: %d   영어: %d   수학: %d\n", kor, eng, math);
		System.out.printf("합계: %d   평균: %f\n", sum, avg);
		
		// 평균 60점 이상이고, 각 과목이 모두 40점 이상이면 "합격"
		//    위 조건이 거짓이면  "불합격"
		String str = "";
		// 조건연산자 사용해서 판단하기
		str = (avg >= 60 
				&& kor >= 40 
				&& eng >= 40 
				&& math >= 40) 
				? "합격" : "불합격" ;
		
		System.out.println("결과: " + str);
	} // main

}



