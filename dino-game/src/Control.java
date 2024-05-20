import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.security.Key;

public class Control {
    //this class contains the listeners that record user input (such as key presses)
    private Model gameModel = new Model();
    private View gameview = new View();

    public void gameController(Model gameModel, View gameview){
        this.gameModel = gameModel;
        this.gameview = gameview;
        this.gameview.addPlayListener(new playListenerClass());
        this.gameview.dinoKeyListener(new spaceInput());
        this.gameview.addActionListener("space", new actionCtrl());


    }

    class playListenerClass implements ActionListener { //java wants a new class for some reason
        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println("pressed");
            gameview.setGameScreen();
            gameview.setMainScreen();
            gameview.switchFrames();
        }
    }

    class keyCtrl extends KeyAdapter {

        @Override
        public void keyTyped(KeyEvent e) {
            System.out.println("space pressed");
            if (e.getKeyCode() == KeyEvent.VK_SPACE) {
                System.out.println("space pressed 2");
                int var = 30;
                try {
                    for (int x = 0; x < var; x++) {
                        gameview.JumpAnimation(gameModel.jumpCalc(x, 50));
                        Thread.sleep(333);
                    }
                } catch (Exception ee) {
                    System.out.println(ee);
                }
            }

        /*

                https://stackoverflow.com/questions/22730715/java-keyboard-input-game-development
                the source that I used
                 */

        }

        @Override
        public void keyPressed(KeyEvent e) {
            throw new UnsupportedOperationException("not supported yet");

        }

        @Override
        public void keyReleased(KeyEvent e) {
            throw new UnsupportedOperationException("not supported yet");
        }
    }
    class actionCtrl extends AbstractAction {

        @Override
        public void actionPerformed(ActionEvent e) {

            System.out.println("keybinder works");
        }
    }
    public class spaceInput {
        public spaceInput() {
            gameview.gameScreen.addKeyListener(new KeyAdapter() {
                @Override
                public void keyPressed(KeyEvent e) {
                    if (e.getKeyCode()==KeyEvent.VK_SPACE){
                        View.jump = true;
                    }
                }
            });


    }
    }
}

