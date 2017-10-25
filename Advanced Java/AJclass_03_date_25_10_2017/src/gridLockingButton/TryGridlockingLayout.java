
package gridLockingButton;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Toolkit;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.border.EtchedBorder;

public class TryGridlockingLayout {
    static JFrame aWindow = new JFrame("This is about Flowlayout");
    public static void main(String[] args) {
        Toolkit theKit = aWindow.getToolkit();  //get WindowToolkit
        Dimension winSize = theKit.getScreenSize(); //Get screen size
        
        //Set the position to screen center & size to half screen size
        aWindow.setBounds(winSize.width/4, winSize.height/4,    //possition
                winSize.width/2, winSize.height/2); //size
        aWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        GridLayout grid = new GridLayout(3, 4, 30, 20);//Create a layout manager
        Container content = aWindow.getContentPane();   //get the content pane
        content.setLayout(grid);
        
        EtchedBorder edge = new EtchedBorder(EtchedBorder.RAISED);//buttn border
        
        //now add ten Button component
        JButton button;// = null;//store a button
        for(int i = 1; i <= 12; i++){   
            content.add(button = new JButton(" Press "+i)); //add a button
            button.setBorder(edge); //set the border
        }
        aWindow.pack();//size for component
        aWindow.setVisible(true);//display the window
    }
}
