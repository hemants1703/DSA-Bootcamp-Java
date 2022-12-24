import java.util.Scanner;

public class BattingAverage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int runsScored, timesOut;

        System.out.print("Enter the number of runs scored by the player: ");
        runsScored = sc.nextInt();
        System.out.print("Enter the number of times the player was out: ");
        timesOut = sc.nextInt();

        //  calculating the batting average
        double battingAverage = (double) runsScored / timesOut;

        System.out.println("The batting average of the player: " + battingAverage);
    }
}
