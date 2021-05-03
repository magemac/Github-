package java0415;

public class Car2 {
	// 멤버변수 (필드 field)
	String color;   // 색상
	String gearType;  // "auto" 자동   "manual" 수동
	int doorCount;  // 문 갯수
	
	// 기본생성자
	Car2() {
//		color = "white";
//		gearType = "auto";
//		doorCount = 4;
		
		// this() 생성자 용법은 생성자 코드블록 안에서만 사용가능함
		// this() 호출문은 첫문장이 되야 함
	}
	
	Car2(String color) {
//		this.color = color;
//		gearType = "auto";
//		doorCount = 4;
		
		this.color = color;
	}
	
	Car2(String color, String gearType) {
//		this.color = color;
//		this.gearType = gearType;
		
		this(color);
		this.gearType = gearType;
	}
	
	Car2(String color, String gearType, int doorCount) {
//		this.color = color;
//		this.gearType = gearType;
//		this.doorCount = doorCount;
		
		this(color, gearType);
		this.doorCount = doorCount;
	}
	
}






