package GetListOfFont;

import java.awt.Dimension;
import java.awt.GraphicsEnvironment;
import java.awt.Toolkit;

public class GetListofFont {
    public static void main(String[] args) {
        Toolkit theKit = Toolkit.getDefaultToolkit();
        
        System.out.println("\nScreen Resulation : "+theKit.getScreenResolution()+" dots per inch");
        
        Dimension screenDim = theKit.getScreenSize();
        System.out.println("Screen size : "+screenDim.width+" x "+screenDim.height+" pixel");
        
        GraphicsEnvironment e = GraphicsEnvironment.getLocalGraphicsEnvironment();
        String[] fontNames = e.getAvailableFontFamilyNames();
        System.out.println("\nFonts available in this platforms : ");
        int count = 0;
        for (String fontName : fontNames) {
            System.out.printf("%-50s", fontName);
            if (++count%3 == 0) {
                System.out.println();
            }
        }
        return;
    }
}
