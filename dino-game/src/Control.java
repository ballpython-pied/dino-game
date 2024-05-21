import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.security.Key;

public class Control {
    //this class contains the listeners that record user input (such as key presses)
    private Model gameModel;
    private View gameview;


    public void gameController(Model gameModel, View gameview){
        this.gameModel = gameModel;
        this.gameview = gameview;
        this.gameview.addPlayListener(new playListenerClass());

        this.gameview.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {

            }

            @Override
            public void keyPressed(KeyEvent e) {
                if(e.getKeyCode() == KeyEvent.VK_SPACE){

                    /*there is a bug where you need to click out of the program then click back in to start the jump listener*/

                    try {
                        if(gameview.gameScreen.isVisible()) {
                            System.out.println("space pressed111111i");
                            for (int x = 0; x < 30; x++) {
                                gameview.dino.setBounds(50, gameModel.jumpCalc(x, 600), 200, 200);
                                gameview.dino.repaint();
                                gameview.dino.revalidate();
                            }
                        }
                    } catch (Exception ex) {
                        throw new RuntimeException(ex);
                    }
                }
            }

            @Override
            public void keyReleased(KeyEvent e) {

            }
        });


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

    static class keyCtrl implements KeyListener {

        @Override
        public void keyTyped(KeyEvent e) {
            System.out.println("space pressed");
            if (e.getKeyCode() == KeyEvent.VK_SPACE) {
                System.out.println("space pressed 2");
                int var = 30;
                try {
                    for (int x = 0; x < var; x++) {
                        /*Control.gameview.JumpAnimation(Control.gameModel.jumpCalc(x, 50));
                        Thread.sleep(333);*/
                    }
                } catch (Exception ee) {
                    System.out.println(ee);
                }
            }
            System.out.println(100);

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
    public static class spaceInput {
        public spaceInput(JComponent Jc) {
            Jc.addKeyListener(new KeyAdapter() {
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

