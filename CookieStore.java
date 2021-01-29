public abstract class CookieStore {
	
	private String name;
	private double amtPrice;
	
	
	public String getName() {return name; }
	
	
	public void setName(String newName) { name = newName;}
	
	public double getPrice() {return amtPrice;}
	public void setPrice(double newPrice) { amtPrice = newPrice; } 
	
	
	public void orderCookie() {
		System.out.println(getName() + " is packaged!");
	}
	
	public void cookiePrice() {
		System.out.println(getName() + " is $" + getPrice());
	
	}
}
