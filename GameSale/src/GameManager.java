
public class GameManager implements GameService{

	@Override
	public void add(Game game) {
System.out.println(game.getGameName()+" ba�ar�yla eklendi.");		
	}

	@Override
	public void delete(Game game) {
System.out.println(game.getGameName()+ " ba�ar�yla silindi.");		
	}

	@Override
	public void update(Game game) {
System.out.println(game.getGameName()+" ba�ar�yla g�ncellendi.");		
	}

}
