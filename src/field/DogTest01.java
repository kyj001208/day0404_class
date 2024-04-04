package field;

import java.util.Scanner;
//가능하면 필요한 클래스만 import하는 것이 좋다


public class DogTest01 {

	public static void main(String[] args) {
		
		
		Dog dog=new Dog();
		
		
		
		System.out.println("강아지 정보를 입력하세요");
		
		Scanner in=new Scanner(System.in);
		
		
		System.out.println("강아지 종은 무엇입니까?");
		dog.breed=in.nextLine();
		
		System.out.println("나이는 몇살입니까?");
		dog.age=in.nextInt();
		
		System.out.println("털은 무슨색입니까?");
		dog.color=in.next();
		in.close();
		
		
		System.out.println("품종 : "+dog.breed);
		System.out.println("나이 : "+dog.age);
		System.out.println("털색 : "+dog.color);
	}

}
