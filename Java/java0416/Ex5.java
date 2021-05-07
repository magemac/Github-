package java0416;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
class Point2Dv { // 2차원 좌표
	private int x;
	private int y;
	
	public String getInfo() {
		return x + ", " + y;
	}
} // class Point2D

@Getter
@Setter
class Point3Dv extends Point2Dv { // 3차원 좌표
	private int z;

	// getInfo 메소드 재정의    "x, y, z" 리턴
	@Override
	public String getInfo() {
		String str = super.getInfo();
		return str + ", " + z;
	}
} // class Point3D


public class Ex5 {

	public static void main(String[] args) {
		Point3Dv p3 = new Point3Dv();
		
		p3.setX(10);
		p3.setY(20);
		p3.setZ(30);
		
		System.out.println(p3.getInfo());
	} // main
}





