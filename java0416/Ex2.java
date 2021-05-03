package java0416;

import lombok.Getter;
import lombok.Setter;

// 클래스에 롬복 애노테이션 @Getter @Setter 적용도 해보세요

// 클래스 Tv
//   멤버변수  정수형  channel
//   메소드    void channelUp()    채널값 1 증가
//   메소드    void channelDown()  채널값 1 감소

@Getter
@Setter
class Tv {
	private int channel;
	
	public void channelUp() {
		channel++;
	}
	
	public void channelDown() {
		channel--;
	}
}

// 클래스 CaptionTv (자막기능 TV)   상속 Tv
//   멤버변수   boolean  isCaptionOn  자막상태
//   메소드     void displayCaption   "자막상태: true/false"
@Getter
@Setter
class CaptionTv extends Tv {
	private boolean captionOn;
	
	public void displayCaption() {
		System.out.println("자막상태: " + captionOn);
	}
}

public class Ex2 {

	public static void main(String[] args) {
		CaptionTv capTv = new CaptionTv();
		
		System.out.println("현재 채널값은 " + capTv.getChannel());
		capTv.displayCaption();
		
		capTv.setChannel(11);
		capTv.setCaptionOn(true);
		
		System.out.println("현재 채널값은 " + capTv.getChannel());
		capTv.displayCaption();
	} // main
}
