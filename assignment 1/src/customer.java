
import java.util.*; //1.2 Pre-defined class

public class customer { //1.3 User-defined class

	private String name;
	int ic;
	int phoneNum;
	String location;
	int postcode;
	
	Scanner input = new Scanner(System.in);
	
	    customer() { // 1.4 Constructor with one arguments
	    	
		System.out.println();
	    System.out.println("----------Enter Customers Detail------------");
	    
		System.out.print("Full Name: ");
		name = input.nextLine();
		
		System.out.print("Ic number: ");
		ic = input.nextInt();
		
		System.out.print("Phone number(60+): ");
		phoneNum = input.nextInt();
		
		input.nextLine();
		System.out.print("Current Location: ");
		location = input.nextLine();
		
		System.out.print("Postcode: ");
		postcode = input.nextInt();
	}
	
	public String getName() {
		return name;
	}
}

