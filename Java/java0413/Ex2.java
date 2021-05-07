package java0413;

public class Ex2 {

	public static void main(String[] args) {
		// 비정방형 배열: 각 행마다 열의 갯수가 다른 배열
		
		int[][] numArr = { { 1, 2 }, 
				           { 3, 4 }, 
				           { 5, 6, 7 } };
		
		System.out.println("0번째 행의 열의 갯수는 " + numArr[0].length);//2
		System.out.println("2번째 행의 열의 갯수는 " + numArr[2].length);//3
		
		for (int r=0; r<numArr.length; r++) { // 행
			for (int c=0; c<numArr[r].length; c++) { // 열
				System.out.print(numArr[r][c] + "\t");
			}
			System.out.println();
		}
		
		System.out.println("==========================");
		
		// 2차원 문자열 배열 names
		// 첫번째행 데이터는  "홍길동" "이순신"
		// 두번째행 데이터는  "유관순"
		String[][] names;
		names = new String[][] { 
									{ "홍길동", "이순신" }, 
			                        { "유관순"}
							   };
		
		// names 배열의 모든 요소를 출력
		for (int i=0; i<names.length; i++) { // 행
			for (int j=0; j<names[i].length; j++) { // 열
				System.out.print(names[i][j] + "\t");
			}
			System.out.println();
		}
		
		System.out.println("==========================");
		
		// for-each문
		for (String[] namesRow : names) {
			for (String name : namesRow) {
				System.out.print(name + "\t");
			}
			System.out.println();
		}
		
	} // main

}
