package exersice2;

public class main {

	public static void main(String[] args) {
		
		//create first new object
		purse man = new purse();
		man.printpurse("man","Top Grain Calf Leather", "Bonia",150.5);
		man.calculateprice(150.5,2);
		man.discount(0.15);
		man.totalpayment(7);
		System.out.println();
		
		//create second new object purse
		purse woman = new purse();
		woman.printpurse("woman","Premium Synthetic Leather","Kita Mini",100.5);
		woman.calculateprice(100.5,3);
		woman.discount(0.3);
		woman.totalpayment(4);
		System.out.println();
		
	}

}
