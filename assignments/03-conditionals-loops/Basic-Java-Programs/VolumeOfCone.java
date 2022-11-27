//  Volume Of Cone Java Program
import java.util.Scanner;

public class VolumeOfCone {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //  input radius
        System.out.print("Enter Radius: ");
        double radius = scan.nextDouble();

        //  input height
        System.out.print("Enter Height: ");
        double height = scan.nextDouble();

        //  calculate volume of cone, taking π as 3.14
        double volume = 3.14 * radius * radius * (height / 3);

        //  output volume of cone
        System.out.println("Volume Of Cone: " + volume);
    }
}
