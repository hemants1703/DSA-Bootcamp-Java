//  To find Armstrong Number between two given number.
import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //  input two numbers

        //  input first number
        System.out.print("Enter the first number: ");
        long firstNumber = scan.nextLong();

        //  input second number
        System.out.print("Enter the second number: ");
        long secondNumber = scan.nextLong();

        //  count number of digits in the number
        if(checkArmstrong(firstNumber))
            System.out.println(firstNumber + " is the Armstrong Number");
        else if(checkArmstrong(secondNumber))
            System.out.println(secondNumber + " is the Armstrong Number");
        else
            System.out.println("None of the numbers are Armstrong Numbers");
    }
    public static boolean checkArmstrong(long number) {
        int counter = 0;
        long tempNumber = number;
        
        //  counting the digits in the number
        while(tempNumber != 0) {
            counter += 1;
            tempNumber /= 10;
        }
        tempNumber = number;
        long newNumber = 0;
        
        //  reversing the number by giving it the power of counter
        while(tempNumber > 0) {
            newNumber += (long)Math.pow((tempNumber % 10), counter);
            tempNumber /= 10;
        }
        
        //  conditionals returning accordingly
        if(newNumber == number)
            return true;
        else
            return false;
    }
}
