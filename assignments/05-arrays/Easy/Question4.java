//  https://leetcode.com/problems/richest-customer-wealth/
//  https://leetcode.com/problems/richest-customer-wealth/solutions/3097036/beats-100-with-0ms-runtime-java/
public class Question4 {
    public static void main(String[] args) {
        int[][] accounts = {
                {1,5},
                {7,3},
                {3,5}
        };
        System.out.println(maximumWealth(accounts));
    }
    public static int maximumWealth(int[][] accounts) {
        int maximumWealth = 0, wealthCount = 0;
        for(int customer = 0; customer < accounts.length; customer++) {
            for(int account = 0; account < accounts[customer].length; account++)
                wealthCount += accounts[customer][account];
            if(wealthCount > maximumWealth)
                maximumWealth = wealthCount;
            wealthCount = 0;
        }
        return maximumWealth;
    }
}
