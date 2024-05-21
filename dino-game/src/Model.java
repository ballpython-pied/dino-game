import  java.math.*;

import static java.lang.Math.*;

public class Model extends Thread{ //this is the logic of the game

    public int jumpCalc(int var, int ground) throws InterruptedException {
        //var is the variable that is scraped from the frame rate and ground is the constant variable that determines the ground height
        System.out.println("function ran");
        try {
            Thread.sleep(1000);

            int funcvar = (int) ((-1) * pow((var - 10), 2) + ground);

            System.out.println(funcvar);
            return funcvar;


        }
        catch(InterruptedException e){
            e.printStackTrace();
        }
        return ground;
    }
}
