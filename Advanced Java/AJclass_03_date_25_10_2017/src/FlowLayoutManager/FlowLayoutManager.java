
package FlowLayoutManager;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Toolkit;
import javax.swing.JButton;
import javax.swing.JFrame;


public class FlowLayoutManager {
     static JFrame aWindow = new JFrame("This is about Flowlayout");
    public static void main(String[] args) {
        Toolkit theKit = aWindow.getToolkit();  //get WindowToolkit
        Dimension winSize = theKit.getScreenSize(); //Get screen size
        
        //Set the position to screen center & size to half screen size
        aWindow.setBounds(winSize.width/4, winSize.height/4,    //possition
                winSize.width/2, winSize.height/2); //size
        aWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        FlowLayout flow = new FlowLayout(); //create a layout manager
        Container content = aWindow.getContentPane();   //get the content pane
        content.setLayout(flow);
        
        //now add six button component
        for (int i = 1; i <= 6; i++) {
            content.add(new JButton("Press "+i));//add a button to content pane
            aWindow.setVisible(true);
        }
    }    
}
