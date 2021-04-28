
public class Durian extends Fruit {
	
	String known = "King of Fruit";
	
	public Durian(String name,double price) {
		super(name,price);
		
		
		System.out.println("Durian constructor is invoked");
		System.out.println("Price per kilo :RM" + price);
		System.out.println("Durian is known as " + known);
		
	}

}
