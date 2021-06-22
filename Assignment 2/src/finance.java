
import java.util.*;
public class finance extends rentalCar { // 2.1 extends from CompanyInfo 
	                                                         // 2.5 Implements 

		Scanner input = new Scanner(System.in);
		
		private double totalSales;
		private double totalSpend;
		private double profit;
		private String month;
		
		
		finance() { // 1.4 Constructor with no arguments
			System.out.println("/t/t/tFinance");
			
			System.out.print("Enter financial month: ");	
			this.month = input.nextLine();
			
			System.out.print("Enter total sales\t\t:RM");
			this.totalSales = input.nextDouble();
			System.out.print("Enter total expenses\t\t:RM");
			this.totalSpend = input.nextDouble();
			
		
		}
		public double getPayment() {
			return profit = this.totalSales - this.totalSpend;
		}
	
		public void printInfo() { // 2.2 Polymorphism
			System.out.println("----------Financial Statement----------"
					+ "\nMonth\t\t\t:" + "(" + this.month + ")"
					+ "\nTotal Sales \t\t:RM" + this.totalSales
					+ "\nTotal Expenses \t\t:RM" + this.totalSpend
					+ "\nProfit \t\t\t:RM" + profit);
		}
		
}