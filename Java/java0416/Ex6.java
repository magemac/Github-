package java0416;


class A /* extends Object */ { // 부모클래스
	// 기본생성자
	A() {
		super();
		System.out.println("클래스 A의 생성자 호출됨");
	}
}

class B extends A { // 자식클래스
	// 기본생성자
	B() {
		super(); // 컴파일러가 무조건 super(); 기본생성자 호출을 삽입해줌 
		System.out.println("클래스 B의 생성자 호출됨");
	}
	
}


public class Ex6 {

	public static void main(String[] args) {
		// 상속 관계에서 생성자 호출 순서
		B b = new B();
		
	} // main

}





