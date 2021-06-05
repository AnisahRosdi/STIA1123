
import java.util.Scanner;
public abstract class finance extends rentalCar{ //1.3 User-defined class

		Scanner input = new Scanner(System.in);
		
		double small;
		double MPV;
		double profit;
		
		finance(double smallCar, double MPVCar) { // 1.4 Constructor with 2 arguments
			
			small = smallCar;
			MPV = MPVCar;
			
		System.out.println("Enter car that been rent and day:-" + "\nSmall Car :" + smallCar+"(2)" + "\nMPV Car :" + MPVCar+"(1)" );
		}
		public double calcProfit() {
			double paysmallcar= 2 *50;
			double payMPV = 1*80;
			return profit = paysmallcar + payMPV;
		}
}
