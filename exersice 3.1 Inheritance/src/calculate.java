
public class calculate extends correction {
	private double totalpayment;

	calculate(int price,int amount){
		super.getPrice();
		super.getAmount();
		
		this.totalpayment = this.getAmount()*this.getPrice();
	}

	//method getter
	public double getTotalPayment() {
		return this.totalpayment;
	}
}
