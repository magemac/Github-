package java0412;

public class Ex2 {

	public static void main(String[] args) {
		// 중첩 반복문
		for (int j=1; j<=3; j++) { // 바깥쪽 반복문 (행 row)
			for (int i=1; i<=5; i++) {  // 안쪽 반복문 (열 column)
				System.out.print("*");
			}
			System.out.println();
		}
		
		// 구구단 2단~9단  가로출력
		// 2*1=2   2*2=4   2*3=6   ...   2*9=18
		// 3*1=3   3*2=6   3*3=9   ...   3*9=27
		// ...
		// 9*1=9   9*2=18  9*3=27  ...   9*9=81
		for (int dan=2; dan<=9; dan++) {
			for (int i=1; i<=9; i++) {
				System.out.printf("%d*%d=%d\t", dan, i, dan*i);
			}
			System.out.print("\n");
		}
		
		// 구구단 2단~9단  세로출력
		// 2*1=2   3*1=3   4*1=4   ...   9*1=9
		// 2*2=4   3*2=6   4*2=8   ...   9*2=18
		// ...
		// 2*9=18  3*9=27  4*9=36  ...   9*9=81
		for (int i=1; i<=9; i++) {
			for (int dan=2; dan<=9; dan++) {
				System.out.printf("%d*%d=%d\t", dan, i, dan*i);
			}
			System.out.print("\n");
		}
		
	} // main

}
