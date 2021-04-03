package exersice2;

public class main {

	public static void main(String[] args) {
		
		purse man = new purse();
		man.material="Top Grain Calf Leather";
		man.brand="Bonia";
		System.out.println("Man Purse\n" + "Material:" +man.material +"\n"  + "Brand:" +man.brand );
		
		purse woman = new purse();
		woman.material="Premium Synthetic Leather";
		woman.brand="Kita mini";
		System.out.println("\nWoman Purse\n" + "Material:" +woman.material +"\n"  + "Brand:" +woman.brand );
		
	}

}
