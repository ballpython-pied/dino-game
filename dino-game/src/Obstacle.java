import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import javax.swing.*;
import java.util.Random;

public class Obstacle {
    //object used for obstacles and how to easily make an obstacle.

    String imagePath;
    BufferedImage image = ImageIO.read(new File(imagePath));

    Boolean isTouching;
    Image[] images = new Image[25];
    URL url = Obstacle.class.getResource("/res/images/animated.gif");
    ImageIcon imageIcon = new ImageIcon(url);

    JLabel label = new JLabel(imageIcon);

    JLabel[] gifs = new JLabel[25];
    //internet told me to use JLabels for gifs so this is the array of gifs to circle through for the obstacles

    double x;

    double y;

    double height;

    double width;

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public Obstacle() throws IOException {
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public JLabel getLabel() {
        return label;
    }

    public Boolean getTouching() {
        return isTouching;
    }

    public void setTouching(Boolean touching) {
        isTouching = touching;
    }

    public JLabel selectGIF (JLabel[] allGIFs){
        Random rand = new Random();
        int x = rand.nextInt(24);
        JLabel gif = allGIFs[x];
        return gif;
    }
}