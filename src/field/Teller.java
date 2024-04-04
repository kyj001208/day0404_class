package field;

public class Teller {
	
	int tellerNo;  //창구 번호
	static int tiketNo=1;  //번호표
	//정적 메모리에 할당, 인스턴스화된 객체들이 공유한다
	
	public Teller(int tellerNo) {
		this.tellerNo=tellerNo;
		
	}
	
	
	void call() throws InterruptedException {
		System.out.println(tiketNo +"번 손님 " + +tellerNo+" 번 창구로 오세요");
		Thread.sleep(1000);
		
		tiketNo++;
	
	}
}
