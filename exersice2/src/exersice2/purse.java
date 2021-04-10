package exersice2;

import java.util.Scanner;

public class purse {
	String m,b,g;
	double p,discount,calculateprice1,calculateprice2,total;
	int v,d,choose;
	
	//for input
	Scanner input = new Scanner(System.in);
	
	//method 1 = input data and output(print)
	void printScanner() {
		System.out.println("Enter material, brand,gender:");
		 m =input.nextLine();
		 b =input.nextLine();
		 g =input.nextLine();
		
		System.out.println("Purse for " + g);
		System.out.println("Material of purse:" + m);
		System.out.println("Brand of purse:" + b);
		System.out.println("");
	}//end method 1
	
	
	//2nd method calculate price(calculateprice1)
	void calculateprice() {
		System.out.print("Enter price :RM");
		 p =input.nextDouble();
		System.out.print("Enter number of item: ");
		 v =input.nextInt();
		
		calculateprice1= p * v;
		System.out.printf("Price is RM" + "%.2f",calculateprice1);
		System.out.println("");
	}//end method 2
	
	
	//3rd method calculate discount
	void discount(double d) {
		if (calculateprice1 >=150) {
			
	    calculateprice2= d * calculateprice1;
		System.out.println("Discount is 10%");
		System.out.printf("Price after discount is RM" + "%.2f\n",calculateprice2);
		}else
			{
			calculateprice2 =calculateprice1;
			System.out.println("No discount");
			}//end if else
	}//end method 3
	
		
	//4th method totalpayment
	void totalpayment() {
		System.out.print("Choose delivery 1(fast) or 2(standard):");
		 choose=input.nextInt();
		
		if(choose == 1) {
			System.out.println("Delivery charge is RM 14");
			total= 14 + calculateprice2;
			System.out.printf("Total payment : RM" + "%.2f\n",total);
		}else
		{
			System.out.println("Delivery Charge is RM7");
		    total= 7 + calculateprice2;
		    System.out.printf("Total payment : RM" + "%.2f\n",total);
		}//end if else
	}//end method 4
}
