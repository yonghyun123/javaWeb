package kr.or.connect.diexam01;

public class Car {
	
	private Engine v8;
	public Car(){
		System.out.println("Car 생성자");
	}
	public void setEngine(Engine e){
		v8 = e;
	}
	public void run(){
		System.out.println("엔진을 이용하여 달립니다");
		v8.exec();
	}
	
	public static void main(String[] args){
		Engine e = new Engine();
		Car car = new Car();
		car.setEngine(e);
		car.run();
	}

}
