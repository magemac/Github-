package java0415;

import javax.swing.JFrame;

// 중학생은 학생이다.
// Ex5는 프레임이다.
public class Ex5 extends JFrame {

	public Ex5() {
		setTitle("창 제목");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setSize(500, 400);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new Ex5();
	}
}
