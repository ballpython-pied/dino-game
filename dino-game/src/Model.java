import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import  java.math.*;

import static java.lang.Math.*;

public class Model extends Thread{ //this is the logic of the game
int jumpcount = 28;
    public void jumpCalc(View view) throws InterruptedException {
        //var is the variable that is scraped from the frame rate and ground is the constant variable that determines the ground height
            System.out.println("function ran");

        Timer timer = new Timer(250, new ActionListener() {
            //https://stackoverflow.com/questions/30419775/not-sure-how-to-put-timer-into-my-keylistener-code
            @Override
            public void actionPerformed(ActionEvent e) {
                while (jumpcount != 0) {
                    int funcvar = (int) ((-1) * Math.pow((14 - jumpcount), 2) + (400));
                    System.out.println(funcvar + " count: " + jumpcount);
                    //\ -1\left(14-x\right)^{2}+200
                    view.dino.setLocation(60, funcvar);
                    view.repaint();
                    view.revalidate();
                    jumpcount--;


                }

            }
        });

        if (jumpcount == 0 && view.jump) {
            timer.restart();
            jumpcount = 28;
            view.jump = false;
        }
        timer.setInitialDelay(10);
        timer.start();




    }
}
