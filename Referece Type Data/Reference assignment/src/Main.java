import java.awt.*;

public class Main
{
    public static void main(String[] args)
    {
        /*
        byte x = 1;
        byte y = x;
        System.out.println("X is " + x + " and Y is " + y);
        x = 2;
        System.out.println("Now X is " + x + " while Y is still " + y);
        */

        //"Point" Reference class
        Point point1 = new Point(1,1);
        Point point2 = point1;
        System.out.println("Point values of second point is " + point2);

        point1.x = 8;
        point1.y = 5;
        System.out.println("Point values now are " +point2);
    }
}