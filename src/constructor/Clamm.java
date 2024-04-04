package constructor;

public class Clamm {
	
	
	int num1;
	int num2;
	
	
	public Clamm(int num1,int num2) {
		
		this.num1=num1;
		this.num2=num2;
		
	}
	

	public static void main(String[] args) {
		
		Clamm clamm =new Clamm(10,20);
		System.out.println(clamm);
		System.out.println(clamm.num1);
		System.out.println(clamm.num2);
		
		
		Clamm clamm1 =new Clamm(100,200);
		System.out.println(clamm1);
		System.out.println(clamm1.num1);
		System.out.println(clamm1.num2);

	}

}
