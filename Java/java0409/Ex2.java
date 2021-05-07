package java0409;

public class Ex2 {

	public static void main(String[] args) {
		// 조건문 switch문. switch-case문이라고도 불림
	
		// 소괄호 안의 값은 정수만 가능하고 예외적으로 문자열 가능
		// break문은 자신을 감싸는 가장 가까운 코드블럭(switch블럭)을 빠져나옴
		/*
		switch (변수 또는 수식) {
		case 값1: 명령문; break;
		case 값2: 명령문; break;
		case 값3: 명령문; break;
		default: 위에 case 어느값도 아닐때 수행할 문장;
		}
		*/
		
		// 1월 2화 3수 4목 5금 6토 7일
		int weekday = 5;
		
		if (weekday == 1) {
			System.out.println("월요일");
		} else if (weekday == 2) {
			System.out.println("화요일");
		} else if (weekday == 4 || weekday == 5) {
			
		}
		
		
		switch (weekday) {
		case 1:
			System.out.println("월요일");
			break;
		case 2:
			System.out.println("화요일");
			break;
		case 3:
			System.out.println("수요일");
			break;
		case 4: case 5:
			System.out.println("금요일");
			break;
		case 6:
			System.out.println("토요일");
			break;
		case 7:
			System.out.println("일요일");
			break;
		default:
			System.out.println("요일이 아닙니다.");
		}
		
		
		//=====================
		char grade = 'B'; // char형은 정수 호환이므로 정수형 취급 가능
		// 'A' 아주잘함  'B' 잘함  'C' 보통  'D' 못함  'F' 아주못함
		switch (grade) {
		case 'A': System.out.println("아주잘함"); break;
		case 'B': System.out.println("잘함"); break;
		case 'C': System.out.println("보통"); break;
		case 'D': System.out.println("못함"); break;
		case 'F': System.out.println("아주못함"); break;
		default: System.out.println("학점이 아닙니다.");
		}
		//=====================
		String nation = "한국";
		switch (nation) {
		case "미국": System.out.println("USA"); break;
		case "한국": System.out.println("Korea"); break;
		}
		
		// String 문자열 객체 비교는 비교연산자가 아닌 equals() 메소드로 비교함
		// 뒤에서 배웁니다.
		if (nation == "한국") {
			System.out.println("Korea");
		} else if (nation == "미국") {
			System.out.println("USA");
		}
	} // main

}
