import java.util.Scanner;

public class correction {
	String brand;
	int amount;
	double price;
	
	//constructor
	Scanner input = new Scanner(System.in);
	
	//input
	//correction a = new correction
	correction(){
		System.out.print("Enter brand of correction: ");
		this.brand=input.nextLine();
		
		System.out.print("Enter amount of item: ");
		this.amount=input.nextInt();
		
		System.out.print("Enter price: RM");
		this.price=input.nextDouble();
	}
	
	correction(String b,int a,double p){
		this.brand=b;
		this.amount=a;
		this.price=p;
	}
		
}
