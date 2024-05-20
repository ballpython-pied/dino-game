import javax.swing.*;
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