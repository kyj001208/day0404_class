package method;

import java.util.Scanner;

public class CalcTest {

	public static void main(String[] args) {
		
		CaclService cac=new CaclService();
		
		cac.disp();
		
		cac.display("몽여름", "산책");
		cac.display(2, "산책");
		cac.display("산", 2);

		
		Scanner in=new Scanner(System.in);
		in.nextInt(0);
	}

}
