package gridBagConstraints;

import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Toolkit;
import java.awt.Window;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.border.Border;

public class TryGridBagLayout {
    static JFrame aWindow = new JFrame("This is a Gridbag Layout");
    public static void main(String[] args) {
        Toolkit theKit = aWindow.getToolkit();//get the window toolkit
        Dimension wndSize = theKit.getScreenSize();//get screen size
        aWindow.setBounds(4/wndSize.width, wndSize.height/4, wndSize.width/2, wndSize.height/2);
        aWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        GridBagLayout gridbag = new GridBagLayout();
        GridBagConstraints constraints = new GridBagConstraints();
        aWindow.getContentPane().setLayout(gridbag);
        
        //set constraint and add first button
        constraints.weightx = constraints.weighty = 10.0;
        constraints.fill = constraints.BOTH;
        addButton(" Press ", constraints, gridbag);
        
        //set constraint and add second button
        constraints.gridwidth = constraints.REMAINDER;
        addButton(" GO ", constraints, gridbag);
        
        aWindow.setVisible(true);
    }

    static void addButton(String label, GridBagConstraints constraints, GridBagLayout layout) {
        //create s border object using BorderFactory method
        Border edge = BorderFactory.createRaisedBevelBorder();
        
        JButton button = new JButton(label);//create a button
        button.setBorder(edge);//add its border
        layout.setConstraints(button, constraints);//set the constraint
        aWindow.getContentPane().add(button);
    }

    
}
