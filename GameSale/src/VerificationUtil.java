
public class VerificationUtil {
	public static void Verification(Gamer gamer) {
		GamerVerificationManager vM=new GamerVerificationManager();
		if (vM.authentication(gamer)==true) {
			System.out.println(gamer.getNickName()+" adl� oyuncunun kimlik bilgileri ba�ar�yla do�ruland�.");
			
		}
		else {
			System.out.println(gamer.getNickName()+" adl� oyuncunun kimlik bilgileri do�rulanamad�.");

		}
		
	}

}
