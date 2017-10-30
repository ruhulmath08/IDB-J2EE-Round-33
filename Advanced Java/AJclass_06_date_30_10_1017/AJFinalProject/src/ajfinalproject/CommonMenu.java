package ajfinalproject;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class CommonMenu {
    public static JMenuBar displayMenu(JFrame f){
        JMenuBar menuBar = new JMenuBar();
        JMenu menu1 = new JMenu("File");
        JMenuItem item1 = new JMenuItem("Purchase Product");
        item1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                f.setVisible(false);
                new PursesProduct().setVisible(true);
            }
        });
        
        JMenuItem item2 = new JMenuItem("Sale Product");
        item2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                f.setVisible(false);
                new SalesProduct().setVisible(true);
            }
        });
        JMenuItem item3 = new JMenuItem("Dashboard");
        item3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                f.setVisible(false);
                new DashBoard().setVisible(true);
            }
        });
        JMenuItem item4 = new JMenuItem("Exit");
        item4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                f.setVisible(false);
                System.exit(0);
            }
        });
        
        menu1.add(item1);
        menu1.addSeparator();
        menu1.add(item2);
        menu1.addSeparator();
        menu1.add(item3);
        menu1.addSeparator();
        menu1.add(item4);
        f.setExtendedState(JFrame.MAXIMIZED_BOTH);
        menuBar.add(menu1);        
        return menuBar;
    }
}
