/**
 * Calculations for a triangle and circle.
 *
 * @author Mr. King
 * @version 8/24/2021
 */

public class Main 
{
    public static void main(String[] args)
    {
        // Triangle
        int base = 6;
        int height = 10;
        int areaTri = 6 * 10 / 2;

        // Circle
        double radius = 15.0;
        double pi = 3.14159;  // optional
        double circumf = 2 * pi * radius;
        double areaCir = pi * radius * radius;

        System.out.println("Area = " + areaTri + " meters squared");
        System.out.println("Circumference = " + circumf + " meters");
        System.out.println("Area = " + areaCir + " meters squared");
    }
}

