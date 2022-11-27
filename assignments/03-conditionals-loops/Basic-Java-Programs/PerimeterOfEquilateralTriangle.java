//  Perimeter Of Equilateral Triangle
import java.util.Scanner;

public class PerimeterOfEquilateralTriangle {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //  input side
        System.out.print("Enter a side: ");
        double side = scan.nextDouble();

        //  calculate perimeter of equilateral triangle
        double perimeter = 3 * side;

        //  output
        System.out.println("Perimeter Of Equilateral Triangle: " + perimeter);
    }
}
