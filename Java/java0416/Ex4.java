package java0416;


class Parent {
	void showParent() {
		System.out.println("부모클래스의 showParent()");
	}
}

class Child extends Parent {
	// (부모클래스로부터 상속받은) 메소드 재정의(method override)
	//  메소드 오버라이드 규칙
	//    메소드이름, 매개변수 갯수와 타입, 반환형까지 모두 동일해야 함
	
	//  메소드 오버로딩은 같은 이름의 메소드를 여러개 중복 정의하는 것
	//  메소드 오버라이딩은 상속관계 하에서 부모 메소드를 재정의하는 것
	
	// 부모 메소드를 재정의하는 이유 두가지
	// 1) 동일한 이름의 메소드지만 완전히 새로운 기능으로 재정의하는 경우
	// 2) 동이한 이름의 메소드로서 기존 기능에서 기능을 더 추가시키는 경우
	
	@Override // 부모 메소드 재정의
	void showParent() {
		super.showParent(); // super 참조변수
		// super 참조변수 용도
		//   : 부모 메소드명과 자식 메소드명이 같을 시 부모 메소드를 구분해서 호출할 경우 사용함
		System.out.println("자식클래스의 showParent()");
	}
	
	void showChild() {
		System.out.println("자식클래스의 showChild()");
	}
}

public class Ex4 {

	public static void main(String[] args) {
		Child c = new Child();
		
		c.showChild();  // 자식클래스의 showChild()
		
		System.out.println("========================");
		
		c.showParent(); // 부모클래스의 showParent()  <- 오버라이딩 이전 결과
		                // 자식클래스의 showParent()  <- 오버라이딩 이후 결과
		
		// 부모에서 선언된 메소드명과 동일하게 재정의된 메소드도 갖고있는
		// 객체에 대해서 외부에서 메소드 호출시
		// 항상 가장 마지막에 재정의된(자식클래스에 있는) 메소드 호출이 보장됨.

		// 객체 [외부]에서는 객체의 오버라이딩 된 메소드만 호출 가능하고
		// 오버라이딩 당한 메소드는 호출이 불가능함!
		
	} // main

}




