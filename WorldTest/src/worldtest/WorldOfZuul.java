package worldtest;

import SDUVejviser.RoomNotFoundException;
import java.io.FileNotFoundException;

/**
 *
 * @author timch15
 */
public class WorldOfZuul {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            Game game = new Game();
            game.play();
        } catch (RoomNotFoundException e) {
            System.out.println(e);
        }
        
    }
    
}
    
}
