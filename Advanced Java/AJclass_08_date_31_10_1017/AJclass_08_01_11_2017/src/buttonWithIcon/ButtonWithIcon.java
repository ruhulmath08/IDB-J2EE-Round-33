package buttonWithIcon;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

public class ButtonWithIcon {

    public static void main(String[] args) {
        JFrame f = new JFrame("My Icon Button");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JButton b = new JButton(new ImageIcon("D:\\Users\\J2EE-33\\Documents\\NetBeansProjects\\AJclass_08_01_11_2017\\src\\img\\java.png"));
        f.getContentPane().add(b);
        f.pack();
        f.setVisible(true);
    }
}
