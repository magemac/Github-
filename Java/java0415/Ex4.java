package java0415;

// 객체지향 프로그래밍에서 객체간의 관계 2가지
// 1) 포함 관계(A has a B) : A는 B를 가지고 있다. 
//      자동차는 엔진을 가지고 있다.

// 2) 상속 관계(A is a B) : A는 B이다.
//      중학생은 학생이다.(O) <-> 학생은 중학생이다.(X)
//      강아지는 동물이다.(O) <-> 동물은 강아지이다.(X)


// Child클래스의 부모클래스
// 부모클래스 = 수퍼클래스 = 상위클래스
class Parent {
	void showParent() {
		System.out.println("Parent 클래스의 showParent() 메소드");
	}
}

// 자식클래스 extends 부모클래스명
// 자식클래스 = 서브클래스 = 하위클래스
class Child extends Parent {
	void showChild() {
		System.out.println("Child 클래스의 showChild() 메소드");
	}
}

class GrandChild extends Child {
	void showGrandChild() {
		System.out.println("GrandChild 클래스의 showGrandChild() 메소드");
	}
}

public class Ex4 {
	public static void main(String[] args) {
		Child child = new Child();
		child.showChild();
		child.showParent();
		
		System.out.println("===================");
		
		GrandChild gc = new GrandChild();
		gc.showGrandChild();
		gc.showChild();
		gc.showParent();
		
	} // main
}





