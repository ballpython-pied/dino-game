import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

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

    JLabel[] treadmillBlocks = new JLabel[18];

    Color[] colors = new Color[3];

    public void treadmill(JLabel[] treadmillBlocks){
        colors[0] = Color.GREEN;
        colors[1] = Color.LIGHT_GRAY;
        colors[2] = Color.DARK_GRAY;
        Random r = new Random();
        for (JLabel treadmillBlock : treadmillBlocks) {
            treadmillBlock.setBounds(200, 300, 100, 100);
            treadmillBlock.setBackground(colors[r.nextInt(2)]);
        }
        JLabel first = treadmillBlocks[0];
        for (int i=1; i<treadmillBlocks.length; i++){
            treadmillBlocks[i-1] = treadmillBlocks[i];
        }
        treadmillBlocks[treadmillBlocks.length-1] = first;
    }
}

