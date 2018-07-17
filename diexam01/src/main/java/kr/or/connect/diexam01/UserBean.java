package kr.or.connect.diexam01;

public class UserBean {
	/*
	 * 1. 기본생성자를 가진다.
	 * 2. 필드는 private으로 선언
	 * 3. getter setter 메서드를 가진다.
	 * 4. getName(), setName() 을 가리켜 name 프로퍼티(property)라고 함 아주중요
	 */
	
	private String name;
	private int age;
	private boolean male;
	
	public UserBean(){}
	
	public UserBean(String name, int age, boolean male){
		this.name = name;
		this.age = age;
		this.male = male;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public boolean isMale() {
		return male;
	}

	public void setMale(boolean male) {
		this.male = male;
	}
	
	
	
}
