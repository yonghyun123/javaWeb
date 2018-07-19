package kr.or.connect.diexam01;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationConfig {
	@Bean
	public Car car(Engine e, Tire t){
		Car c = new Car();
		c.setEngine(e);
		c.setTire(t);
		return c;
	}
	@Bean
	public Engine engine(){
		return new Engine();
	}
	
	@Bean
	public Tire tire(){
		return new Tire();
	}

}
