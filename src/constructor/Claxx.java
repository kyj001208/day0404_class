package constructor;

public class Claxx {
	
	//인스턴스변수 
	int a;
	double b;
	
	
	public static void main(String[] args) {
	
		//명시적으로 정의되지 않았어도 생성자는 존재합니다. _default 생성자 : 
		Claxx Claxx =new Claxx(); //객체 변수. 인스턴스 변수 이름
		
		System.out.println("a "+Claxx.a);
		System.out.println("b "+Claxx.b);
		
		
	}

}
