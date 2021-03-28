package exercise;

public class Purse {

	//main method
	public static void main(String[] args) {
		System.out.println("Purse");
		System.out.println("");
		
	   //class1
	   man x = new man();
	   System.out.println("Type of purse for " + x.type);
	   x.material();
	   x.brand();
	   System.out.println("");
	   
	   //class2
	   woman y = new woman();
	   System.out.println("Type of purse for " + y.type);
	   y.material();
	   y.brand();
	}

}
