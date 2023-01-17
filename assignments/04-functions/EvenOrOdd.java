import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number;
        System.out.print("Enter the number: ");
        number = sc.nextInt();
        if(evenOddCheck(number))
            System.out.println("The number is Even");
        else
            System.out.println("The number is Odd");
    }
    public static boolean evenOddCheck(int number) {
        if(number % 2 == 0)
            return true;
        return false;
    }
}
