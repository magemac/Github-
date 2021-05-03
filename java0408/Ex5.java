package java0408;

public class Ex5 {

	public static void main(String[] args) {
		// 논리연산자:  && (and)   || (or)   !(not)
		//   논리값(true/false)에 대한 연산자이다.

		System.out.println("!true = " + !true);
		System.out.println("!false = " + !false);
		
		// && 연산자의 특징
		//  : 수식의 모든 논리값이 참일때 전체가 참이 됨.
		//    거짓이 어느 하나라도 있으면 전체가 거짓이 됨.
		
		// || 연산자의 특징
		//  : 수식의 논리값이 어느 하나라도 참이면 전체가 참이 됨.
		//    수식의 모든 논리값이 거짓일때 전체가 거짓이 됨.
		
		int a = 10, b = 20;
		// &&  ~이고, 그리고
		System.out.println("a < b && a != b -> " + (a < b && a != b)); // true
		System.out.println("a < b && a == b -> " + (a < b && a == b)); // false
		
		// ||  ~이거나, 또는
		System.out.println("a < b || a == b -> " + (a < b || a == b)); // true
		System.out.println("a > b || a == b -> " + (a > b || a == b)); // false
		
		// 값의 범위 표현하기
		// 10대의 나이 :  10살 이상 19살 이하  (10 <= age <= 19)
		// 10 <= age <= 19
		// (10 <= age) && (age <= 19)
		
		int age = 20;
		String str;
		str = ((10 <= age) && (age <= 19)) ? "10대 입니다." : "10대가 아닙니다.";
		System.out.println(age + " -> " + str);
	} // main

}
