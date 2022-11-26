//  To find out whether the given String is Palindrome or not.
import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //  input the string
        System.out.print("Enter the string: ");
        String input = scan.nextLine();

        //  checking the string
        boolean flag = true;
        for(int i = 0, j = input.length() - 1; i < input.length() && j >= 0; i++, j--) {
            if(input.charAt(i) != input.charAt(j)) {
                flag = false;
                break;
            }
        }

        //  conditionals after the checking to output accordingly
        if(flag == true)
            System.out.println("The string is palindrome");
        else
            System.out.println("The string is not palindrome");
    }
}
