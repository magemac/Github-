package java0420;

import lombok.Getter;
import lombok.Setter;


// 추상메소드를 포함하고 있는 클래스는 무조건 추상클래스가 되어야만 한다.
// 또는, 단지 객체생성을 막기위한 용도로서 추상클래스를 선언하기도 한다.

// 추상클래스는 클래스이다.
// 객체생성은 못하지만 참조변수 타입의 용도로 사용할수 있고,
// 자식클래스에게 구성요소를 상속시킬수 있다.

@Getter @Setter
abstract class Shape { // 도형
	private double area; // 면적
	
	// 면적 구해서 리턴하는 메소드 // 추상메소드
	public abstract double area();
	// 추상메소드를 선언하는 이유는 상속받는 하위클래스에서 메소드 재정의를 강제하므로
	// 다형성을 위한 기반을 마련하는 효과가 있음
	
	public void printArea() { // 면적을 출력하는 메소드
		System.out.println("면적은 " + area);
	}
}

@Getter @Setter
class Circle extends Shape {
	private int radius = 5; // 반지름

	// 추상클래스로부터 상속받는 추상메소드를
	// 메소드 오버라이딩(재정의)하여 구현해야 함
	// 추상메소드의 오버라이딩 구현을 강제하는 효과가 있음
	@Override
	public double area() {
		double result = radius * radius * 3.14;
		setArea(result); 
		
		return getArea();
	}
}



public class Ex5 {

	public static void main(String[] args) {
		
		// Circle 객체 생성해서 사용
		Circle c = new Circle();
		System.out.println(c.area());
		c.printArea();
		
		Shape s = c; // 부모(큰)타입 = 자식(작은)타입;  // 자동형변환 (업캐스팅)
		System.out.println(s.area());
		
		//new Shape(); // 추상클래스는 객체생성이 불가능함
		
	} // main
}





