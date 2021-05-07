package java0422;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Ex6 {

	public static void main(String[] args) {
		// Map 컬렉션 : (키, 값) 쌍으로 데이터를 관리함
		// - HashMap, Hashtable, TreeMap
		//  키는 유일해야 함(내부적으로 Set으로 구현되어 있음)
		
		// 제네릭 타입 = 타입 매개변수
		
		Map<String, String> engDicMap = new HashMap<>(); // 영단어장 Map 객체 준비
		engDicMap.put("sky", "하늘");
		engDicMap.put("red", "빨강");
		engDicMap.put("blue", "파랑");
		engDicMap.put("sky", "하늘색"); // 수정 목적
		System.out.println(engDicMap);
		
		// Map의 모든 요소를 접근하기
		//  1) Map의 키셋을 가져오기
		//  2) 키를 통해서 값을 가져오기 (반복)
		Set<String> keySet = engDicMap.keySet();
		
		for (String key : keySet) {
			String color = engDicMap.get(key);
			System.out.println(color);
		}
		
		System.out.println("============================");
		
		Map<String, Person> personMap = new HashMap<>();
		
		// put은 키를 기준으로 값을 추가 또는 수정(동일 키로 값을 넣을 시 수정됨)
		personMap.put("홍길동", new Person("홍길동", 20, "부산"));
		personMap.put("성춘향", new Person("성춘향", 18, "서울"));
		personMap.put("이몽룡", new Person("이몽룡", 22, "대전"));
		personMap.put("성춘향", new Person("성춘향", 19, "대구")); // 키가 동일시, 값 수정이 목적
		
		System.out.println(personMap);
		
		System.out.println("============================");
		
		Person person = personMap.get("성춘향");
		System.out.println(person);
		
		System.out.println(personMap.size()); // 3
		
		System.out.println("============================");
		// personMap 에 모든요소 접근하기
		Set<String> keyNames = personMap.keySet();
		
		for (String name : keyNames) {
			Person p = personMap.get(name);
			System.out.println(p.toString());
		}
		
		System.out.println("============================");
		
		System.out.println(personMap.isEmpty()); // false
		personMap.clear(); // 컬렉션 비우기
		System.out.println(personMap.isEmpty()); // true
	} // main

}





