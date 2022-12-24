import java.util.Scanner;

public class PowerInJava {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double number, power;

        System.out.print("Enter the number: ");
        number = sc.nextInt();
        System.out.print("Enter the power to the number: ");
        power = sc.nextInt();

        double poweredNumber = Math.pow(number, power);

        System.out.println("The number " + number + " raised to the power " + power + " = " + poweredNumber);
    }
}
