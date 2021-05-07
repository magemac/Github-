package java0413;

public class Ex7 {
	
	public static int calc(int a, int b, char c) { // 매개변수 a, b, c
		
//		if (c == '+') {
//			return a + b;
//		} else if (c == '-') {
//			return a - b;
//		} else if (c == '*') {
//			return a * b;
//		} else { // '/'
//			return a / b;
//		}
		
		int result;
		switch (c) {
		case '+': result = a + b; break;
		case '-': result = a - b; break;
		case '*': result = a * b; break;
		default : result = a / b; break;
		}
		return result;
	} // calc

	public static void main(String[] args) {
		// 사칙연산을 해주는 간단한 계산기 함수를 아래처럼 사용할때
		// 해당 함수를 정의해 보세요.
		System.out.println("20 + 10 = " + calc(20, 10, '+')); // 인자(argument)값 전달
		System.out.println("20 - 10 = " + calc(20, 10, '-'));
		System.out.println("20 * 10 = " + calc(20, 10, '*'));
		System.out.println("20 / 10 = " + calc(20, 10, '/'));
		
		System.out.println("==============");
		
		String str1 = new String("안녕");
		String str2 = new String("안녕");
		
		System.out.println("str1 == str2 는 " + (str1 == str2)); // false
		
		System.out.println("str1과 str2의 객체의 문자열 내용비교는 ");
		System.out.println(str1.equals(str2)); // true
		
	} // main

}
