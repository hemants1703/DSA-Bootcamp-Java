//  Volume Of Sphere
import java.util.Scanner;

public class VolumeOfSphere {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //  input radius
        System.out.print("Enter radius: ");
        double radius = scan.nextDouble();

        //  calculate volume of sphere, taking π as 3.14
        double volume = 1.33 * 3.14 * radius * radius * radius;

        //  output volume of sphere
        System.out.println("Volume Of Sphere: " + volume);
    }
}
