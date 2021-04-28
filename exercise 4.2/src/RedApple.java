
public class RedApple extends Apple {
	
	String colour = "Red";
	
	public RedApple(String name,double price) {
		super(name,price);

		System.out.println("Red Apple constructor is invoked");
		System.out.println("Price per kilo :RM" + price);
		System.out.println("Colour of apple is " + colour );
		}

}
