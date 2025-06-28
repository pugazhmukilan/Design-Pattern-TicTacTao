package PlayersFiles;
public class HumanPlayer extends Player {
    int id;

    public HumanPlayer(int i){
        this.id  = i;
    }
    @Override
    public void play() {
        System.out.println("Player "+ id +" is playing");
    }

    void setDifficulty(){
        System.out.println("setting some difficulty");
    }


}
