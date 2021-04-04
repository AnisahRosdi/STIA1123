package exersice2;

public class purse {
	String material;
	String brand;
	String gender;
	double price,discount,calculateprice1,calculateprice2,total;
	int value,delivery;
	
	
	//1st method print
	void printpurse(String g,String m,String b,double p) {
		System.out.println("Purse for " + g);
		System.out.println("Material of purse:" + m);
		System.out.println("Brand of purse:" + b);
		System.out.println("Price for purse is RM" + p);
	}
	
	//2nd method calculate price
	void calculateprice(double p,int v) {
		calculateprice1= p * v;
		System.out.println("Number of Item: " + v);
		System.out.println("Total price is RM" + calculateprice1);
	}
	
	//3rd method calculate discount
	void discount(double d) {
		calculateprice2= d * calculateprice1;
		System.out.println("Discount is " + d + "%");
		System.out.println("Price after discount is RM" + calculateprice2);
	}
	
	//4th method totalpayment
	void totalpayment(int d) {
		total= d + calculateprice2;
		System.out.println("Delivery charge is RM" + d);
		System.out.println("Total payment : RM" + total);
	}
}
