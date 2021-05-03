package java0415;

public class TakeTrans {

	public static void main(String[] args) {
		// 학생 객체 두명 준비
		Student stu1 = new Student("James", 5000);
		Student stu2 = new Student("Tomas", 10000);
		
		// James가 버스에 타는 상황
		Bus bus = new Bus(100);
		stu1.takeBus(bus);
		stu1.showInfo();
		bus.showInfo();
		
		System.out.println("=====================");
		
		Bus bus2 = new Bus(22);
		stu1.takeBus(bus2);
		stu1.showInfo();
		bus2.showInfo();
		
		System.out.println("=====================");
		
		// Tomas가 지하철에 타는 상황
		Subway subway = new Subway("2호선");
		stu2.takeSubway(subway);
		stu2.showInfo();
		subway.showInfo();
	} // main

}
