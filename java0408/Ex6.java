package java0408;

import java.util.Scanner;

public class Ex6 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); // 키보드 입력받는 객체 준비
		
		// 주민번호 뒷번호에 첫자리 숫자가
		// 1 남  2 여  3 남  4 여
		
		System.out.print("주민번호 뒷번호 첫자리 숫자를 입력: ");
		int ju = scanner.nextInt();  // 1 2 3 4  중에 한개가 입력됨
		
		String gender = ""; // 성별이 남자에 해당하면 "남자", 여자면 "여자"
		// 조건(삼항)연산자를 사용해서 gender에 저장하고 아래처럼 출력하세요
		gender = (ju == 2 || ju == 4) ? "여자" : "남자";
		
		System.out.println(ju + " -> " + gender);
		//=============================================
		
	} // main

}



