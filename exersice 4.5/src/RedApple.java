

public class RedApple extends Apple{						
	private String color;
	
	RedApple(String name, double price, String color){			
		super (name, price);												
		this.color = color;
	}
	
	public String toString() {
		return ("Total price = RM" + payment + "\n" + this.name + " color is " + this.color + "\n" + this.name );
	}
}

