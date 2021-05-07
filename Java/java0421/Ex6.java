package java0421;

import java.util.Calendar;

public class Ex6 {

	public static void main(String[] args) {
		// Calendar 클래스 : 현재날짜와 시간정보를 가져올수 있음
		// new 연산자가 아닌 getInstance() 스태틱 메소드 호출로 객체참조를 가져옴

		Calendar cal = Calendar.getInstance(); // 현재날짜와 시간정보 가짐
		
		System.out.println(cal.get(Calendar.YEAR) + "년"); // 현재년도 2021년
		
		// 월 (0 ~ 11)
		System.out.println((cal.get(Calendar.MONTH) + 1) + "월"); // 4월
		System.out.println(cal.get(Calendar.DATE) + "일"); // 22일
		// 시간
		System.out.println(cal.get(Calendar.HOUR) + "시");   // 9시
		System.out.println(cal.get(Calendar.MINUTE) + "분"); // 37분
		System.out.println(cal.get(Calendar.SECOND) + "초"); // 34초
		// 요일 (1~7)
		System.out.println(cal.get(Calendar.DAY_OF_WEEK)); // 5 목요일
		
		int day = cal.get(Calendar.DAY_OF_WEEK);
		switch (day) {
		case 1: System.out.println("일요일"); break;
		case 2: System.out.println("월요일"); break;
		case 3: System.out.println("화요일"); break;
		case 4: System.out.println("수요일"); break;
		case 5: System.out.println("목요일"); break;
		case 6: System.out.println("금요일"); break;
		case 7: System.out.println("토요일"); break;
		}
	} // main
}





