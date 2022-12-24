import java.util.Scanner;

public class CommissionPercentage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double originalPrice, quotedPrice;

        //  input original price
        System.out.print("Enter original price: ");
        originalPrice = sc.nextDouble();

        //  input quoted price
        System.out.print("Enter quoted price: ");
        quotedPrice = sc.nextDouble();

        //  calculating the commission percentage
        double commissionPercentage = ((quotedPrice - originalPrice) / originalPrice) * 100;

        //  output commission percentage
        System.out.println("Commission Percentage: " + commissionPercentage);
    }
}
