import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Control {
    //this class contains the listeners that record user input (such as key presses)
    private Model gameModel = new Model();
    private View gameview = new View();

    public void gameController(Model gameModel, View gameview){
        this.gameModel = gameModel;
        this.gameview = gameview;
        this.gameview.addPlayListener(new playListenerClass());
    }
    class playListenerClass implements ActionListener{ //java wants a new class for some reason

        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println("pressed");
        }
    }
}

