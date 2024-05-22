import  java.math.*;

import static java.lang.Math.*;

public class Model extends Thread{ //this is the logic of the game
int jumpcount = 28;
    public int jumpCalc(int ground) throws InterruptedException {
        //var is the variable that is scraped from the frame rate and ground is the constant variable that determines the ground height
        System.out.println("function ran");
        while (View.jump) {
            try {
                if (jumpcount == 0) {
                    jumpcount = 28;
                    View.jump=false;
                }
                Thread.sleep(10);

                int funcvar = (int) ((-1) *Math.pow((14-jumpcount), 2) + (ground));
                //\ -1\left(14-x\right)^{2}+200

                jumpcount--;

                return funcvar;


            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
        return ground;
    }
}