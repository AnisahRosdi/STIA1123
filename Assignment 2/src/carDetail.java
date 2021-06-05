
import java.util.Scanner;
public abstract class carDetail extends rentalCar{ //1.3 User-defined class

	 carDetail() { //1.4 Constructor with no arguments
		
		 Scanner s = new Scanner(System.in);
		
		 System.out.println();
		 System.out.println("-------------------------------Product Details-----------------------------------------------");
		 
		 
			System.out.println("From here, you can survey about our product and get to know more detail about the product"
					+ "\n \nThere are 2 type of car that you can choose."
					 );
			
			
		
				System.out.println("\n1. Small car(Kancil/myvi)"
						+ "\n\tColour: red/black/white"
						+ "\n\tPrice per day: RM 50");
				
			
			
				System.out.println("\n2. MPV(Avanza/Alza)"
						+ "\n\tColour: black/white"
						+ "\n\tPrice pe day: Rm 80");
			} 
		
	 }
