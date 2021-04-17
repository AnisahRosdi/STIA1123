
public class main {

	public static void main(String[] args) {
		correction a = new correction();
		System.out.println("\nBrand Amount Price: " + a.brand + " " + a.amount + " " + a.price);
		
		//parameter
		correction b =new correction("Faber Catell",1,3.50);
		System.out.println("");
		System.out.print("Brand Amaount Price:" + b.brand+" "+ b.amount+" "+ b.price);

	}

}
