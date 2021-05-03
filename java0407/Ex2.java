package java0407;

public class Ex2 {

	public static void main(String[] args) {
		
		// 변수 : 메모리상의 이름있는 기억공간

		// 숫자 저장공간을 하나 만들고 이름을 a로 지정
		// -> a라는 숫자형 변수 선언하기
		int a;
		a = 5;  // 대입연산자(=) 오른쪽 값을 왼쪽 기억장소에 저장(대입)한다
		System.out.println("a 변수 값은 " + a);
		
		a = 10;
		System.out.println("a 변수 값은 " + a);
		
		a = 20;
		System.out.println("a 변수 값은 " + a);
		
		a = a + 7;
		System.out.println("a 변수 값은 " + a);
		

		/*
		기본자료형
		  - 정수형 (byte, short, int, long)
		  - 실수형 (float, double)
		  - 논리형 (boolean)
		  - 문자형 (char)
		  - 문자열형 (String). 기본자료형이 아닌 객체형이지만 기본자료형 취급을 받기도 함.
		*/
		
		byte b;
		b = 127;
		//b = 128; // 크기넘는값 저장 -> 에러
		
		// 리터럴 상수 : 값 그자체를 의미함
		// 리터럴 상수도 자료형을 가진다.
		//  기본 정수 리터럴은 int형, 기본 실수 리터럴은 double형
		
		long c;
		c = 3_000_000_000L;
		System.out.println("c = " + c);
		
		double d = 3.14;  // double 은 8바이트
		System.out.println("d = " + d);
		 
		float e = 3.14f;   // float 은 4바이트
		System.out.println("d = " + d);
		
		// 문자형
		char ch;  // 변수 선언
		ch = 'A'; // 변수에 값 저장
		//ch = 'AA';
		ch = '한';
		System.out.println("ch = " + ch);
		
		boolean isGood;  // 논리형, 진위형 (참, 거짓)
		isGood = true;
		isGood = false;
		System.out.println("isGood = " + isGood);
		
		// ============================================
		// 출력특수문자:  \"  \'  \\   \n   \t   
		
		System.out.println("\"홍 \\ 길동\"");
		
		//=======================
		// 변수 선언과 동시에 값 초기화
		double pi = 3.14; // 원주율
		int r = 5;  // 반지름
		
		// 원의 면적 = 반지름 * 반지름 * 원주율
		double area = r * r * pi;  // 원의 면적
		
		// 출력형식
		// "반지름"이 ㅇㅇ인
		//        \원의 면적\은 ㅇㅇ이다.
		System.out.println("\"반지름\"이 " + r 
				+ "인\n\t\\원의 면적\\은 " + area + "이다");
		
		//=======================
		
		
		// 문자열형 (기본자료형이 아닌 객체형. 기본자료형 취급을 받기도 함) 
		String hello = "안녕하세요";
		String name = "홍길동";
		String song = "동해물과 백두산이 마르고 닳도록...";
		
		//int song = 50; // 중복된 이름의 변수는 사용불가
		
		System.out.println(name + "님, " + hello);
		System.out.println("애국가: " + song);
	} // main

}





