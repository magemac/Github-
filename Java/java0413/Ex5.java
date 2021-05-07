package java0413;

public class Ex5 {
	
	public static void hello() {
		System.out.println("Hello Java");
	} // hello
	
	public static void printSum(final int a, final int b) {
		System.out.printf("%d + %d = %d\n", a, b, a+b);
	}
	
	public static int getAbs(int num) {
		if (num < 0) {
			num = num * -1;  // num = -num;
		}
		return num;
		
		//return (num < 0) ? -num : num ;
	} // getAbs
	
	public static int getMax(int a, int b) {
//		if (a > b) {
//			return a;
//		} else { // a <= b
//			return b;
//		}
		
//		int result; // 리턴에 사용할 변수
//		if (a > b) {
//			result = a;
//		} else { // a <= b
//			result = b;
//		}
//		return result;
		
		return (a > b) ? a: b;
	} // getMax
	
	public static int getSum(int num) {
		int sum = 0; // 누적합을 저장할 변수 0으로 초기화
		
		for (int i=1; i<=num; i++) {
			sum += i; // sum = sum + i;
		}
		
		return sum;
	} // getSum
	
	public static void main(String[] args) {
		// 함수 호출
		// hello() 호출하면 "Hello Java" 출력함
		hello();
		hello();
		// printSum(10, 20)  호출하면  "10+20=30" 출력함
		printSum(10, 20);
		// getAbs(-5)  호출하면  절대값을 구해서 리턴해줌
		System.out.println("-5의 절대값은 " + getAbs(-5));
		// getMax(10, 20)  호출하면  큰값을 리턴해줌
		System.out.println("10과 20 중에서 큰값은 " + getMax(10, 20));
		// getSum(10)  호출하면 1부터 입력값 까지의 누적합을 구해서 리턴해줌
		System.out.println("1~10까지의 누적합은 " + getSum(10));
	} // main
}




