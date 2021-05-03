package java0420;

import lombok.Getter;
import lombok.Setter;

// static. 정적. 클래스 단위 멤버. 공유하는 멤버
// 비유: 여러 사람이 한솥밥을 먹는 상황 (한솥밥은 공유데이터 static 멤버)
//      여러 사람이 각자 자기 밥을 먹는 상황 (각자 자기밥  non-static 멤버)

@Getter @Setter
class StaticTest {
	// static
	public static int a = 10; // 클래스단위 멤버변수. 클래스변수. 정적변수. 공유변수 용도
	
	public static void showInfo() { // 클래스단위 메소드. 정적메소드.
		System.out.println("a = " + a); // 클래스 메소드 안에서는 클래스변수만 사용가능함 
		//System.out.println("b = " + b);
	}
	
	//===============================
	
	private int b = 20; // 객체(인스턴스)단위 멤버변수. 객체(인스턴스)마다 한개씩 가짐
	
	public void showInfo2() {
		System.out.println("a = " + a); // 클래스변수 사용가능
		System.out.println("b = " + b); // 객체변수 사용가능
		
		showInfo(); // 클래스 메소드 호출 가능
	}
}


public class Ex1 {

	public static void main(String[] args) {
		// static 멤버 사용방식:  클래스명.멤버명
		System.out.println("StaticTest.a = " + StaticTest.a); // 올바른 static 접근방식
		StaticTest.showInfo();
		
		StaticTest st = new StaticTest();
		System.out.println("b = " + st.getB());
		//System.out.println(st.a); // 올바르지 않은 static 접근방식
		
		System.out.println("====================");
		
		StaticTest.a = StaticTest.a + 1;
		st.setB(st.getB() + 1);
		
		System.out.println("StaticTest.a = " + StaticTest.a); // 11
		System.out.println("st.getB() = " + st.getB()); // 21
		
		System.out.println("====================");
		
		StaticTest st2 = new StaticTest(); // 새로운 객체 생성
		
		System.out.println("StaticTest.a = " + StaticTest.a);
		System.out.println("st2.getB() = " + st2.getB());
		
		System.out.println("====================");
		st2.showInfo2();
	} // main

}







