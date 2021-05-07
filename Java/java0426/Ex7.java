package java0426;

class GoThread extends Thread {
	
	@Override
	public void run() { // 스레드의 시작점 메소드 역할
		methodGo();
		
		// run()이 끝나면 스레드는 할일이 없어서 종료됨
	} // run

	public void methodGo() {
		while (true) {
			System.out.println("Go");
		}
	}
}

class ComeThread extends Thread {
	
	@Override
	public void run() {
		methodCome();
	}

	public void methodCome() {
		while (true) {
			System.out.println("Come");
		}
	}
}

public class Ex7 {

	public static void main(String[] args) {
		// 멀티 스레드 사용방법 두가지
		// 첫번째 방법 : java.lang.Thread 클래스 상속
		//    run() 스레드 시작점 메소드 오버라이딩함
		//   스레드 상속받은 객체에 start() 메소드 호출하여 스레드 실행시킴
		
		// 스레드 객체를 생성하면 해당 스레드 객체가 관리하는 스택이 생성됨
		GoThread goThread = new GoThread();
		ComeThread comeThread = new ComeThread();
		
		// JVM에세 해당 스레드를 시작하도록 start()를 호출함(부탁함)
		// JVM이 스레드 실행 스케줄을 관리함
		goThread.start();  // 스레드 시작 -> JVM이 run()을 호출해줌
		comeThread.start();// 스레드 시작 -> JVM이 run()을 호출해줌
	} // main

}




