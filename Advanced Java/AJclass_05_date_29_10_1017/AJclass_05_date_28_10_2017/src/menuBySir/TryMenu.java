package menuBySir;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class TryMenu {
    
    JMenu menu1, menu2, submenu;
    JMenuItem item1, item2, item3, item4, h1, h2;
    public TryMenu() {
        JFrame f = new JFrame("Simple Notepad");
        JMenuBar mb = new JMenuBar();
        
        menu1 = new JMenu("File");
        item1 = new JMenuItem("File");
        item2 = new JMenuItem("Open");
        item3 = new JMenuItem("Exit");
        menu1.add(item1);
        menu1.addSeparator();
        menu1.add(item2);
        menu1.addSeparator();
        menu1.add(item3);
        
        menu2 = new JMenu("Help");
        submenu = new JMenu("Submenu");
        h1 = new JMenuItem("Live chat");
        h1 = new JMenuItem("Email Support");
        submenu.add(h1);
        menu2.addSeparator();
        submenu.add(h2);
        menu2.add(submenu);
        
        
        
        mb.add(menu1);
        mb.add(menu2);
        f.setJMenuBar(mb);
        
        f.setSize(400, 400);
        f.setLayout(null);
        f.setVisible(true);
    }
    
    public static void main(String[] args) {
        new TryMenu();
    }
}
