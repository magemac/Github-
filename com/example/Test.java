package com.example;

import java.util.List;
import java.util.Scanner;
import java.util.Vector;

public class Test {

	public static void main(String[] args) {
		// 1. Scanner 클래스로 -1이 입력될 때까지 양의 정수를 입력받아
		//    벡터에 저장하고 벡터를 검색하여 가장 큰 수를 출력하는 프로그램
		
		Scanner scanner = new Scanner(System.in); // 키보드 입력받는 스캐너 객체 준비
		
		List<Integer> list = new Vector<>(); // List 컬렉션 Vector객체 준비
		
		System.out.print("정수(-1이 입력될 때까지) >> ");
		
		while (true) {
			int num = scanner.nextInt(); // 공백문자(스페이스바, 줄바꿈문자, 탭문자 등) 앞까지 읽어서 정수로 리턴
			if (num == -1) {
				break;
			}
			list.add(num); // 입력된 숫자를 리스트에 추가
		}
		
		System.out.println(list.toString());

	} // main

}




