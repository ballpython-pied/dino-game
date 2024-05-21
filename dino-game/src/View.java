import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

import java.util.*;
import java.awt.*;
import java.io.*;

import static com.sun.java.accessibility.util.AWTEventMonitor.addActionListener;

public class View extends JFrame{
    private JPanel mainScreen;
    private JPanel gameScreen;
    private JButton playButton = new JButton("Play");
    public View() {
        super();
        JPanel mainScreen = new JPanel();
        JPanel gameScreen = new JPanel();


        this.setLayout(null);
        this.setSize(600,400);
        mainScreen.setSize(600,400);
        gameScreen.setSize(600,400);
        this.add(mainScreen);
        this.add(gameScreen);
        gameScreen.setBackground(Color.blue);
        mainScreen.setBackground(Color.red);
        mainScreen.add(playButton);
        playButton.setSize(20,20);

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

    public JPanel getGameScreen(){
        return this.gameScreen;
    }
    public void setGameScreen(JPanel gameScreen){
        this.gameScreen = gameScreen;
    }
    public static void main(String[] args) {
        new View();
    }

    //this is the GUI class
}
