
public class main {

	public static void main(String[] args) {
		correction a = new correction();
		calculate b = new calculate();
		
		System.out.println("\n----------"+ a.getBrand()+ "----------");
		System.out.println("\nLength of correction is "+ a.getLength());
		System.out.printf("Price is RM" + "%.2f",b.getPrice());
		System.out.println("\nAmount of correction is " + b.getAmount());
		System.out.printf("Total Price is RM" + "%.2f",b.getTotalPrice());
		
		System.out.println("");
		
	}

}
