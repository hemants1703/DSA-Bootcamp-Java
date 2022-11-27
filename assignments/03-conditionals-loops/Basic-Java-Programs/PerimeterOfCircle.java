//  Perimeter Of Circle
import java.util.Scanner;

public class PerimeterOfCircle {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //  input radius
        System.out.print("Enter radius: ");
        double radius = scan.nextDouble();

        //  calculate perimeter of a circle, taking π as 3.14
        double perimeter = 2 * 3.14 * radius;

        //  output perimeter
        System.out.println("Perimeter Of Circle: " + perimeter);
    }
}
