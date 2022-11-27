//  Total Surface Area Of Cube
import java.util.Scanner;

public class TotalSurfaceAreaOfCube {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //  input side
        System.out.print("Enter side: ");
        double side = scan.nextDouble();

        //  calculate Total Surface Area Of Cube
        double sArea = 6 * side * side;

        //  output Total Surface Area Of Cube
        System.out.println("Total Surface Area Of Cube: " + sArea);
    }
}
