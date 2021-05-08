
public class PriceUtil {
	
	public static double priceWithDiscount(Game game,Campaign campaign) {
		double price=game.getGamePrice()-game.getGamePrice()*campaign.getDiscount()/100;
		return price;
		
	}

}
