package java0414;

// 나무 클래스 정의
class Tree {
	// 멤버 변수 (속성)
	String name;
	int age;
	int numberOfLeaf; // 나뭇잎 갯수 (1~100)
	// 메소드 (기능)
	void wave() {
		if (numberOfLeaf >= 50) {
			System.out.println(age +"살 " + name + "이(가) 바람에 세게 흔들린다.");
		} else { // numberOfLeaf < 50
			System.out.println(age +"살 " + name + "이(가) 바람에 살살 흔들린다.");
		}
	}
}

public class Ex1 {

	public static void main(String[] args) {
		String name;
		int age;
		
		// 변수 (한개의 기억장소)
		// -> 배열 (같은자료형의 기억장소 여러개)
		// -> 구조체 (다른자료형의 기억장소 여러개)
		// -> 클래스 (구조체 + 함수)
		
		// 클래스 : 객체 정의(멤버변수 + 메소드)
		// 객체(인스턴스 instance) : 클래스로부터 생성한 객체. 사용대상
		
		// 클래스        객체
		// 제품설계도    제품
		// 붕어빵틀      붕어빵
		
		// 클래스 사용 -> 객체 생성 (기억장소 할당, 기본값으로 초기화 됨)
		
		
		int a; // 변수 선언
		a = 5; // 변수에 값 저장
		
		int b = 7; // 변수 선언과 동시에 값으로 초기화
		
		int[] arr;  // 배열변수(참조변수) arr 선언
		arr = new int[5];  // 크기가 5인 정수형 배열객체 생성하고 객체의 주소값을 참조변수에 저장
		
		//String str;
		Tree tree; // Tree 타입의 참조변수 tree 선언
		tree = new Tree(); // Tree 클래스 타입의 객체를 생성하고 객체의 주소값을 참조변수에 저장
		// new : 객체 생성 연산자. 객체를 기억장소에 할당
		// tree : 참조변수. 레퍼런스 변수
		// 객체를 접근할때는 (.)연산자를 사용. 참조연산자라고 함
		
		System.out.println(tree.age);  // 0
		System.out.println(tree.name); // null
		
		tree.name = "소나무";
		tree.age = 100;
		tree.numberOfLeaf = 80;
		System.out.println(tree.age);  // 100
		System.out.println(tree.name); // 소나무
		tree.wave();
		
		System.out.println("==========================");
		
		Tree tree2 = new Tree(); // 변수 선언과 동시에 값(객체)으로 초기화
		tree2.name = "대나무";
		tree2.age = 20;
		tree2.numberOfLeaf = 30;
		System.out.println(tree2.name);
		System.out.println(tree2.age);
		tree2.wave();
	} // main

}




