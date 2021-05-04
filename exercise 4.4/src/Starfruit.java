public class Starfruit extends Fruit {
	
	private int kilo;											
	private double discount, price, payment;

	Starfruit(String name, double price){			
		super(name);
		
		this.price = price;
		
		System.out.println("price of starfruit per kilo is RM" + this.price);
		System.out.print("How many kilo you want to buy is(kg) :");
		this.kilo = input.nextInt();
		determinePriceFormula();
	}
	
	public void determinePriceFormula() {						
		if (this.kilo < 10 ) {
			payment = CalculatePrice();
		}
		else if (this.kilo > 10  && this.kilo < 100) {
			discount = 0.85;
			System.out.println("You have 15% discount");
			payment = CalculatePrice(discount);
		}
		else {
			discount= 0.80;
			kilo = 100;
			System.out.println("You have 20% discount and extra 2 kg");
			payment = CalculatePrice(discount, kilo);
		}
	}
	
	public double CalculatePrice() {											
		return this.kilo * this.price;
	}
	
	public double CalculatePrice(double discount) {							
		return this.kilo * this.price * discount;
	}
	
	public double CalculatePrice(double discount, double kilo) {			
		return kilo * this.price * discount;
	}
	
	public String toString() {
		return ("Total Price = RM" + payment);
	}
}

