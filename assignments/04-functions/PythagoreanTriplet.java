import java.util.Scanner;

public class PythagoreanTriplet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numberOne, numberTwo, numberThree;
        System.out.print("Enter the first number: ");
        numberOne = sc.nextInt();
        System.out.print("Enter the second number: ");
        numberTwo = sc.nextInt();
        System.out.print("Enter the third number: ");
        numberThree = sc.nextInt();
        if(tripletCheck(numberOne, numberTwo, numberThree))
            System.out.println("It is Pythagorean Triplet");
        else
            System.out.println("It is not a Pythagorean Triplet");
    }
    private static boolean tripletCheck(int numberOne, int numberTwo, int numberThree) {
        return (numberOne * numberOne) + (numberTwo * numberTwo) == (numberThree * numberThree) ||
                (numberOne * numberOne) + (numberThree * numberThree) == (numberTwo * numberTwo) ||
                    (numberTwo * numberTwo) + (numberThree * numberThree) == (numberOne * numberOne);
    }
}
