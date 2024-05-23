import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class guiLogic {

    JLabel[] treadmillBlocks = new JLabel[18];

    Color[] colors = new Color[3];

    public JLabel treadmill(JLabel[] treadmillBlocks){
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
        return first;
    }
}