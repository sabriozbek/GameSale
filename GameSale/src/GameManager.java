
public class GameManager implements GameService{

	@Override
	public void add(Game game) {
System.out.println(game.getGameName()+" başarıyla eklendi.");		
	}

	@Override
	public void delete(Game game) {
System.out.println(game.getGameName()+ " başarıyla silindi.");		
	}

	@Override
	public void update(Game game) {
System.out.println(game.getGameName()+" başarıyla güncellendi.");		
	}

}
