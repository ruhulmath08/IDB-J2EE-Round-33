package mouseEvent;

import java.awt.Frame;
import java.awt.Label;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class MouseEventExample extends Frame implements MouseListener {
    
    Label l;
    
    public MouseEventExample(){
        addMouseListener(this);
        
        l = new Label();
        l.setBounds(20, 50, 100, 200);
        add(l);
        setSize(300, 300);
        setLayout(null);
        setVisible(true);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        l.setText("Mouse clicked");
    }

    @Override
    public void mousePressed(MouseEvent e) {
        l.setText("Mouse Pressed");
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        l.setText("Mouse Released");
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        l.setText("Mouse Entered");
    }

    @Override
    public void mouseExited(MouseEvent e) {
        l.setText("Mouse Exited");
    }
    
    public static void main(String[] args) {
        new MouseEventExample();
    }

}
