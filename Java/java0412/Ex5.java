package java0412;

public class Ex5 {

	public static void main(String[] args) {
		// break; 반복문 블록을 빠져나오는 명령문
		//   자신을 감싸는 가장 가까운 switch문 또는 반복문을 빠져나옴
		
		for (int i=1; i<=10; i++) {
			if (i == 8) {
				break;
			}
			System.out.print(i + " ");
		}
		System.out.println();
		
		System.out.println("==================");
		
		// continue; 반복 블록을 한번 건너뛰게 됨
		//   자신을 감싸는 가장 가까운 반복문 블록과 연동됨
		for (int i=1; i<=10; i++) {
			if (i == 8) {
				continue;
			}
			System.out.print(i + " ");
		}
		
//		int j=1; // 초기식
//		while (j<=10) { // 조건식
//			if (j == 8) {
//				continue;
//			}
//			System.out.print(j + " ");
//			
//			j++; // 증감식
//		}

	} // main

}
