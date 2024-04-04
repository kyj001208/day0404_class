package constructor;

public class Clazz {
	
	
	
	
	public Clazz() {//생성자

		System.out.println("안녕하세요");
		
	}

	public static void main(String[] args) {//메인 메서드, 프로그램 시작점 
		System.out.println("프로그램 시작");
		
		//object 참조변수
		Clazz clazz=new Clazz(); //생성자를 호출하면 "안녕하세요"가 보임 
		
		System.out.println("프로그램 종료");
	}

}
