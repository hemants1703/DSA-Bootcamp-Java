//  Volume Of Cylinder
import java.util.Scanner;

public class VolumeOfCylinder {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //  input radius
        System.out.print("Enter radius: ");
        double radius = scan.nextDouble();

        //  input height
        System.out.print("Enter height: ");
        double height = scan.nextDouble();

        //  calculate volume of cylinder, taking π as 3.14
        double volume = 3.14 * radius * radius * height;

        //  output Volume Of Cylinder
        System.out.println("Volume Of Cylinder: " + volume);
    }
}
