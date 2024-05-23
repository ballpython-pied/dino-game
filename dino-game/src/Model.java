import  java.math.*;

import static java.lang.Math.*;

public class Model extends Thread{ //this is the logic of the game
int jumpcount = 28;
    public void jumpCalc(View view) throws InterruptedException {
        //var is the variable that is scraped from the frame rate and ground is the constant variable that determines the ground height
        System.out.println("function ran");

            if (jumpcount == 0 && view.jump) {
                jumpcount = 28;
                view.jump = false;
            }

            try {
                while(jumpcount != 0) {
                    int funcvar = (int) ((-1) * Math.pow((14 - jumpcount), 2) + (400));
                    Thread.sleep(100);
                    System.out.println(funcvar + " count: " + jumpcount);
                    //\ -1\left(14-x\right)^{2}+200
                    view.dino.setLocation(60, funcvar);
                    view.repaint();
                    view.revalidate();
                    jumpcount--;



                }

            } catch (InterruptedException e) {
                e.printStackTrace();
            }


    }
}
