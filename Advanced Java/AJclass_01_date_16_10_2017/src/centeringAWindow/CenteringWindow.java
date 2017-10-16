package centeringAWindow;

import java.awt.Dimension;
import java.awt.GraphicsEnvironment;
import java.awt.Point;
import java.awt.Toolkit;
import javax.swing.JFrame;

public class CenteringWindow {
    //The window object
    static JFrame aWindow = new JFrame("Display Window in Center");
    public static void main(String[] args) {
        
        Point center = GraphicsEnvironment.getLocalGraphicsEnvironment().getCenterPoint();
        int windowWidth = 400;
        int windowHeight = 250;
        
        //Set the possition and size
        aWindow.setBounds(center.x-windowWidth/2, center.y-windowHeight/2, //possition
                windowHeight, windowHeight); //size
        aWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        aWindow.setVisible(true);
    }
}
