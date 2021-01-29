
public class CookieFactory {
	
	public CookieStore makeCookieStore(String newCookieType) {
		
		CookieStore newCookie = null;
		
		if (newCookieType.equals("Chocolate Chip Cookie")) {
			return new ChocChipCookie();
	
		} else 
			if (newCookieType.equals("Snickers Cookie")) {
				return new SnickersCookie();
			
		} else 
			if (newCookieType.equals("Peanut Butter Cookie")) {
				return new PeanutButter();
	
			} else return null;
		
	}
}
