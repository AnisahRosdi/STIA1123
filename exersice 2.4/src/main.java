
public class main {

	public static void main(String[] args) {
		correction a = new correction();
		
		a.setbrand("Faber Castell");
		a.setamount(2);
		a.setprice(2.30);
		a.setmeter(1.5);
		
		System.out.println("Brand of correction tape is " + a.getbrand());
		System.out.println("The amount you get is " + a.getamount());
		System.out.printf("Price of correction tape is RM" + "%.2f\n",a.getprice());
		System.out.println("Length of correction tape is " + a.getmeter() + " meter");
		a.fullthrottle();
	}

}
