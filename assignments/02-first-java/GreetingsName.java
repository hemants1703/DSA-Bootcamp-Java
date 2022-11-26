//  Take name as input and print a greeting message for that particular name.
import java.util.Scanner;

public class GreetingsName {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //  input name
        System.out.print("Enter your name: ");
        String name = scan.nextLine();

        //  output greetings
        System.out.println("Hello, " + name + "!");
    }
}
