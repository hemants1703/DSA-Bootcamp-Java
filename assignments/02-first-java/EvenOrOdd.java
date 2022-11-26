//  1. Write a program to print whether a number is even or odd, also take input from the user.
import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //  input the number
        System.out.print("Enter a number to check if it is even or odd: ");
        int input = scan.nextInt();

        //  check if the number is even or odd and output accordingly
        if(input % 2 == 0)
            System.out.println("The number is even");
        else
            System.out.println("The number is odd");
    }
}
