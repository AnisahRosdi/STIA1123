
public class main {

	public static void main(String[] args) {
		Apple a = new Apple("Apple", 8.0);
		System.out.println(a);
		System.out.println();
		
		RedApple b = new RedApple("Red US Apple", 0.7, "Red");
		System.out.println(b);
		System.out.println();

		Starfruit c = new Starfruit("Starfruit", 2);
		System.out.println(c);
		System.out.println();
		
		Grape d = new Grape("Grape", 2.0, 0.5);
		System.out.println(d);
		System.out.println();
	}

}
