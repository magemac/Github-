package java0412;

public class Ex8 {

	public static void main(String[] args) {
		// 정수형 배열 numArr에 임의의 정수 10개 저장
		int[] numArr = { 79, 88, 91, 33, 100, 55, 95, 81, 75, 64 };
		int evenCnt = 0;  // 짝수의 갯수
		int oddCnt = 0;   // 홀수의 갯수
		int evenSum = 0;  // 짝수의 누적합
		int oddSum = 0;   // 홀수의 누적합
		
		// numArr 배열 요소들 중에서 짝수, 홀수 각각의 갯수와 누적합 구하기
		for (int i=0; i<numArr.length; i++) {
			if (numArr[i] % 2 == 0) {  // 짝수
				evenSum += numArr[i];
				evenCnt++;
			} else { // numArr[i] % 2 == 1  // 홀수
				oddSum += numArr[i];
				oddCnt++;
			}
		}
		
		System.out.println("짝수 갯수: " + evenCnt);
		System.out.println("홀수 갯수: " + oddCnt);
		System.out.println("짝수 합: " + evenSum);
		System.out.println("홀수 합: " + oddSum);
		
		System.out.println("=============================");
		
		int a = 10;
		int b = 20;
		int temp = 0; // 임시변수. 잠시 저장하는 변수
		System.out.println("a = " + a + ", b = " + b);
		
		// 값 교환하기
		temp = a;
		a = b;
		b = temp;
		System.out.println("a = " + a + ", b = " + b);
		
		System.out.println("=============================");
		
		// 배열 요소 중 최대값 구하기
		int max = numArr[0];  // 배열 첫번째 요소값으로 초기화
		for (int i=1; i<numArr.length; i++) {
			if (max < numArr[i]) { // 두번째 부터 마지막 요소까지 비교
				max = numArr[i]; // 비교대상 값이 크면 그 값으로 수정
			}
		}
		System.out.println("numArr 배열의 최대값은 " + max); // 100
		
		// 배열 요소 중 최소값 구하기
		int min = numArr[0];
		for (int i=1; i<numArr.length; i++) {
			if (min > numArr[i]) { // 두번째 부터 마지막 요소까지 비교
				min = numArr[i]; // 비교대상 값이 크면 그 값으로 수정
			}
		}
		System.out.println("numArr 배열의 최소값은 " + min); // 33
		
		// 배열 요소 출력
		for (int i=0; i<numArr.length; i++) {
			System.out.print(numArr[i] + " ");
		}
		System.out.println();
		
		// [79] 88 91 33 100 55 95 81 75 64
		// [88] 79 91 33 100 55 95 81 75 64
		// [91] 79 88 33 100 55 95 81 75 64
		// [91] 79 88 33 100 55 95 81 75 64
		// [100] 79 88 33 91 55 95 81 75 64
		temp = 0;
		for (int i=1; i<numArr.length; i++) {
			if (numArr[0] < numArr[i]) { // 0번째 요소 기준으로 인덱스 1~마지막 까지 비교해서 더 큰값 찾기
				// 더 큰값을 찾으면 서로 값을 교환하기
				temp = numArr[0];
				numArr[0] = numArr[i];
				numArr[i] = temp;
			}
		}
		
		// 배열 요소 출력
		for (int i=0; i<numArr.length; i++) {
			System.out.print(numArr[i] + " ");
		}
		System.out.println();
		
		
		// 100 [79] 88 33 91 55 95 81 75 64
		temp = 0;
		for (int i=2; i<numArr.length; i++) {
			if (numArr[1] < numArr[i]) { // 1번째 요소 기준으로 인덱스 2~마지막 까지 비교해서 더 큰값 찾기
				// 더 큰값을 찾으면 서로 값을 교환하기
				temp = numArr[1];
				numArr[1] = numArr[i];
				numArr[i] = temp;
			}
		}
		
		// 배열 요소 출력
		for (int i=0; i<numArr.length; i++) {
			System.out.print(numArr[i] + " ");
		}
		System.out.println();
		
		// 이중 반복문으로 배열요소값 내림차순 정렬하기
		temp = 0;
		// 기준 인덱스번호 옮기는 역할
		for (int gijun=0; gijun<numArr.length-1; gijun++) {
			// 기준 인덱스의 다음요소와 비교
			for (int i = gijun+1; i<numArr.length; i++) {
				if (numArr[gijun] < numArr[i]) {
					// 기준요소의 값보다 더 큰값이면 값 서로 교환하기
					temp = numArr[gijun];
					numArr[gijun] = numArr[i];
					numArr[i] = temp;
				}
			}
		}
		
		// 배열 요소 출력
		for (int i=0; i<numArr.length; i++) {
			System.out.print(numArr[i] + " ");
		}
		System.out.println();
		
		System.out.println("====================");
		
		
		
		
		
		
	} // main

}
