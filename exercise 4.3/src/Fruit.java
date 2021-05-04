import java.util.Scanner;

public class Fruit {
	
	Scanner input = new Scanner(System.in);
	
		protected String name;
		protected double price;
		protected int kilo;
		
	public Fruit() {
		 
		 this.name = "a"; 
	     this.price = 0;
	     System.out.println("Type of Fruit is " + this.name);
	     System.out.println("Price per kilo :RM" + this.price);
	     
	}
	
	public Fruit(String N,double P) {
		 System.out.print("How many kilo:");
	     this.kilo=input.nextInt();
		setType(N,P);
	}
	
	public void setType(String N,double P) {
		if (N == "Apple")
			name = "Apple";
		else 
			name="wrong";
		
		if (P >= 0)
			price = P;
		else
			price = 0;
	}
	
	//getter method
	public String getName(){
	    return name;
	}

	public double getPrice(){
	    return price;
	}
	
	public int getKilo() {
		return kilo;
	}//end getter method

    //overriding
	public double Total() {
		return kilo*price;
	}
	
	public String toString() {
		return ("Type of Fruit :"+ name +"\nPrice per kilo:RM" + price +"\nWeight :" + kilo + "kg" + "\nTotal Payment :RM" + Total());
	}//end overriding

}
