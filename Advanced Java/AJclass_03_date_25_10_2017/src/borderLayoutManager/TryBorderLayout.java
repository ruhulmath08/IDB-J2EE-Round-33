package borderLayoutManager;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.border.EtchedBorder;

public class TryBorderLayout {
    static JFrame aWindow = new JFrame("This is about Flowlayout");
    public static void main(String[] args) {
        Toolkit theKit = aWindow.getToolkit();  //get WindowToolkit
        Dimension winSize = theKit.getScreenSize(); //Get screen size
        
        //Set the position to screen center & size to half screen size
        aWindow.setBounds(winSize.width/4, winSize.height/4,    //possition
                winSize.width/2, winSize.height/2); //size
        aWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        BorderLayout border = new BorderLayout();//create a layout manager
        Container content = aWindow.getContentPane();//get the content pan
        content.setLayout(border);//set the container layout mgr
        EtchedBorder edge = new EtchedBorder(EtchedBorder.LOWERED);//button border
        JButton button;
        content.add(button = new JButton("East"),BorderLayout.EAST);
        button.setBorder(edge);
        content.add(button = new JButton("WEAST"),BorderLayout.WEST);
        button.setBorder(edge);
        content.add(button = new JButton("NORTH"),BorderLayout.NORTH);
        button.setBorder(edge);
        content.add(button = new JButton("SOUTH"),BorderLayout.SOUTH);
        button.setBorder(edge);
        content.add(button = new JButton("CENTER"),BorderLayout.CENTER);
        button.setBorder(edge);
        aWindow.setVisible(true);//display the window
    }
}
