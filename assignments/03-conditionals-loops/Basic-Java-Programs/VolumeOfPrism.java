//  Volume Of Prism
import java.util.Scanner;

public class VolumeOfPrism {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //  input base
        System.out.print("Enter base: ");
        double base = scan.nextDouble();

        //  input height
        System.out.print("Enter height: ");
        double height = scan.nextDouble();

        //  input length
        System.out.print("Enter length: ");
        double length = scan.nextDouble();

        //  calculate volume of prism
        double volume = 0.5 * base * height * length;

        //  output volume of prism
        System.out.println("Volume Of Prism: " + volume);
    }
}
