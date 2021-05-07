package java0415;


class MethodOverload {
	// showInfo(값) 메소드 : 값을 출력하기
	// 메소드 오버로딩
	void showInfo() {
		System.out.println("매개변수 없음");
	}
	
	void showInfo(int num) {
		System.out.println(num);
	}
	
	void showInfo(double num) {
		System.out.println(num);
	}
	
	void showInfo(char ch) {
		System.out.println(ch);
	}
	
	void showInfo(boolean bool) {
		System.out.println(bool);
	}
	
	void showInfo(String str) {
		System.out.println(str);
	}
	
	// 반환형은 메소드 오버로딩과 관계없음!
//	String showInfo(String str) {
//		System.out.println(str);
//		return str + "!";
//	}
	
	
	// 매개변수 2개일 경우 자료형 또는 자료형 순서가 다르면 오버로딩 성립함
	void showInfo(int a, int b) {
	}
	void showInfo(int a, double b) {
	}
	void showInfo(double a, int b) {
	}
	void showInfo(double a, double b) {
	}
	
	//==================================
	void printNum(int a) {
		System.out.printf("%d\n", a);
	}
	void printNum(int a, int b) {
		System.out.printf("%d\t%d\n", a, b);
	}
	void printNum(int a, int b, int c) {
		System.out.printf("%d\t%d\t%d\n", a, b, c);
	}
	
	// 비정형 인자. 가변인자 Variable Argument(Varargs)
	// 가변인자는 다른 매개변수와 함께 사용할때 가장 마지막에 위치해야 함.
	void printNum(int a, int... num) { // 매개변수 0개 이상 전달 가능. 배열객체로 전달받음
		for (int i=0; i < num.length; i++) {
			System.out.print(num[i] + "\t");
		}
		System.out.println();
	}
	
//	void printNum(int a, int[] num) {
//	}
	
}



public class Ex3 {

	public static void main(String[] args) {
		// 메소드 오버로딩 : 동일한 이름의 메소드를 여러개 중복 정의(사용자 편의를 위해)
		
		// 메소드 오버로딩 규칙
		//  : 같은 클래스 내에서 메소드 이름은 동일하게.
		//     매개변수 갯수는 다르게.
		//     매개변수 갯수가 같다면 자료형이 다르게.
		//     메소드의 리턴형(반환형)은 오버로딩과 관계없음(호출문 기준으로 정해짐)
		
		MethodOverload mo = new MethodOverload();
		
		mo.showInfo(10);
		mo.showInfo(false);
		mo.showInfo('한');
		mo.showInfo(2.7);
		mo.showInfo("안녕하세요");
		
		System.out.println("=================");
		
		mo.printNum(10, 20, 30);
		mo.printNum(10, 20, 30, 40, 50, 60, 70);
		mo.printNum(10, 20, 30, 40, 50, 60, 70, 80, 90, 100);
		
		System.out.println("=================");
		
		System.out.println(true);
		System.out.println(3.14);
		System.out.println(5);
		System.out.println("문자열");
	} // main

}





