package PlayersFiles;

import PlayersFiles.BotDifficulty.Difficulty;

public class BotPlayer extends Player {
    int id;
    Difficulty difficulty;

    @Override
    public void play(){
        System.out.println("playing with some difficulty");
        difficulty.diffplay();
        System.out.println("Bot is Playing");
    }


    public void setDifficulty(Difficulty diff){
        difficulty = diff;
        System.out.println("Difficulty set !!!!");
    }


   





}
