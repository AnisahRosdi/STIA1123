

public class RedApple extends Fruit{
	
	private double discount;
	
	public RedApple() {
		super();
		this.discount=0;

	}
	
	public RedApple(String N,double P,double D) {
		super(N,P);
		discount = D;
		
		setType(N,P,D);
	}
	public void setType(String N,double P,double D) {
		if( D >= 0)
			discount = D;
		else
			discount=0;
		
		if (N =="Apple")
			name="Red Apple";
		else
			name="a";
	}
	
	public double getDiscount() {
		return discount;
	}
	
	//overriding
	public double Total() {
		return kilo*price;
	}
	
	public double getDiscount1() {
		return kilo*price*discount;
	}
	
	public String toString() {
		return ("Type of Fruit :"+ name +"\nPrice per kilo:RM" + price +"\nWeight :" + kilo + "kg" + "\nTotal :RM" + Total() + "\nTotal Payment:RM" + getDiscount1());
	}

}
