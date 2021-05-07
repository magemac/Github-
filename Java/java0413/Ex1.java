package java0413;

public class Ex1 {

	public static void main(String[] args) {
		// 2차원 배열
		
		int[][] a = new int[3][4]; // 3행 4열 2차원 배열 선언
		
		System.out.println("a[0][0] = " + a[0][0]); // 인덱스번호가 0행 0열 요소의 값 출력
		
		a[0][0]=10;   a[0][1]=20;   a[0][2]=30;   a[0][3]=40;
		a[1][0]=50;   a[1][1]=60;   a[1][2]=70;   a[1][3]=80;
		a[2][0]=90;   a[2][1]=100;  a[2][2]=110;  a[2][3]=120;

		for (int r=0; r<3; r++) { // 행
			for (int c=0; c<4; c++) { // 열
				System.out.print(a[r][c] + "\t");
			}
			System.out.println();
		}
		
		System.out.println("===========================");
		
		// 정방형 배열: 각 행마다 열의 갯수가 동일한 배열
		
		// 3행 2열의 2차원 정수형 배열
		int[][] b = { { 10, 20 }, 
				      { 30, 40 }, 
				      { 50, 60 } };
		
		System.out.println("행의 개수는 " + b.length); // 3
		System.out.println("첫번째 행을 기준으로 열의 개수는 " + b[0].length); // 2
		
		for (int r=0; r<b.length; r++) { // 행
			for (int c=0; c<b[0].length; c++) { // 열
				System.out.print(b[r][c] + "\t");
			}
			System.out.println();
		}
		
	} // main

}
