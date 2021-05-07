package java0414;

public class Point {
	int x;
	int y;
	
	// 기본생성자 (매개변수가 없는 생성자)
	//  : 클래스 안에 생성자 정의가 없으면 자동으로 삽입해주는 생성자이다.
	//    생성자 정의가 한개라도 있으면 기본생성자 삽입을 해주지 않음.
	Point() {
		System.out.println("Point 클래스의 기본생성자 호출됨.");
		// 초기값 할당
		x = 2;
		y = 2;
	}
	
	// 생성자 오버로딩(overloading) : 생성자를 여러개 선언 가능

	// 생성자 오버로딩 규칙
	//  : 매개변수의 갯수가 달라야 한다.
	//    매개변수의 갯수가 같다면, 자료형이 서로 달라야한다.
	//    매개변수의 이름은 오버로딩과 관계없다!
	//  이유 : 호출했을때 어느 생성자를 호출하는지 구분이 불가능하기 때문.
	
	Point(int _x) { // x값 받는 생성자
		x = _x;
	}
	
//	Point(double _y) { // y값 받는 생성자
//		y = (int)_y;
//	}
	
	Point(int _x, int _y) { // x y값 받는 생성자
		x = _x;
		y = _y;
	}
	
	
	// setter 메소드 : 객체의 상태를 수정하는 역할. 쓰기용 메소드
	void setX(int _x) {
//		if (_x >= 0) {
			x = _x;
//		}
	}
	
	void setY(int _y) {
		y = _y;
	}
	
	// getter 메소드 : 객체의 상태를 가져오는 역할. 읽기용 메소드
	int getX() {
		return x;
	}
	
	int getY() {
		return y;
	}
	
	void showData() {
		System.out.printf("%d, %d\n", x, y);
	}
}
