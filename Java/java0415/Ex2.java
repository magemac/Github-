package java0415;

public class Ex2 {

	public static void main(String[] args) {
		
		MyCar myCar = new MyCar(); // 생성자를 통해 엔진만 갖춘 상태
		
		// ...
		myCar.setCarAudio(new CarAudio()); // 새로운 카오디오를 자동차에 장착
		// ...
		
		Engine engine = new Engine();
		
		myCar.setEngine(engine); // 새로운 엔진을 자동차에 장착

	} // main

}
