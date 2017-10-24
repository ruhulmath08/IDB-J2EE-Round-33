package ColorAndCursors;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JFrame;

public class ColorAndCursors {
    static JFrame aWindow = new JFrame("This is about Coursor and Color");
    public static void main(String[] args) {
        Toolkit theKit = aWindow.getToolkit();  //get WindowToolkit
        Dimension winSize = theKit.getScreenSize(); //Get screen size
        
        //Set the position to screen center & size to half screen size
        aWindow.setBounds(winSize.width/4, winSize.height/4,    //possition
                winSize.width/2, winSize.height/2); //size
        aWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        aWindow.setCursor(Cursor.getPredefinedCursor(Cursor.CROSSHAIR_CURSOR));
        aWindow.getContentPane().setBackground(Color.darkGray);
        aWindow.setVisible(true);   //display the window
    }
}
