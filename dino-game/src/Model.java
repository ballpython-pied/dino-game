import  java.math.*;

import static java.lang.Math.*;

public class Model { //this is the logic of the game
    Model(){

    }
    public double jumpCalc(int var, int ground){
        //var is the variable that is scraped from the frame rate and ground is the constant variable that determines the ground height
        return (-1)*pow((var-6),2)+ground;
    }
}
