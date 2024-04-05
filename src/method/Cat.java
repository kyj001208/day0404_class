package method;

import java.time.LocalDate;

public class Cat {

	private String name;
	private String breed;
	private int age;
	
	
	public int parseInt(String str) {
		
		int result=Integer.parseInt(str);
		return result;
	}
	
	
	public LocalDate date(LocalDate today) {
		LocalDate targetDay=today.plusDays(7);
		return targetDay;
	}
	
	
	public void display() {
		
		System.out.println("이름 : " +name);
		System.out.println("종 : " +breed);
		System.out.println("나이 : " +age);
	}
	

	public void setName(String name) { 
		this.name = name;
	}
	
	
	
	public String getName() {
		return name;
	}

	
	
	public void setBreed(String breed) {
		this.breed = breed;
	}

	public String getBreed() {
		return breed;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getAge() {
		return age;
	}

}
