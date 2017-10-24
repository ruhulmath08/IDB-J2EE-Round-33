package playingWithPointObject;

import java.awt.Point;

public class PlayingWithPointObject {

    public static void main(String[] args) {
        Point aPoint = new Point(); //initialize to (0,0)
        Point bPoint = new Point(50, 25);
        Point cPoint = new Point(bPoint);
        System.out.println("aPoint is located at : "+aPoint);
        aPoint.move(100, 50);   //change to possition (100, 50)
        
        bPoint.x = 110;
        bPoint.y = 70;
        
        aPoint.translate(10, 20);
        System.out.println("aPoint is now at : "+aPoint);
        
        if (aPoint.equals(bPoint)) {
            System.out.println("aPoint and bPoint are at same location");
        }
    }
}
