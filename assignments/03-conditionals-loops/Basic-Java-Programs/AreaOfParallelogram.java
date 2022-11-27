//  Area Of Parallelogram
import java.util.Scanner;

public class AreaOfParallelogram {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //  input base
        System.out.print("Enter base: ");
        double base = scan.nextDouble();

        //  input height
        System.out.print("Enter height: ");
        double height = scan.nextDouble();

        //  calculate area of parallelogram
        double area = base * height;

        System.out.println("Area Of Parallelogram: " + area);
    }
}
