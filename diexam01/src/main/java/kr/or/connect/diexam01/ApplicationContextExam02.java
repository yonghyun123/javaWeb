package kr.or.connect.diexam01;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ApplicationContextExam02 {
	
	public static void main(String[] agrs){
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Car car = (Car)ac.getBean("car");
		car.run();
	}

}
