import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

import java.awt.event.ItemEvent;
import java.util.*;
import java.awt.*;
import java.io.*;

import static com.sun.java.accessibility.util.AWTEventMonitor.addActionListener;

public class View extends JFrame{

    final static String GAMESCREEN = "the gamescreen";
    final static String MAINSCREEN = "the mainscreen";

    private JButton playButton = new JButton("Play");
    JPanel mainScreen = new JPanel();
    JPanel gameScreen = new JPanel();
    JPanel masterScreen = new JPanel(new CardLayout());

    ImageIcon dinoimage = new ImageIcon("visual/Dino Game Graphics/dino.jpg");
    JLabel dino = new JLabel();
    CardLayout cl = (CardLayout)(masterScreen.getLayout());
    public View() {
        super();



        this.setLayout(null);
        this.setSize(800,600);

        mainScreen.setSize(800,600);
        gameScreen.setSize(800,600);
        gameScreen.setLayout(null); //you need to set the null layout to get absolute positions.
        masterScreen.setSize(800,600);
        this.add(masterScreen);
        masterScreen.add(mainScreen, MAINSCREEN);
        masterScreen.add(gameScreen, GAMESCREEN);
        gameScreen.setBackground(Color.blue);

        mainScreen.setBackground(Color.red);
        mainScreen.add(playButton);
        playButton.setSize(20,20);

        dino.setIcon(new ImageIcon("C:\\Users\\rian.goldie\\Documents\\GitHub\\dino-game\\dino-game\\src\\visual\\Dino Game Graphics\\dino2.jpg"));
        dino.setBounds(50,200,200,200);
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

    public JPanel getMainScreen(){
        return this.mainScreen;
    }
    public void setMainScreen(JPanel mainScreen){
        this.mainScreen = mainScreen;
    }
    public void setMainScreen(){
        this.mainScreen = new JPanel();
    }

    public JPanel getGameScreen(){
        return this.gameScreen;
    }
    public void setGameScreen(JPanel gameScreen){
        this.gameScreen = gameScreen;
    }

    public void setGameScreen(){
        this.gameScreen = new JPanel();
    }

    public void switchFrames(){
        cl.show(masterScreen, GAMESCREEN);
        this.gameScreen.setBackground(Color.blue);
        System.out.println("Switched");
    }

    public void itemStateChanged(ItemEvent evt) {
        CardLayout cl = (CardLayout)(masterScreen.getLayout());
        cl.show(masterScreen, (String)evt.getItem());
    }
    public static void main(String[] args) {
        new View();
    }

    //this is the GUI class
}
