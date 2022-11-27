//  Perimeter Of Parallelogram
import java.util.Scanner;

public class PerimeterOfParallelogram {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //  input base
        System.out.print("Enter base: ");
        double base = scan.nextDouble();

        //  input side
        System.out.print("Enter side: ");
        double side = scan.nextDouble();

        //  calculate perimeter of parallelogram
        double perimeter = 2 * (base + side);

        //  output perimeter
        System.out.println("Perimeter Of Parallelogram: " + perimeter);
    }
}
