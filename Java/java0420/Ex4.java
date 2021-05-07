package java0420;

// final 키워드

// final class.   final method.  final varible

/*final*/ class FinalTest { // 상속못하게 막아줌
	// final 상수필드 static을 붙여서 클래스단위로 상수로 만드는게 일반적임
	private static final int a = 10; // 멤버변수 값 변경못하게함. 변수의 상수화
	
	public /*final*/ void showInfo() { // 메소드 오버라이드(재정의) 못하게 막아줌
		System.out.println("FinalTest의 showInfo() 호출됨");
	}
}

class FinalTest2 extends FinalTest {
	@Override
	public void showInfo() {
		System.out.println("FinalTest2의 showInfo() 호출됨");
	}
}

public class Ex4 {

	public static void main(String[] args) {

	}
}
