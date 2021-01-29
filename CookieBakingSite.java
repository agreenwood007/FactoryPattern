import java.util.Scanner;


public class CookieBakingSite {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CookieFactory theFactory = new CookieFactory();
		
		CookieStore theCookie = null;
		
		Scanner userInput = new Scanner(System.in);
		
		System.out.println("What would you like to order? Chocolate Chip Cookie, Snickers Cookie, or Peanut Butter Cookie");
		
		if (userInput.hasNextLine()) {
			String typeOfCookie = userInput.nextLine();
			theCookie = theFactory.makeCookieStore(typeOfCookie);
			if (theCookie != null) {
				makeCookie(theCookie);
				
			} else System.out.print("Please make a different purchase");
		}
	
	}

	private static void makeCookie(CookieStore theCookie) {
		// TODO Auto-generated method stub
		theCookie.orderCookie();
		theCookie.cookiePrice();
	}
	
}


