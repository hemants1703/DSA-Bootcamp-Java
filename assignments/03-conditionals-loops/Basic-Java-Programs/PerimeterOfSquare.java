//  Perimeter Of Square
import java.util.Scanner;

public class PerimeterOfSquare {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //  input side
        System.out.print("Enter side: ");
        double side = scan.nextDouble();

        //  calculate perimeter of square
        double perimeter = 4 * side;

        //  output perimeter of square
        System.out.println("Perimeter Of Square: " + perimeter);
    }
}
