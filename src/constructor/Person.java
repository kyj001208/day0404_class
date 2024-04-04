package constructor;

public class Person {

	String name;
	int age;
	double height;

	void disp() {
		System.out.print("이름: " + name);
		System.out.print(", 나이 : " + age);
		System.out.println(", 키: " + height);
		
	}
	
	
	public Person(String name) {

		this.name = name;

	}

	public Person(String name, int age) {

		this.name = name;
		this.age = age;

	}
	
	public Person(String name, int age, double height) {

		this(name,age);
		this.height=height;

	}

	
	public Person() {

	}

}
