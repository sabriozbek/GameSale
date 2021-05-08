
public class GamerManager implements GamerService{

	@Override
	public void add(Gamer gamer) {
System.out.println(gamer.getFirstName()+" "+gamer.getLastName()+" oyuncu eklendi.");		
	}

	@Override
	public void delete(Gamer gamer) {
		System.out.println(gamer.getFirstName()+" "+gamer.getLastName()+" oyuncu silindi.");		
		
	}

	@Override
	public void update(Gamer gamer) {
		System.out.println(gamer.getFirstName()+" "+gamer.getLastName()+" oyuncu bilgisi güncellendi.");		
		
	}
	
	

}
