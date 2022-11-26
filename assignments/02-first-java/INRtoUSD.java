//  Input currency in rupees and output in USD.
import java.util.Scanner;

public class INRtoUSD {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //  input currency in rupees (INR: Indian Rupees)
        System.out.print("Enter amount in INR: ");
        double INR = scan.nextDouble();

        //  converting the currency based on the metrics of 26 Nov 2022 12:45 am UTC
        double USD = INR / 81.67;

        //  output the amount in USD (United States Dollar)
        System.out.println("Amount in USD: " + USD);
    }
}
