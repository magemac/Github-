package java0412;

public class Ex3 {

	public static void main(String[] args) {
		// 삼중 반복문으로 시:분:초  시계가 표현할수 있는 모든 경우를 출력하기
		
		// 출력형식
		// 0시 0분 0초
		// 0시 0분 1초
		// 0시 0분 2초
		// ...
		// 0시 0분 59초
		// 0시 1분 0초
		// 0시 1분 1초
		// ...
		// 0시 59분 59초
		// 1시 0분 0초
		// ...
		// 23시 59분 58초
		// 23시 59분 59초
		for (int h=0; h<24; h++) { // 24회 반복
			for (int m=0; m<60; m++) {  // 60회 반복
				for (int s=0; s<60; s++) {  // 60회 반복
					System.out.printf("%d시 %d분 %d초\n", h, m, s);
				}
			}
		}

	} // main

}
