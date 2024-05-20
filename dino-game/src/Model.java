import  java.math.*;

import static java.lang.Math.*;

public class Model { //this is the logic of the game

    public float jumpCalc(int var, int ground) throws InterruptedException {
        //var is the variable that is scraped from the frame rate and ground is the constant variable that determines the ground height
        int x = 0;
        System.out.println("function ran");
        try {
            while (x < var) {
                x++;
                Thread.sleep(0x64);
                return (float) ((-1) * pow((x - 6), 2) + ground);

            }
        }
        catch(Exception e){
            System.out.println(e);
        }
        return ground;
    }
}
