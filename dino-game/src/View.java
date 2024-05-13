import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

import java.util.*;
import java.awt.*;
import java.io.*;
public class View extends JFrame{


    private JButton playButton = new JButton("Play");

    View() {

        JPanel mainScreen = new JPanel();
        JPanel gameScreen = new JPanel();


        this.setSize(600,200);
        mainScreen.setSize(600,200);
        gameScreen.setSize(600,200);
        this.add(mainScreen);
        this.add(gameScreen);
        mainScreen.add(playButton);
        playButton.setSize(20,20);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }


    //this is the GUI class
}
