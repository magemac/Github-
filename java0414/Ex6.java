package java0414;

import java0415.Car;

public class Ex6 {

	public static void main(String[] args) {
		
		Animal ani = new Animal();
		ani.doRun();
		
		ani.name = "고양이";
		ani.age = 5;
		ani.doRun();
		
		ani.setName("사자");
		ani.setAge(10);
		System.out.println(ani.getName());
		System.out.println(ani.getAge());
		
		System.out.println("==============");
		
		Animal ani2 = new Animal(2);
		ani2.setName("토끼");
		ani2.doRun();
		
		Animal ani3 = new Animal("기린", 4);
		ani3.doRun();
		
		System.out.println("==============");
		
		Car car = new Car();
		System.out.println(car.getColor());
		
	} // main

}
