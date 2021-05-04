

public class Grape extends Fruit{
	
	private int number;											
	private double discount, price, kilo, payment;
	
	Grape(String name, double price, double kilo){		
		super(name);											
		this.price = price;
		this.kilo = kilo;
		
		System.out.println("The price per kg of grape is RM" + this.price);
		System.out.println("The weight of each grape is = " + this.kilo + "kg");
		System.out.print("The number of grape you want to buy is :");
		this.number = input.nextInt();
		System.out.println("The total weight of grape you bought is " + this.number*this.kilo + "kg");
		determinePriceFormula();
	}
	
	public void  determinePriceFormula() {						
		if (this.number*this.kilo < 10 ) {
			payment = CalculatePrice();
		}
		else if (this.number*this.kilo > 10  && this.number*this.kilo < 100) {
			discount = 0.90;
			System.out.println("You have 10% discount");
			payment = CalculatePrice(discount);
		}
		else {
			discount = 0.85;
			kilo = 150;
			System.out.println("You have 15% discount and the price is always calculated using 100kg of grape");
			payment = CalculatePrice(discount, kilo);
		}
	}
	
	public double CalculatePrice() {									
		return this.number * this.kilo * this.price;
	}
	
	public double CalculatePrice(double discountrate) {						
		return this.number * this.kilo * this.price * discountrate;
	}
	
	public double CalculatePrice(double discountrate, double kilo) {	
		return kilo * this.price * discountrate;
	}
	
	public String toString() {
		return ("Total Price = RM" + payment);
	}

}

