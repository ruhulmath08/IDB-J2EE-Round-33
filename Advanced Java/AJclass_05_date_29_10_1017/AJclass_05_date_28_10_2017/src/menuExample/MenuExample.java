package menuExample;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class MenuExample {

    JMenu menu, menu1, submenu, submenu1;
    JMenuItem i1, i2, i3, i4, i5;

    MenuExample() {
        JFrame f = new JFrame("Menu and MenuItem Example");
        JMenuBar mb = new JMenuBar();
        menu = new JMenu("File");
        submenu = new JMenu("Open");
        i1 = new JMenuItem("New");
        i4 = new JMenuItem("From Computer");
        i5 = new JMenu("From Remote");
        //forfor gitHub and Gitbucket
        

        menu.add(i1);

        submenu.add(i4);
        submenu.add(i5);
        menu.add(submenu);

        menu1 = new JMenu("Help");

        mb.add(menu);
        mb.add(menu1);
        f.setJMenuBar(mb);
        f.setSize(400, 400);
        f.setLayout(null);
        f.setVisible(true);
    }

    public static void main(String args[]) {
        new MenuExample();
    }
}
