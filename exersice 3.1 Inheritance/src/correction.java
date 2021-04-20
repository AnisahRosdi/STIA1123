import java.util.Scanner;

public class correction {
	private String brand;
	private int length;
	
	//constructor
	Scanner input = new Scanner(System.in);
	
	//input
	//correction a = new correction
	correction(){
		System.out.print("Enter brand of correction: ");
		this.brand=input.nextLine();
		
		System.out.print("Enter length of correction(m): ");
		this.length=input.nextInt();
		
	}
	
	//getter method
	public String getBrand() {
		return this.brand;
	}
	
	public int getLength() {
		return this.length;
	}
	
}


