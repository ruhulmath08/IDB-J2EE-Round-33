
package buldingaMenu;

import java.awt.Dimension;
import java.awt.Toolkit;



public class Sketcher {
    public static void main(String[] args) {
        window = new SketchFrame("Sketcher");
        Toolkit theKit = window.getToolkit();
        Dimension winSize = theKit.getScreenSize();
        
        window.setBounds(winSize.width/4, winSize.height/4, winSize.width/2, winSize.height/2);
        window.setVisible(true);
    }
    private static SketchFrame window;
}
