
public class GamerVerificationManager implements GamerVerificationService{

	@Override
	public boolean authentication(Gamer gamer) {
		
		if (gamer.getNationalId()=="123456789" && gamer.getFirstName()=="Sabri"&&gamer.getLastName()=="�zbek") {
			
			
			return true;

			
		}
		else {
			return false;

		}
		
		
	}

}
