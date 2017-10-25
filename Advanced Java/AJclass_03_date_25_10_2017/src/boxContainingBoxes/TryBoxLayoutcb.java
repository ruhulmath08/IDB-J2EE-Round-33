package boxContainingBoxes;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.border.Border;

public class TryBoxLayoutcb {
    static JFrame aWindow = new JFrame("This is about Flowlayout");
    public static void main(String[] args) {
        Toolkit theKit = aWindow.getToolkit();  //get WindowToolkit
        Dimension winSize = theKit.getScreenSize(); //Get screen size
        
        //Set the position to screen center & size to half screen size
        aWindow.setBounds(winSize.width/4, winSize.height/4,    //possition
                winSize.width/2, winSize.height/2); //size
        aWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        //create left column for radio button
        Box left = Box.createVerticalBox();
        ButtonGroup radioGroup = new ButtonGroup();//create button group
        JRadioButton rbutton;//stores a button
        radioGroup.add(rbutton = new JRadioButton("Red"));//add to group
        left.add(rbutton);//add to box        
        radioGroup.add(rbutton = new JRadioButton("Green"));//add to group
        left.add(rbutton);//add to box
        radioGroup.add(rbutton = new JRadioButton("Blue"));//add to group
        left.add(rbutton);//add to box
        radioGroup.add(rbutton = new JRadioButton("Yellow"));//add to group
        left.add(rbutton);//add to box
        
        //create right columns of checkboxs
        Box right = Box.createVerticalBox();
        right.add(new JCheckBox("Dashed"));
        right.add(new JCheckBox("Thick"));
        right.add(new JCheckBox("Rounded"));
        
        //create top row to hold left and right
        Box top = Box.createHorizontalBox();
        top.add(left);
        top.add(right);
        //create button row of buttons
        JPanel bottomPanel = new JPanel();
        Border edge = BorderFactory.createRaisedBevelBorder();//Button border
        JButton button;
        Dimension size = new Dimension(80, 20);
        bottomPanel.add(button = new JButton("Default"));
        button.setBorder(edge);
        button.setPreferredSize(size);
        bottomPanel.add(button = new JButton("Ok"));
        button.setBorder(edge);
        button.setPreferredSize(size);
        bottomPanel.add(button = new JButton("Cancel"));
        button.setBorder(edge);
        button.setPreferredSize(size);
        
        //add top and buton panel to content pane
        Container content = aWindow.getContentPane();//get content pan
        content.setLayout(new BorderLayout());//set border layout manager
        content.add(top, BorderLayout.CENTER);
        content.add(bottomPanel, BorderLayout.SOUTH);
        aWindow.pack();
        aWindow.setVisible(true);
    }
}
