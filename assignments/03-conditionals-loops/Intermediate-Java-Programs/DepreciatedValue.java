import java.util.Scanner;

public class DepreciatedValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double originalValue, rateOfDepreciation, time;

        System.out.print("Enter the Original Value of the object: ");
        originalValue = sc.nextDouble();
        System.out.print("Enter the Rate of Depreciation of the object: ");
        rateOfDepreciation = sc.nextDouble();
        System.out.print("Enter the Time in Years: ");
        time = sc.nextDouble();

        //  calculating the depreciated value
        double depreciation = originalValue * Math.pow((1 - rateOfDepreciation / 100), time);

        System.out.println("The depreciated value: " + depreciation);
    }
}
