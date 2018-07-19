package kr.or.connect.diexam01;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Car {
	private Engine v8;
	private Tire t1;
	
	public Car(){
		System.out.println("Car 생성자");
	}

	public void setEngine(Engine e){
		v8 = e;
	}
	public void setTire(Tire t){
		t1 = t;
	}
	
	public void run(){
		v8.exec();
		t1.repair();
		System.out.println("타이어와 엔진을 이용하여 달립니다");
	}
//
//	public static void main(String[] args){
//		Car car = new Car();
//		Engine e = new Engine();
//		car.setEngine(e);
//		car.run();
//	}

}
