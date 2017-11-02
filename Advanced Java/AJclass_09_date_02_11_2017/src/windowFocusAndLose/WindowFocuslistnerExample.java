package windowFocusAndLose;

import java.awt.FlowLayout;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class WindowFocuslistnerExample {

    private JFrame mainFrame;
    private JLabel headerLabel;
    private JLabel statusLabel;
    private JPanel controlPanel;

    public WindowFocuslistnerExample() {
        prepareGUI();
    }

    private void prepareGUI() {
        mainFrame = new JFrame("Java SWING Example");
        mainFrame.setSize(400, 400);
        mainFrame.setLayout(new GridLayout(3, 1));

        headerLabel = new JLabel("", JLabel.CENTER);
        statusLabel = new JLabel("", JLabel.CENTER);
        statusLabel.setSize(350, 100);

        mainFrame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent windowEvent) {
                System.exit(0);
            }
        });
        controlPanel = new JPanel();
        controlPanel.setLayout(new FlowLayout());

        mainFrame.add(headerLabel);
        mainFrame.add(controlPanel);
        mainFrame.add(statusLabel);
        mainFrame.setVisible(true);
    }

    private void showFocusListenerDemo() {
        headerLabel.setText("Listener in action : FocusListener");
        JButton okButton = new JButton("OK");
        JButton cancelButton = new JButton("Cancel");

        okButton.addFocusListener(new CustomFocusListener());
        cancelButton.addFocusListener(new CustomFocusListener());

        controlPanel.add(okButton);
        controlPanel.add(cancelButton);
        mainFrame.setVisible(true);
    }

    class CustomFocusListener implements FocusListener {

        @Override
        public void focusGained(FocusEvent e) {
            statusLabel.setText(statusLabel.getText()
                    + e.getComponent().getClass().getSimpleName() + "gaint focus ");
        }

        @Override
        public void focusLost(FocusEvent e) {
            statusLabel.setText(statusLabel.getText()
                    + e.getComponent().getClass().getSimpleName() + "lost focus ");
        }
    }

    public static void main(String[] args) {
        WindowFocuslistnerExample swingListenerDemo = new WindowFocuslistnerExample();
        swingListenerDemo.showFocusListenerDemo();
    }
}
