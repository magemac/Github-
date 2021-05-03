package java0414;


// 텔레비전 클래스 Tv
//  멤버변수
//    전원상태 on/off   boolean형  power
//    채널정보 정수형 channel
//  메소드
//    전원켜고끄기 메소드 
//    powerOnOff()    false -> true -> false
//    channelUp()    채널 1 증가
//    channelDown()  채널 1 감소
class Tv {
	boolean power; // 기본값 false
	int channel;   // 기본값 0
	
	// 전원 켜고끄는 메소드
	void powerOnOff() {
//		if (power == true) {
//			power = false;
//		} else { // power == false
//			power = true;
//		}
		
//		power = (power == true) ? false : true;
		
		power = !power;
	}
	
	void channelUp() {
		channel++;
	}
	
	void channelDown() {
		channel--;
	}
}

public class Ex3 {

	public static void main(String[] args) {
		// Tv 객체생성 tv
		Tv tv;
		// ...
		tv = new Tv();
		
		// 전원 켜기
		tv.powerOnOff();
		
		// 전원 현재상태 출력
		System.out.println(tv.power);
		
		// 채널 올리기
		tv.channelUp();
		// 채널 올리기
		tv.channelUp();
		// 채널 현재값 출력
		System.out.println(tv.channel);
		// 채널 내리기
		tv.channelDown();
		// 채널 현재값 출력
		System.out.println(tv.channel);
	} // main

}




