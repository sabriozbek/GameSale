import java.sql.Date;
import java.text.DateFormat;

import org.w3c.dom.css.Counter;

public class Main {

	public static void main(String[] args) {
		Gamer gamer=new Gamer();
		gamer.setFirstName("Sabri");
		gamer.setLastName("Özbek");
		gamer.setId(1);
		gamer.setNationalId("123456789");
		gamer.setNickName("sabirya");
		
		Game game=new Game();
		game.setGameName("Counter Strike");
		game.setGameCategory("Action");
		game.setGamePrice(100);
		game.setId(1);
		
		Campaign campaign=new Campaign();
		campaign.setName("Kara Cuma");
		campaign.setDiscount(20);
		campaign.setId(1);
		
		VerificationUtil.Verification(gamer);
		
		GameSaleManager gManager= new GameSaleManager();
		gManager.sale(gamer, game, campaign);
		
		
		

	}

}
