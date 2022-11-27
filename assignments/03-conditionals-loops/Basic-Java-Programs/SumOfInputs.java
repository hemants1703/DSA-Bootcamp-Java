//  Take integer inputs till the user enters 0 and print the sum of all numbers (HINT: while loop)
import java.util.Scanner;

public class SumOfInputs {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //  performing operations
        int input = 1;
        int sum = 0;
        while(input != 0) {
            input = scan.nextInt();
            sum += input;
        }
        System.out.println("Sum: " + sum);
    }
}
