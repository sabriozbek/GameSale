
public class VerificationUtil {
	public static void Verification(Gamer gamer) {
		GamerVerificationManager vM=new GamerVerificationManager();
		if (vM.authentication(gamer)==true) {
			System.out.println(gamer.getNickName()+" adlý oyuncunun kimlik bilgileri baþarýyla doðrulandý.");
			
		}
		else {
			System.out.println(gamer.getNickName()+" adlý oyuncunun kimlik bilgileri doðrulanamadý.");

		}
		
	}

}
