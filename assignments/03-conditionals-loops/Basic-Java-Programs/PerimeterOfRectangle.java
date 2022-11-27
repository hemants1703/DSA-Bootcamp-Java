//  Perimeter Of Rectangle
import java.util.Scanner;

public class PerimeterOfRectangle {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //  input length
        System.out.print("Enter length: ");
        double length = scan.nextDouble();

        //  input breadth
        System.out.print("Enter breadth: ");
        double breadth = scan.nextDouble();

        //  calculate perimeter of rectangle
        double perimeter = 2 * (length + breadth);

        //  output perimeter of rectangle
        System.out.println("Perimeter Of Rectangle: " + perimeter);
    }
}
