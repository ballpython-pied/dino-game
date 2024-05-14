import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Control {
    //this class contains the listeners that record user input (such as key presses)
    private Main gameModel;
    private View gameview;

    public void gameController(Main gameModel, View gameview){
        this.gameModel = gameModel;
        this.gameview = gameview;

        this.gameview.addPlayListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
    }
}
