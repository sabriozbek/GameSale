
public class GameSaleManager implements GameSaleService {

	@Override
	public void sale(Gamer gamer, Game game, Campaign campaign) {
System.out.println(gamer.getNickName()+" adl� oyuncu "
	+game.getGameName()+" oyununu %"+campaign.getDiscount()+" indirim ile "+PriceUtil.priceWithDiscount(game, campaign)+" TL'ye sat�n alm��t�r.");		
	}

}
