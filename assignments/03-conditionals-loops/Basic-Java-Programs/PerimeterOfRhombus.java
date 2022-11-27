//  Perimeter Of Rhombus
import java.util.Scanner;

public class PerimeterOfRhombus {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //  input side
        System.out.print("Enter side: ");
        double side = scan.nextDouble();

        //  calculate perimeter of rhombus
        double perimeter = 4 * side;

        //  output perimeter of rhombus
        System.out.println("Perimeter Of Rhombus: " + perimeter);
    }
}
