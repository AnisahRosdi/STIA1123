
import java.util.*; //1.2 Pre-defined class

public abstract class customer extends rentalCar{ //1.3 User-defined class

	private String name;
	private int ic;
	private int phoneNum;
	private String address;
	
	Scanner input = new Scanner(System.in);
	
	    customer() { // 1.4 Constructor with one arguments
	    	
	    	System.out.println(
		    		"\nOur company provide a service to rent a storage to store your belonging."
		    		+ "\nFor more information:"
		    		+ "\nCompany name\t\t\t:" + super.getname()
		    		+ "\nContact us\t\t\t:" + getcontact()
		    		+ "\nEmail\t\t\t\t:" + getaddress()
		    		+ "\nVisit our main company\t\t:" + getemail());
	    	
		System.out.println();
	    System.out.println("----------Enter Customers Detail------------");
	    
		System.out.print("Full Name: ");
		name = input.nextLine();
		
		System.out.print("Ic number: ");
		ic = input.nextInt();
		
		System.out.print("Phone number(60+): ");
		phoneNum = input.nextInt();
		
		input.nextLine();
		System.out.print("Address: ");
		address = input.nextLine();

	}
	
	public String getName() {
		return name;
	}
	public String getaddress() {
		return address;
	}
	public int getic() {
		return ic;
	}
	public int getphoneNum() {
		return phoneNum;
	}
	
	public abstract void printInfo();
}




