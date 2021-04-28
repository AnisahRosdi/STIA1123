
public class Apple extends Fruit {
	
	double type = 7500;
	
	public Apple(String name,double price) {
		super(name, price);

		System.out.println("Apple constructor is invoked");
		System.out.println("Price per kilo :RM" + price);
		System.out.println("Fun facts there is " + type + " varieties of apple");
		}

}
