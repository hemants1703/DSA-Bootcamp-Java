import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number;
        System.out.print("Enter the number: ");
        number = sc.nextInt();
        if(palindromeCheck(number))
            System.out.println("The number is palindrome");
        else
            System.out.println("The number is not palindrome");
    }
    private static boolean palindromeCheck(int number) {
        int reversed = 0;
        int temp = number;
        while(number > 0) {
            reversed = (reversed * 10) + number % 10;
            number /= 10;
        }
        return temp == reversed;
    }
}
