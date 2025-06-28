package Board;
import java.util.*;

public class Board {
    int size;
    ArrayList<ArrayList<Cell>> matrix = new ArrayList<>();
   


    public Board(int size){
        this.size = size;
        

        // ArrayList<Cell> columns = (ArrayList<Cell>) Collections.nCopies(size,new Cell());
        // matrix = (ArrayList<ArrayList<Cell>>) Collections.nCopies(size,columns);

    
    
    }

    public void mark(int x, int y, Cell cell){
       
    }
}
