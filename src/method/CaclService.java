package method;

public class CaclService {
	

	public void disp() {

		System.out.println("안녕하세요");
	}
	
	public void display(String name, String work) {

		System.out.println(name + "님! 안녕하세요");
		System.out.println("오늘할일은  "+work+" 입니다");
	
	}
	
	public void display(int n, String work) {

		System.out.println("오늘할일은  "+work+" 입니다");
		System.out.println(n+"번 하면 돼요");
		
	}
	
	public void display( String work, int n) {

		System.out.println("오늘할일은  "+work+" 입니다");
		System.out.println(n+"번 하면 돼요");
		
	}
	
	
}
