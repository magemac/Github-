package java0412;

public class Ex6 {

	public static void main(String[] args) {
		// 변수
		int a1, a2, a3, a4, a5; // 변수 선언. 기억장소 확보
//		System.out.println("a1 = " + a1);
		
		// 지역변수: 메소드 안에서 선언된 변수
		// 지역변수는 초기화 필요
		a1 = a2 = a3 = a4 = a5 = 0;
		
		
		
		
		
		// 배열 : 같은 자료형의 여러개의 연속된 기억공간
		
		// 배열은 객체이다.
		// 문자열 String 은 객체이다.
		String str;
		str = "안녕하세요~ 반가워요~!";
		
		// 객체 자료형의 특징: 참조변수에 객체의 주소값을 저장해서 사용함
		
		
		int[] a;  // 배열 참조변수 선언
		a = new int[5];  // 배열요소 5개를 저장할수 있는 정수형 배열객체 생성
		// 생성된 배열객체의 주소값을 배열 참조변수에 저장함
		
		// 배열 요소의 첫번째 값을 출력 (첫번째 요소는 0부터 시작함)
		// 객체는 처음 생성시 기본값으로 초기화됨
		// 숫자형(정수,실수)은 0
		// 논리형은 false
		// 문자형은 \u0000
		// 참조형은 null
		System.out.println("a[0] = " + a[0]);
		
		a[0]=1; a[1]=2; a[2]=3; a[3]=4; a[4]=5;
		System.out.println("a[0] = " + a[0]);
		System.out.println("a[1] = " + a[1]);
		System.out.println("a[2] = " + a[2]);
		System.out.println("a[3] = " + a[3]);
		System.out.println("a[4] = " + a[4]);
		
		System.out.println("==========================");
		
		// 배열은 for 반복문과 연동이 쉽다.
		for (int i=0; i<=4; i++) {
			System.out.println("a[" + i + "] = " + a[i]);
		}
		
		// 배열크기   배열변수명.length
		System.out.println("a 배열크기는 " + a.length);
		
		for (int i=0; i<a.length; i++) {
			System.out.println("a[" + i + "] = " + a[i]);
		}
		
		System.out.println("==========================");
		
		// 배열선언 다른방식
		int[] b = { 10, 20, 30, 40, 50, 60 };
		System.out.println("b 배열 크기는 " + b.length); // 6
		
		for (int i=0; i<b.length; i++) {
			System.out.printf("b[%d] = %d\n", i, b[i]);
		}
		
		System.out.println("==========================");
		
		b = new int[] { 100, 200, 300 };
		System.out.println("b 배열 크기는 " + b.length); // 3
				
				
		// 배열(Array)
		double[] dArr = { 3.14, 2.7, 8.99, 5 };
		//double dNum = 5;
		
		boolean[] bArr = { false, true, true };
		
		
		// 문자열String  배열선언. 배열 크기는 4
		String[] strArr = { "홍길동", "고길동", "이길동" };
		for (int i=0; i<strArr.length; i++) {
			System.out.println(strArr[i]);
		}
		
		System.out.println("==========================");
		
		String[] nationArr = new String[4]; // 접근가능한 인덱스범위 0~3
		nationArr[0] = "Korea";
		nationArr[1] = "USA";
		nationArr[2] = "Japan";
		
		for (int i=0; i<nationArr.length; i++) {
			System.out.println(nationArr[i]);
		}
		
		//System.out.println(nationArr); //참조변수에는 주소값만 있을뿐이다.
		
		String strHello = "안녕";
		System.out.println(strHello);
		
		System.out.println("==========================");
		
		// for-each문
		for (String nation : nationArr) {
			System.out.println(nation);
		}
		
	} // main

}
