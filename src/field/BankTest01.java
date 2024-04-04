package field;

import java.util.Random;

public class BankTest01 {
	
	public static void main(String[] args) throws InterruptedException {
		
		Bank bank=new Bank(3); //텔러 세명있는 코드
		
		Random ran=new Random();
		
		for(int i=0; i<10; i++) {
		int tellerNo =ran.nextInt(3);
		//int tellerNo=0;
		bank.tellers[tellerNo].call();
		
		}
	}

}
class Bank{
	
	Teller [] tellers;
	//teller[0], teller[1], teller[2]
	
	//Teller teller1=new Teller();
	//Teller teller2=new Teller();
	//Teller teller3=new Teller(); //일일히 하기 힘드니 배열을 통해 
	
	
	//tellers[0], tellers[1], tellers[2]
	public Bank(int n) {
		
		tellers=new Teller[n];
		
		for(int i=0; i<n; i++) {
			
			tellers[i]=new Teller(i+1);
			
		}
	}
	
}