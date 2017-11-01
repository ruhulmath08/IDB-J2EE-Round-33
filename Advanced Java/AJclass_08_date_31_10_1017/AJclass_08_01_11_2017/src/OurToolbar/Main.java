package OurToolbar;

import java.awt.BorderLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JToolBar;

public class Main {

    public Main() {
        JFrame frame = new JFrame("JToolBar Demo");
        JToolBar toolbar = new JToolBar("Applications");
        JButton btnCalender = new JButton(new ImageIcon(getClass().getResource("/Images/Blue.gif")));
        JButton btnClook = new JButton(new ImageIcon(getClass().getResource("/Images/Circle.gif")));
        JButton btnContacts = new JButton(new ImageIcon(getClass().getResource("/Images/Green.gif")));
        JButton btnMail = new JButton(new ImageIcon(getClass().getResource("/Images/Red.gif")));
        JButton btnMessage = new JButton(new ImageIcon(getClass().getResource("/Images/Rectangle.gif")));
        JButton btnPhone = new JButton(new ImageIcon(getClass().getResource("/Images/Save.gif")));
        
        toolbar.add(btnCalender);
        toolbar.add(btnClook);
        toolbar.add(btnContacts);
        toolbar.add(btnMail);
        toolbar.add(btnMessage);
        toolbar.add(btnPhone);
        
        frame.setLayout(new BorderLayout());
        frame.getContentPane().add(toolbar, BorderLayout.PAGE_START);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        frame.setSize(500, 200);
        frame.setVisible(true);
    }
    
    public static void main(String[] args) {
        new Main();
    }
}
