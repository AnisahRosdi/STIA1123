
public class main {

	public static void main(String[] args) {
		correction a = new correction();
		calculate b = new calculate(0, 0);
		
		System.out.println("\n------------"+ a.getBrand()+ "------------");
		System.out.println("Length of correction is "+ a.getLength());
		System.out.println("Price of one correcion is " + a.getPrice());
		System.out.println("Amount of correction is " + a.getAmount());
		System.out.println("Total payment is RM" + b.getTotalPayment());
	}

}
