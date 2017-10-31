package lotteryApplet;

import java.applet.Applet;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import javax.swing.JButton;

public class Lottery extends Applet{
    //initialize the applet
    public void init(){
        //create interface components on event dispatch thread..
    }
    
    //create user interface for applate
    public void createGUI(){
        //set up the lucku number button
        
        //set up the control buttons
    }
    
    //class defining custom buttons showing lottery selection
    //each buttton listnes for its own events
    class Selection extends JButton implements ActionListener{
        //constructor
        public Selection(int value){
            //create the button  showing the value 
        }
        
        //handle selection button event
        public void actionPerformed(ActionEvent e) {
            //change the current selection value to a new selection value
        }
        //details of the rest of the selection class definition
    }
    
    //class defining a handler for a control button
    class HandleControlButton implements ActionListener{
        //Constructor
        
        //Handle button click
        public void actionPerformed(ActionEvent e) {
            //Handle button click for a particular button
        }
        //rest of the innner class defination
    }
    
    final static int numberCount = 6;
    final static int minValue = 1;
    final static int maxValue = 49;
    static int[] values = new int[maxValue-minValue+1];
    static{
        for (int i = 0; i < values.length; i++) {
            values[i] = i +minValue;
        }
    }
    private Selection[] luckyNumbers = new Selection[numberCount];
    private static Random choice = new Random();
}
