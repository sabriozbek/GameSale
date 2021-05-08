
public class GameManager implements GameService{

	@Override
	public void add(Game game) {
System.out.println(game.getGameName()+" baþarýyla eklendi.");		
	}

	@Override
	public void delete(Game game) {
System.out.println(game.getGameName()+ " baþarýyla silindi.");		
	}

	@Override
	public void update(Game game) {
System.out.println(game.getGameName()+" baþarýyla güncellendi.");		
	}

}
