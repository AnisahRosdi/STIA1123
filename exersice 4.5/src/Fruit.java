
import java.util.Scanner;

public abstract class Fruit {
	
	Scanner input = new Scanner(System.in);
	
    protected String name;
	
	public Fruit(String name) {	
		this.name=name;
		
			System.out.println("Fruit constructor is invoked");
			System.out.println(this.name + " is constructed");
	}

}

