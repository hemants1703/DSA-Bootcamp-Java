//  Area Of Rhombus
import java.util.Scanner;

public class AreaOfRhombus {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //  input first diameter
        System.out.print("Enter first diameter: ");
        double firstDiameter = scan.nextDouble();

        //  input second diameter
        System.out.print("Enter second diameter: ");
        double secondDiameter = scan.nextDouble();

        //  calculate area of rhombus
        double area = (firstDiameter * secondDiameter) / 2;

        //  output area of rhombus
        System.out.println("Area Of Rhombus: " + area);
    }
}
