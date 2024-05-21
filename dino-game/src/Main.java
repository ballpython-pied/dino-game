//this class contains the databases and logic schemes
public class Main {
    public static void main(String[] args) {
        View view = new View(); //instantiation of the GUI
        Control control = new Control();
        Model model = new Model();
        control.gameController(model, new View());
        //https://www.youtube.com/watch?v=dTVVa2gfht8 i like this video to learn for MVC
    }
}