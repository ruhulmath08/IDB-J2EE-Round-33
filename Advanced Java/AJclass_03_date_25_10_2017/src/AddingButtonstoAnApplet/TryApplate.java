package AddingButtonstoAnApplet;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.border.BevelBorder;

public class TryApplate extends JApplet{
    public void init(){
        Container content = getContentPane(); //get content pane
        content.setLayout(new FlowLayout(FlowLayout.CENTER));    //set layout
        
        JButton button;//store a button
        Font[] fonts = {new Font("Serif", Font.ITALIC, 10), //Two fonts
                        new Font("Dialog", Font.PLAIN, 14)
                        };
        BevelBorder edge = new BevelBorder(BevelBorder.RAISED);//Bevelled border
        
        //Add the buttons using alternate fonts
        for (int i = 1; i <= 6; i++) {
            content.add(button = new JButton("Press "+i));  //Add the button
            button.setFont(fonts[i%2]); //one of our own fonts
            button.setBorder(edge); //set the button border
        }
    }
}
