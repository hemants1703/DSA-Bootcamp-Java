//  Input a number and print all the factors of that number (use loops).
import java.util.Scanner;

public class FactorsOfNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //  input number
        System.out.print("Enter number: ");
        int number = scan.nextInt();

        //  printing the factors of the number
        System.out.print("The factors are: ");
        for(int i = 1; i <= number; i++) {
            if(number % i == 0)
                System.out.print(i + " ");
        }
    }
}
