package LowLevelDesign.TicTacToe;

public class TicTacToeDemo {

    public static void main(String[] args) {
    
        Player player1 = new Player("player1", 'X');
        Player player2 = new Player("player2", 'O');

        Game game = new Game(player1 , player2);
        game.startGame();
    }
    
}
