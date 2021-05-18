

public class Apple extends Fruit {
	
	protected int kilo,extra;
	protected double price,payment,discount;

	Apple(String name, double price){						
		super(name);	
		this.price = price;
		
		System.out.println("Apple price per kilo is RM" + this.price);
		System.out.print("How many kilo you want to buy :");
		this.kilo = input.nextInt();
		Calculation();
	}
	
	public void Calculation() {
		if(kilo <= 5) {
			System.out.println("You got no Discount");
			payment=CalculatePrice();
		}
		else if(kilo >= 6 && kilo <= 10 ) {
				discount=0.8;
				System.out.println("You got 20% Discount");
				payment = CalculatePrice(discount);
		}
				else if(kilo >= 11) {
						discount=0.5;
		                extra=2;
		                System.out.println("You got 50% discount and extra 2 kilo");
		                payment = CalculatePrice(discount,extra);
				}
	}
	
	public double CalculatePrice(){
		return this.kilo*this.price;
	}
	
	public double CalculatePrice(double discount) {
		return this.kilo*this.price*discount;
	}
	
	public double CalculatePrice(double discount,int extra) {
		return this.kilo*(this.price*extra)*discount;
	}
	
	public String toString() {
		return ("Total Price = RM" + payment);
	}
}

