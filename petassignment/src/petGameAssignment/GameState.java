package petGameAssignment;

public class GameState {
private static GameEnviornment game = new GameEnviornment();

	public static void main(String[] args){
		// Initial setup
		game.createPets();
		game.createFood();
		game.createToys();		
		game.setNumberOfPlayers();
		game.setNumberOfDays();
		
		// player setup
		game.setUpPlayers();
		game.playGame();		
	}









}
