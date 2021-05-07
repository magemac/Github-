package java0408;

public class Ex2 {
	
	public static void main(String[] args) {
		// 형변환은 호환되는 자료형 사이에서만 가능하다.
		// 기본자료형에서는 숫자형(정수,실수) 사이에서 호환관계가 있다.
		// byte, short, int, long, float, double
		
		// 자료형 형변환은 형변환 연산자를 사용한다.
		//  자동 형변환     큰 기억장소 = 작은 기억장소
		//  수동 형변환     작은 기억장소 = (작게) 큰 기억장소
		
		int a = 10;  // int = int
		long b = 20; // long = int   자동 형변환이 일어남
		
		//b = a;  // long = int
		
		// 정수끼리 또는 실수끼리 형변환은 바이트 크기가 기준이 됨.
		
		// 정수끼리 형변환
		a = (int) b;  // int = (int)long
		System.out.println("a = " + a);
		
		// =============================================
		b = 3_000_000_000L; // 30억 (int 범위를 초과하는 값)
		
		a = (int) b;  // int = (int)long
		System.out.println("a = " + a);
		
		// ===========================================
		// 실수끼리 형변환
		float c = (float) 3.14; // float  = (float) double
		double d = 4.56;   // double = double
		// ===========================================
		
		// 정수와 실수 사이에 형변환
		//   실수가 정수보다 항상 큰 타입이다. (바이트 수에 관계없음)
		long lNum = 10;
		float fNum = 2.7f;
		
//		fNum = lNum; // float(큰) = long(작은)    자동 형변환이 일어남
//		System.out.println("fNum = " + fNum);
		
		lNum = (long) fNum; // long(작은) = (long) float(큰)
		System.out.println("lNum = " + lNum);
		
		//===========================
		// char 문자형은 숫자형과 호환관계에 있다.
		char ch = 'A';
		System.out.printf("%c -> %d\n", ch, (int)ch);
		
		ch = 'a';
		System.out.printf("%c -> %d\n", ch, (int)ch);
		
		ch = '0';
		System.out.printf("%c -> %d\n", ch, (int)ch);
		
		ch = '한';
		System.out.printf("%c -> %d\n", ch, (int)ch);
		
		
	} // main
}
