

import java.util.Scanner;

public class main { //1.3 User-defined class
	
	public static void main(String args[]) {
		
	Scanner input = new Scanner(System.in);
	
		System.out.print("Enter your choice(Admin(1)/Customer(2)): ");
		int choice= input.nextInt();
		System.out.print("");
		
		if(choice == 2) {
			
			System.out.println("");
			
			advertisement b = new advertisement(0);
			carDetail c = new carDetail();
			customer d = new Customer();
			d.customer;
		}	
			else if(choice == 1) {
				
				employee e = new employee();
				System.out.println("");
				finance f = new finance(3,2);
			
		}
			else {
				System.out.println("You enter wrong choice");
			}
	}
	
}
