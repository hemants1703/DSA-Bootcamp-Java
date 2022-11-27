//  Take integer inputs till the user enters 0 and print the largest number from all.
import java.util.Scanner;

public class LargestOfInputs {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //  performing the operations
        int input = 1;
        int max = 0;
        while(input != 0) {
            input = scan.nextInt();
            if(input > max)
                max = input;
        }
        System.out.println("Largest number of inputs: " + max);
    }
}
