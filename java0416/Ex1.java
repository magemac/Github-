package java0416;

import lombok.Getter;
import lombok.Setter;

// @annotation 애노테이션 : 기능이 있는 주석
@Getter
@Setter
class Point2D { // 2차원 좌표
	private int x;
	private int y;
	
	public void showInfo2D() {
		System.out.println(x + ", " + y);
	}
} // class Point2D

@Getter
@Setter
class Point3D extends Point2D { // 3차원 좌표
	private int z;

	void showInfo3D() {
		System.out.println(getX() + ", " + getY() + ", " + z);
	}
} // class Point3D

public class Ex1 {

	public static void main(String[] args) {
		// Point3D 객체 생성
		Point3D point3d = new Point3D();
		
		point3d.setX(10);
		point3d.setY(20);
		point3d.setZ(30);
		
		point3d.showInfo2D();
		point3d.showInfo3D();
	} // main

}






