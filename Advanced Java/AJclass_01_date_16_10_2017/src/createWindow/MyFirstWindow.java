package createWindow;

import javax.swing.JFrame;

public class MyFirstWindow {
    static JFrame aWindow = new JFrame("My First Window");
    public static void main(String[] args) {
        int windowWidth = 400;
        int windowHeight = 250;
        aWindow.setBounds(100, 100, windowWidth, windowHeight);
        aWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        aWindow.setVisible(true);
    }
}
