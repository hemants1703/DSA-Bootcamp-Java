//  Curved Surface Area Of Cylinder
import java.util.Scanner;

public class CurvedSurfaceAreaOfCylinder {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //  input radius
        System.out.print("Enter radius: ");
        double radius = scan.nextDouble();

        //  input height
        System.out.print("Enter height: ");
        double height = scan.nextDouble();

        //  calculate Curved Surface Area Of Cylinder, taking π as 3.14
        double csArea = 2 * 3.14 * radius * height;

        //  output Curved Surface Area Of Cylinder
        System.out.println("Curved Surface Area Of Cylinder: " + csArea);
    }
}
