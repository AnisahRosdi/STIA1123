
public class GreenApple extends Apple {
	
	String colour = "Green";
	
	public GreenApple(String name,double price) {
		super(name,price);

		System.out.println("Green Apple constructor is invoked");
		System.out.println("Price per kilo :RM" + price);
		System.out.println("Colour of apple is " + colour);
		}

}
