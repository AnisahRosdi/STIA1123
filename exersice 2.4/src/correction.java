
public class correction {
	String brand;
	int amount;
	double price,meter;
	
	//setter method
	public void setbrand(String brand) {
		this.brand = brand;
	}
	
	public void setamount(int amount) {
		this.amount = amount;
	}
	
	public void setprice(double price) {
		this.price = price;
	} 
	
	public void setmeter(double meter) {
		this.meter =meter;
	}
	
	//create Getter method
		public String getbrand() {
			return this.brand;
		}
		
		public int getamount() {
			return this.amount;
		}
		
		public double getprice() {
			return this.price;
		}
		
		public double getmeter() {
			return this.meter;
		}
		
		//create a fullThrottle() method
		public void fullthrottle() {
			System.out.println("The correction tape can correct your typing mistake!");
		}
		
}
