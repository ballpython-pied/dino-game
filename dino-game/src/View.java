import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

import java.util.*;
import java.awt.*;
import java.io.*;
public class View extends JFrame{
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
        mainScreen.add(playButton);
        playButton.setSize(20,20);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    void addPlayListener(ActionListener playButtonListener){ //basically a setter/getter for the actionlistener.
        playButton.addActionListener(playButtonListener);
    }
    public static void main(String[] args) {
        new View();
    }

    //this is the GUI class
}
