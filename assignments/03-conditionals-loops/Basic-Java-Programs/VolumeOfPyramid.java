//  Volume Of Pyramid
import java.util.Scanner;

public class VolumeOfPyramid {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //  input length
        System.out.print("Enter length: ");
        double length = scan.nextDouble();

        //  input breadth
        System.out.print("Enter breadth: ");
        double breadth = scan.nextDouble();

        //  input height
        System.out.print("Enter height: ");
        double height = scan.nextDouble();

        //  calculate volume of pyramid
        double volume = (length * breadth * height) / 3;

        //  output Volume Of Pyramid
        System.out.println("Volume Of Pyramid: " + volume);
    }
}
