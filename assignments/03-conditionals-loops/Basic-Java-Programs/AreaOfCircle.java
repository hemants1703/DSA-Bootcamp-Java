//  Area Of Circle Java Program
import java.util.Scanner;

public class AreaOfCircle {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //  input radius
        System.out.print("Enter the radius of the circle: ");
        double radius = scan.nextDouble();

        //  calculate area of circle, taking π as 3.14
        double area = 3.14 * radius * radius;

        //  output the area
        System.out.println("Area of the circle: " + area);
    }
}
