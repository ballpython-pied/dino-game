import javax.swing.*;
<<<<<<< HEAD
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
        for (int x=0; x<treadmillBlocks.length; x++) {
            treadmillBlocks[x].setBounds(200, 300, 100, 100);
            treadmillBlocks[x].setBackground(colors[r.nextInt(2)]);
        }
        JLabel first = treadmillBlocks[0];
        for (int i=1; i<treadmillBlocks.length; i++){
                treadmillBlocks[i-1] = treadmillBlocks[i];
        }
        treadmillBlocks[treadmillBlocks.length-1] = first;
        return first;
    }
}



=======
public class guiLogic {

    JLabel[] treadmillBlocks = new JLabel[25];
    int[] testBlocks = new int[9];


    public JLabel treadmill(JLabel[] t){
        JLabel first = t[0];
        for (int i=1; i<t.length; i++){
                t[i-1] = t[i];
        }
        t[t.length-1] = first;
        return first;
    }

    public int treadmillTest(int[] testBlocks){
        int x = 0;
        while (x<10){
            testBlocks[x] = x;
            x++;
        }
        int first = testBlocks[0];
        for (int i=0; i<testBlocks.length; i++){
            testBlocks[i-1] = testBlocks[i];
        }
        testBlocks[testBlocks.length-1] = first;
        return x;
    }



}
>>>>>>> origin/branch-3
