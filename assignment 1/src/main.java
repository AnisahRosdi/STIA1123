
import java.util.*; //1.2 Pre-defined class

public class main {


	public static void main(String[] args) {
		
	Scanner input = new Scanner(System.in);
		
	rentalCar sr = new rentalCar();
	
		int choice =0;
		int user = 0;
		
		user = input.nextInt();
		
		if (user == 1) {
			
			
			advertisement a = new advertisement(8582088);
			System.out.println("--------------------Fulfill the Customers Infomation----------------------");
			customer c = new customer();
			carDetail p = new carDetail();

	}
		else if (user == 2) {
			
			System.out.println("--------------Welcome Admin-----------------"
					+ "\n 1. Employee information"
					+ "\n 2. Finance");
			
			choice = input.nextInt();
			switch (choice) {
			
			case 1:
				employee e = new employee();
				break;
			case 2:
				finance f = new finance(2500000, 1700000);
				f.calcProfit();
				f.financeRecord();
			}
		}
	}
}
