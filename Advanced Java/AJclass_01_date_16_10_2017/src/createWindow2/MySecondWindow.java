package createWindow2;

import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JFrame;

public class MySecondWindow {
    //the window object
    static JFrame aWindow = new JFrame("My Second Window");
    public static void main(String[] args) {
        Toolkit toolkit = aWindow.getToolkit(); //get window toolkit
        Dimension wndSize = toolkit.getScreenSize();    //get screen size
        
        //Set the possition to screen center & size to half screen size
        aWindow.setBounds(wndSize.width/4, wndSize.height/4, //possition
                wndSize.width/2, wndSize.height/2); //size
        aWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        aWindow.setVisible(true);
    }
}
