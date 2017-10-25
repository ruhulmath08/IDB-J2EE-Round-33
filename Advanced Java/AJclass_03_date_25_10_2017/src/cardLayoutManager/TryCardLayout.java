package cardLayoutManager;

import java.awt.CardLayout;
import java.awt.Container;

import java.awt.event.ActionEvent;  //class to handle event
import java.awt.event.ActionListener;

import javax.swing.JApplet;
import javax.swing.JButton;

public class TryCardLayout extends JApplet implements ActionListener{
    CardLayout card = new CardLayout(50, 50);   //create layout
    
    public void init(){
        Container content = getContentPane();
        content.setLayout(card); //set card as the layout mgr
        
        JButton button;
        for (int i = 1; i <= 6; i++) {
            content.add(button = new JButton(" Press "+i), "Card"+i); //add a button
            button.addActionListener(this);//add lisner for button
        }
    }

    //handle button event
    @Override
    public void actionPerformed(ActionEvent e) {
        card.next(getContentPane());//switch to the next card
    }
    
}
