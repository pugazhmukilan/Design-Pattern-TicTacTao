import Board.Board;
import Board.Cell;
import GameUtils.GameStatus;
import PlayersFiles.BotPlayer;
import PlayersFiles.HumanPlayer;
import PlayersFiles.BotDifficulty.Easy;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        Game.GameBuilder newgame = new Game.GameBuilder();
        newgame.setBoard(new Board(3));
        newgame.addPlayer(new HumanPlayer( 1));
        BotPlayer botplayer = new BotPlayer();
        botplayer.setDifficulty(new Easy());
        newgame.addPlayer(botplayer);
        newgame.setStatus(GameStatus.IN_PROGRESS);
        Game mainGame = newgame.build();

        mainGame.startGame();




        


    }
}
