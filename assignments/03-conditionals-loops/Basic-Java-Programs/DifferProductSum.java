/*
*   Subtract the Product and Sum of Digits of an Integer
*
*   Given an integer number n, return the difference between the product of its digits and the sum of its digits.
*
*   Input: n = 234
*   Output: 15
*   Explanation:
*   Product of digits = 2 * 3 * 4 = 24
*   Sum of digits = 2 + 3 + 4 = 9
*   Result = 24 - 9 = 15
*
* */
import java.util.Scanner;

public class DifferProductSum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //  input number
        System.out.print("Enter the number: ");
        int number = scan.nextInt();

        //  performing the necessary operations
        int productOfDigits = 1;
        int sumOfDigits = 0;

        //  extract each number from behind and calculate simultaneously
        while(number > 0) {
            int remainder = number % 10;
            productOfDigits *= remainder;   //  product of digits
            sumOfDigits += remainder;       //  sum of digits
            number /= 10;
        }

        System.out.println("Difference between the Product and Sum of digits of the number: " + (productOfDigits - sumOfDigits));
    }
}
