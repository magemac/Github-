package java0414;

public class Student {
	// 멤버변수
	int hakbun = 2;  // 학번
	String name = "둘리"; // 이름
	
	//int kor, eng, math;
	int[] scores; // 세과목 점수를 저장할 배열 선언
	
	// 기본생성자(default constructor) : 매개변수 없는 생성자
	//  - 클래스 정의 안에 생성자 코드블록이 없으면 컴파일러가 컴파일시에 자동으로 넣어줌
	//  - 생성자는 반환형 정보는 없음
	Student() {
		// 생성자의 역할 : 생성된 객체의 속성(멤버변수)을 초기화하는 역할
		System.out.println("=== Student 생성자 호출됨 ===");
		hakbun = 1;
		name = "홍길동";
		scores = new int[3]; // 배열객체 준비
	}
	
	// 세과목 점수의 합계를 리턴하는 메소드
	int getSum() {
		//return scores[0] + scores[1] + scores[2];
		int sum = 0;
		
		for (int i=0; i<scores.length; i++) {
			sum += scores[i];
		}
		return sum;
	} // sum
	// 세과목 점수의 평균을 리턴하는 메소드
	double getAvg() {
		return (double)getSum() / scores.length;
	}
}




