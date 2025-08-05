package tic_tac_toe;

public class GameDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Player player1 = new Player("Pranav",'X');
		Player player2 = new Player("Robert",'O');
		
		Game game = new Game(player1,player2);
		game.play();

	}

}
