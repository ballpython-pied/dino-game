//this class contains the databases and logic schemes
public class Main {
    //make sure to run the program on this class to make sure the logic works.
    public static void main(String[] args) {
         //instantiation of the GUI
        Control control = new Control();
        Model model = new Model();
        control.gameController(model, new View());

        //https://www.youtube.com/watch?v=dTVVa2gfht8 i like this video to learn for MVC

    }
}