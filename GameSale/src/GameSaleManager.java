
public class GameSaleManager implements GameSaleService {

	@Override
	public void sale(Gamer gamer, Game game, Campaign campaign) {
System.out.println(gamer.getNickName()+" adlý oyuncu "
	+game.getGameName()+" oyununu %"+campaign.getDiscount()+" indirim ile "+PriceUtil.priceWithDiscount(game, campaign)+" TL'ye satýn almýþtýr.");		
	}

}
