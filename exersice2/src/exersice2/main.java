package exersice2;

import java.util.Scanner;

public class main {

	
	public static void main(String[] args) {
		
		//create first new object
		purse man = new purse();
		System.out.println();
		man.printScanner();
		man.calculateprice();
		man.discount(0.9);
		man.totalpayment();
		
		//create second new object purse
		purse woman = new purse();
		
		System.out.println();
		woman.printScanner();
		woman.calculateprice();
		woman.discount(0.9);
		woman.totalpayment();

	}

}
