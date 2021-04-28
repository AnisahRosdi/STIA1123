
public class Jackfruit extends Fruit {
	
	String area="Souteast Asian";
	
	public Jackfruit(String name,double price) {
		super(name,price);
	
		System.out.println("Jackfruit constructor is invoked");
		System.out.println("Price per kilo :RM" + price);
		System.out.println("This fruit mostly found in " + area );
	}

}
