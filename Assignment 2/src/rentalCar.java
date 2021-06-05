
public abstract class rentalCar { //1.3 User-defined class
	
	private String name,address,email,contact;
	
	rentalCar(){ // 1.4 Constructor with one arguments
		
		setname("AAA Car Rental Company");
		setaddress("AAA Car Rental store,Bagan Serai,Perak");
		setcontact("0123456789");
		setemail("aaacarrental@gmail.com");
	}
	
	//setter method
	public void setname(String name) {
		this.name=name;
	}
	public void setcontact(String contact) {
		this.contact=contact;
	}
	public void setaddress(String address) {
		this.address=address;
	}
	public void setemail(String email) {
		this.email=email;
	}
	
	//getter method
	public String getname() {
		return name;
	}
	public String getcontact() {
		return contact;
	}
	public String getaddress() {
		return address;
	}
	public String getemail() {
		return email;
	}
	
	public abstract void printInfo();
	
}