
public class main {

	public static void main(String[] args) {
		
		Fruit a = new Fruit();
		Fruit b = new Fruit("Apple",7.0);
		System.out.println("");
		System.out.println("Fruit\n" + b);
		System.out.println("");
		
		RedApple c = new RedApple("Apple",8.0,0.9);
		System.out.println("");
		System.out.println("Apple\n" + c);
	}

}
