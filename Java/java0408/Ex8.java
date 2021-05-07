package java0408;

public class Ex8 {

	public static void main(String[] args) {
		// 단항연산자:  ++ -- 증감
		
		// ++ 1증가,  -- 1감소
		
		int a = 0;
		a = a + 1;
		System.out.println("a = " + a);
		
		a++;
		System.out.println("a = " + a);
		
		--a;
		System.out.println("a = " + a);
		
		a--;
		System.out.println("a = " + a);
		//================================
		//*수식에 증감연산자와 다른연산자가 함께 사용된 경우
		// ++변수 : 1 증가를 제일 먼저 수행하고, 다른 연산을 수행함
		// 변수++ : 다른 연산을 다 수행한 다음에, 마지막에 변수에 1 증가시킴
		
		a = 0;
		int b = 0;
		System.out.println("++a : " + (++a)); // 1
		System.out.println("b++ : " + (b++)); // 0
		
		System.out.println("a : " + a); // 1
		System.out.println("b : " + b); // 1
		
		//===================
//		a = 0; b = 0;
		a = b = 0;
		int sum = 0;
		sum = ++a + ++b;
		System.out.println("++a + ++b : " + sum); // 2
		
		a = b = sum = 0;
		sum = a++ + b++;
		System.out.println("a++ + b++ : " + sum); // 0
		
	} // main

}
