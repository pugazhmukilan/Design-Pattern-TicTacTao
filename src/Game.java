import java.util.ArrayList;

import Board.Board;
import GameUtils.GameStatus;
import PlayersFiles.Player;
//HERE WE ARE USING THE BUIDER CLASS PATTER FOR CREATING A GAME
public class Game {
    private Board board;
    private ArrayList<Player> players = new ArrayList<>();
    private GameStatus status;

    private Game(GameBuilder builder) {
        this.board = builder.board;
        this.players = builder.players;
        this.status = builder.status;
    }

    static class GameBuilder{
        private Board board;
        private ArrayList<Player> players = new ArrayList<>();
        private GameStatus status;

        public  GameBuilder(){

        }

        public GameBuilder setBoard(Board board) {
            this.board = board;
            return this;
        }

        public GameBuilder addPlayer(Player player) {
            this.players.add(player);
            return this;
        }

        public GameBuilder setStatus(GameStatus status) {
            this.status = status;
            return this;
        }

        public Game build() throws Exception {
            if(players.size()< 2) throw new Exception("Cant start game without atleast 2 players");

            Game game = new Game(this);
            System.out.println("GAME builded");
            return game;
        }
    }


    public void startGame(){
        System.out.println("Starting the game");
        while(this.status ==GameStatus.IN_PROGRESS){

        
            //make a player to mark
        play(players.get(0));
        play(players.get(1));
        //check for the win or draw
        //make the other player to mark and other player to mark


        status = GameStatus.ENDED;

        
    }
    }

    public void play(Player p){
        p.play();
    }

}
