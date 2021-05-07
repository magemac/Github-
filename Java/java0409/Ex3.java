package java0409;

public class Ex3 {

	public static void main(String[] args) {
		
		int height;     // cm단위 키. 175cm
		double dHeight; // m단위 키.  1.75m
		double weight;  // 체중 kg단위
		double bmi; // bmi 비만지수 구할 변수
		
		// cm를 m단위로 바꾸기
		height = 175;
		dHeight = height / 100.0;
		weight = 78.2;
		
		// 비만지수 구해서 출력
		// 비만지수bmi = 몸무게kg / 키m의 제곱
		bmi = weight / (dHeight * dHeight);
		
		// 비만지수           출력문장
		// 30.0이상           고도비만
		// 25.0이상~30.0미만  비만
		// 23.0이상~25.0미만  과체중
		// 18.5이상~23.0미만  표준체중
		// 18.5미만           체중미달
		if (bmi >= 30.0) {
			System.out.println("고도비만");
		} else if (bmi >= 25.0) { // bmi < 30.0
			System.out.println("비만");
		} else if (bmi >= 23.0) { // bmi < 25.0
			System.out.println("과체중");
		} else if (bmi >= 18.5) { // bmi < 23.0
			System.out.println("표준체중");
		} else { // bmi < 18.5
			System.out.println("체중미달");
		}
	} // main

}
