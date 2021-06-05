
public abstract class employee extends rentalCar{ //1.3 User-defined class

	employee (){ // 1.4 Constructor with one arguments
		
		System.out.println("\nEmployee list: \n");
		System.out.println("Name:" + "\t\t\t\t" + "\t\t\tContact number:");
		
		String []employee = {"Ali \t\t(Manager)"
				, "Abu \t\t(Cashier)", 
				"Amin \t\t(Stock manager)", 
				"Aminah \t\t(Mechanic)\t"};
		
		int []phone = {8582231, 8593321, 8592211, 8582291, 8580999};
		for(int x = 0; x<employee.length; x++) {
			System.out.println(employee[x] + "\t\t\t" + phone[x]);
		}
	}
}

