package java0408;

public class Ex1 {

	public static void main(String[] args) {
		// println(), print(), printf()
		System.out.print("안녕~\n");
		System.out.print("반가워~!\n\n");
		
		// 형식문자는 printf() 메소드에서 사용함
		// %d 정수   %f 실수   %c 문자   %s 문자열
		
//		int a = 10;
//		int b = 20;
		
		int a = 10, b = 20;
		
		System.out.println("a = " + a);
		System.out.printf("a = %d\n", a);
		
		System.out.println("a = " + a + ", b = " + b);
		System.out.printf("a = %d, b = %d\n", a, b);
		
		double c = 3.14, d = 4.56;
		System.out.println("c = " + c + ", d = " + d);
		System.out.printf("c = %.2f, d = %.2f\n", c, d);
		
		char ch = '한';
		System.out.printf("문자 : %c\n", ch);
		
		String str = "동해물과 백두산이...";
		System.out.printf("문자열 : %s\n", str);
		
		// * 변수이름 짓는 규칙
		//  변수이름은 특수문자는 _ $ 두개만 사용 가능하다.
		//  변수이름은 숫자로 시작할 수 없다.
		//  변수이름은 알파벳 소문자로 시작하는게 관례이다.
		//  변수이름에 한글도 쓸수는 있지만 안쓰는게 관례이다.
		
		
		char 성별 = '남'; // 한글명은 안쓰는게 좋음
		System.out.println(성별);
		
		int myHome;
		
		// 기호 상수 (변수를 기호 상수로 만들기)
		final int MY_HEIGHT;
		MY_HEIGHT = 170; // 초기화
		//MY_HEIGHT = 172; // 수정
		
		int $goal = 50;

	} // main

}
