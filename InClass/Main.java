/**
 * This program creates variables for geometric figures and calculates values such as perimeter and area.
 *
 * @author Mr. King
 * @version 8/23/2021
 */

public class Main
{
    public static void main(String[] args) 
    {
        int side1 = 10;
        int side2 = 4;
        double radius = 4.5;
        System.out.println(side1);
        System.out.println(radius);
        double area = 3.14159 * radius * radius;
        System.out.println(area);
        int perimeter = 2 * side1 + 2 * side2;
        System.out.println(perimeter);
    }
}

