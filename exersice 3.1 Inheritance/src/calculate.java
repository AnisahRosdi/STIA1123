import java.util.Scanner;

public class calculate extends correction {
	
	Scanner input = new Scanner(System.in);
	private double price,totalprice;
	private double amount;
	
	//correction a = new correction
	calculate(){
		
		System.out.print("Enter price of correction:RM ");
		this.price = input.nextDouble();
		
		System.out.print("Enter amount of correction: ");
		this.amount = input.nextInt();
		
		//calculate payment
	    this.totalprice = this.price * this.amount; 
	}//end correction a
	
	//getter method 
	public double getPrice() {
		return this.price;
	}
	
	public double getAmount() {
		return this.amount;
	}
	
	public double getTotalPrice() {
		return this.totalprice;
	}
}
