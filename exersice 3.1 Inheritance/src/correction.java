import java.util.Scanner;

public class correction {
	private String brand;
	private int length,price,amount;
	
	//constructor
	Scanner input = new Scanner(System.in);
	
	//input
	//correction a = new correction
	correction(){
		System.out.print("Enter brand of correction: ");
		this.brand=input.nextLine();
		
		System.out.print("Enter length of correction(m): ");
		this.length=input.nextInt();
		
		System.out.print("Enter price (RM): ");
		this.price=input.nextInt();
		
		System.out.print("Enter amount of correction: ");
		this.amount=input.nextInt();
	}
	
	//getter method
	public String getBrand() {
		return this.brand;
	}
	
	public int getLength() {
		return this.length;
	}
	
	public int getPrice() {
		return this.price;
	}
	
	public int getAmount() {
		return this.amount;
	}
	
}


