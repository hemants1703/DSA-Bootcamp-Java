import java.util.Scanner;

public class SmallestLargest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int first, second, third;

        System.out.print("Enter the first number: ");
        first = sc.nextInt();
        System.out.print("Enter the second number: ");
        second = sc.nextInt();
        System.out.print("Enter the third number: ");
        third = sc.nextInt();

        System.out.println("The smallest number: " + smallest(first, second, third));
        System.out.println("The largest number: " + largest(first, second, third));
    }
    public static int largest(int first, int second, int third) {
        int large = first;
        if(second > first && second > third)
            large = second;
        else if(third > first && third > second)
            large = third;
        return large;
    }
    public static int smallest(int first, int second, int third) {
        int small = first;
        if(second < first && second < third)
            small = second;
        else if(third < first && third < second)
            small = third;
        return small;
    }
}
