
public class Apple extends Fruit {
	
	public Apple(String name,double price) {
		super(name, price);

		System.out.println("Apple constructor is invoked");
		System.out.println("Price per kilo :RM" + price);
		}

}
