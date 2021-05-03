package java0421;

import java0415.MyCar;
//import java.lang.*;  // 이 표현이 항상 컴파일 결과에 자동으로 삽입됨. String 클래스를 사용시 import문이 필요없는 이유임.

public class Ex1 {

	public static void main(String[] args) {
		// java.lang 패키지는 기본패키지로서 자동 import 대상임
		
		//java0415.MyCar myCar = new java0415.MyCar();
		MyCar myCar = new MyCar();
		//======================================
		
		// String 클래스 : 불변객체
		
		String str = "Java Programming";
		
		System.out.println("문자열 길이: " + str.length());
		
		//str = null;
		// 문자열 비교
		if ("Java Programming".equals(str)) { // equals()메소드가 비교대상이 null인 경우에 에러나지 않고 다름으로 결과를 내줌
			System.out.println("문자열 같음");
		} else {
			System.out.println("문자열 다름");
		}
		
		System.out.println("인덱스 5번 문자 한개: " + str.charAt(5)); // P
		System.out.println("부분문자열 5~8앞까지: " + str.substring(5, 8)); // Pro
		System.out.println("부분문자열 5부터 끝까지: " + str.substring(5)); // Programming
		System.out.println("문자열 연결하기: " + str.concat("!!!")); // Java Programming!!!
		System.out.println("문자열 교체하기: " + str.replace("Java", "JSP"));
		System.out.println("특정 문자 또는 문자열 위치(인덱스0부터 찾기): " + str.indexOf("a")); // 1
		System.out.println("특정 문자 또는 문자열 위치(끝인덱스부터 역순으로 찾기): " + str.lastIndexOf("a")); // 10
		System.out.println("대문자로 변환하기: " + str.toUpperCase());
		System.out.println("소문자로 변환하기: " + str.toLowerCase());
		System.out.println("특정 문자열 포함여부 확인하기: " + str.contains("gram"));
		System.out.println("문자열 분리하기: " + str.split(" ")[0]); // 문자열을 특정 구분자로 분리해서 배열로 리턴
		
		String[] strArr = str.split(" ");
		System.out.println(strArr[0]);
		
		System.out.println(str);
		System.out.println("===============");
		
		String str3 = "  [홍 길동 입니다.]   ";
		System.out.println(str3.trim());
		
		
		
		// 주민번호 -> 남,여 구분  1,3 남  2,4 여
		String jumin = "980123-4234567";
		// 성별구분 문자 뽑아오기  charAt()  substring()   indexOf()
		char ch = jumin.charAt(7);
		// if 비교
		// 남 여 출력
		if (ch == '1' || ch == '3') {
			System.out.println("남자");
		} else {
			System.out.println("여자");
		}

		//==========================
		String s = jumin.substring(7, 8);
		
		if (s.equals("1") || s.equals("3")) {
			System.out.println("남자");
		} else {
			System.out.println("여자");
		}
		
		//=========================
		int index = jumin.indexOf("-");
		char ch2 = jumin.charAt(index + 1);
		System.out.println("ch2 = " + ch2);
		
		char ch3 = jumin.charAt(jumin.indexOf("-") + 1);
		System.out.println("ch3 = " + ch3);
		//=========================
		
		String str2 = "안녕~";
		str2 = str2.concat(" 반가워!"); // str2 = str2 + " 반가워!"
		
		
		
		
	} // main
}





