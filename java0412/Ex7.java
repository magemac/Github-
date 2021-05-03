package java0412;

public class Ex7 {

	public static void main(String[] args) {
		// 배열 점수 scores  100 90 83 77 66
		int[] scores = { 100, 90, 83, 77, 66 };
		int sum = 0;
		double avg = 0;
		
		// for문 이용해서 합계 구하기
		for (int i=0; i < scores.length; i++) {
			sum += scores[i]; // sum = sum + scores[i];
		}
		
		// 평균 구하기
		avg = (double) sum / scores.length;
		
		// 출력
		System.out.println("합계: " + sum);
		System.out.println("평균: " + avg);
		
		System.out.println("================");
		
		sum = 0;
		for (int score : scores) {
			sum += score;
		}
		System.out.println("합계: " + sum);

	} // main

}
