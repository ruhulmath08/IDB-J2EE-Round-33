package toolTip;

import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class JavaToolTipExample {
    
    public JavaToolTipExample(){
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        //create a level with tooltrip help text
        JLabel tooltipLabel = new JLabel("Username");
        tooltipLabel.setToolTipText("Enter your username");
        
        JTextField tooltipJTextField = new JTextField(10);
        tooltipJTextField.setToolTipText("Enter your username over here, ");
        
        JButton tooltipButton = new JButton("Click me");
        tooltipButton.setToolTipText("Click this button to make somthing happen");
        frame.getContentPane().setLayout(new FlowLayout());
        frame.add(tooltipLabel);
        frame.add(tooltipJTextField);
        frame.add(tooltipButton);
        
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
    
    public static void main(String[] args) {
        new JavaToolTipExample();
    }
}
