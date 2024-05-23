import java.awt.BorderLayout;
import java.awt.event.*;

import javax.swing.*;
import javax.swing.text.Keymap;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.util.*;
import java.awt.*;
import java.io.*;


import static com.sun.java.accessibility.util.AWTEventMonitor.addActionListener;

public class View extends JFrame {

    final static String GAMESCREEN = "the gamescreen";
    final static String MAINSCREEN = "the mainscreen";
    private static final String SPACE_KEY_PRESSED = "space pressed";
    private static final int UP_TIMER_DELAY = 50;

    public Boolean jump = false;

    private JButton playButton = new JButton("Play");
    JPanel mainScreen = new JPanel();
    JPanel gameScreen = new JPanel();
    JPanel masterScreen = new JPanel(new CardLayout());

    JPanel gameScreenGet = (JPanel) this.getGameScreen();
    int condition = JComponent.WHEN_IN_FOCUSED_WINDOW;
    InputMap inputMap = gameScreen.getInputMap(condition);
    KeyStroke space = KeyStroke.getKeyStroke((char) KeyEvent.VK_SPACE);
    ActionMap actionMap = gameScreen.getActionMap();


    ImageIcon dinoimage = new ImageIcon("visual/Dino Game Graphics/dino.jpg");
    JLabel dino = new JLabel();
    CardLayout cl = (CardLayout) (masterScreen.getLayout());

    public View() {
        super();

        this.setLayout(null);
        this.setSize(800, 600);

        mainScreen.setSize(800, 600);
        gameScreen.setSize(800, 600);
        gameScreen.setLayout(null); //you need to set the null layout to get absolute positions.
        masterScreen.setSize(800, 600);
        this.add(masterScreen);
        masterScreen.add(mainScreen, MAINSCREEN);
        masterScreen.add(gameScreen, GAMESCREEN);
        gameScreen.setBackground(Color.blue);

       //dino.addKeyListener(new Control.keyCtrl());
        //
        // dinoKeyListener(new Control.keyCtrl());
       //gameScreen.addKeyListener(new Control.keyCtrl());


        mainScreen.setBackground(Color.red);
        mainScreen.add(playButton);
        playButton.setSize(20, 20);

        dino.setIcon(new ImageIcon(Objects.requireNonNull(Main.class.getResource("visual/Dino Game Graphics/dino2.jpg"))));
        /*use " Objects.requireNonNull(Main.class.getResource()); " to properly set images when the program is going
         * to be used in a JAR file. this makes the dependencies be able to find the images properly*/

        dino.setBounds(50, 200, 200, 200);
        gameScreen.add(dino);

        /*playButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("pressed");
                           }
        });*/

        this.setVisible(true);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void addPlayListener(ActionListener playButtonListener) { //basically a setter/getter for the actionlistener.
        playButton.addActionListener(playButtonListener);
    }

    public void dinoKeyListener(Object dinoKeyListener) {
        System.out.println("listener read");
        dino.addKeyListener((KeyListener) dinoKeyListener);
        inputMap.put(space, SPACE_KEY_PRESSED);
        actionMap.put(SPACE_KEY_PRESSED,new UpAction(true));


    }

    public Action addActionListener(String key, Action abstractAction) {
        return abstractAction;
    }

    public JPanel getMainScreen() {
        return this.mainScreen;
    }

    public void setMainScreen(JPanel mainScreen) {
        this.mainScreen = mainScreen;
    }

    public void setMainScreen() {
        this.mainScreen = new JPanel();
    }

    public JPanel getGameScreen() {
        return this.gameScreen;
    }

    public void setGameScreen(JPanel gameScreen) {
        this.gameScreen = gameScreen;
    }

    public void setGameScreen() {
        this.gameScreen = new JPanel();
    }

    public void switchFrames() {
        cl.show(masterScreen, GAMESCREEN);
        this.gameScreen.setBackground(Color.blue);
        this.gameScreen.setVisible(true);
        System.out.println("Switched");
    }

    public void itemStateChanged(ItemEvent evt) {
        CardLayout cl = (CardLayout) (masterScreen.getLayout());
        cl.show(masterScreen, (String) evt.getItem());
    }

    public static void main(String[] args) {
        new View();
    }

    public void JumpAnimation(double y) {


        dino.setAlignmentY((float) y);
        System.out.println("animation read");
    }

    private class UpAction extends AbstractAction {
        private boolean onKeyRelease;

        public UpAction(boolean onKeyRelease) {
            this.onKeyRelease = onKeyRelease;
        }

        @Override
        public void actionPerformed(ActionEvent e) {

        }

        //this is the GUI class
    }
}
