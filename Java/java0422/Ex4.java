package java0422;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class Ex4 {

	public static void main(String[] args) {
		// Set에 제네릭 타입 적용하기
		
		// add()로 값 추가한 순서정보를 유지함
		Set<Integer> set = new LinkedHashSet<Integer>();
		
		//set.add("문자열");
		set.add(10);
		set.add(20);
		set.add(30);
		set.add(20); // Set은 중복값 저장불가
		
		System.out.println(set); // [10, 20, 30]
		
		System.out.println("========================");
		
		// Set에서 값을 한개씩 꺼내는 방법. 첫번째: Iterator (반복자) 타입으로 참조 가져와서 사용하기
		Iterator<Integer> iter = set.iterator(); // 반복자 객체 가져오기
		
		while (iter.hasNext()) {
			int num = iter.next();
			System.out.println("num = " + num);
		}
		
		System.out.println("========================");
		
		for (int num : set) {
			System.out.println("num = " + num);
		}
		
	} // main
}






