import java.util.ArrayList;
import java.util.List;
//  https://leetcode.com/problems/kids-with-the-greatest-number-of-candies/
public class Question6 {
    public static void main(String[] args) {
        int[] arr = {2,3,5,1,3};
        System.out.println(kidsWithCandies(arr, 3));
    }
    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> list = new ArrayList<>();
        for(int i = 0; i < candies.length; i++)
            list.add(isGreatest(i, candies, extraCandies));
        return list;
    }
    private static Boolean isGreatest(int i, int[] candies, int extraCandies) {
        candies[i] += extraCandies;
        for(int j = 0; j < candies.length && j != i; j++) {
            if(candies[i] < candies[j])
                return false;
        }
        return true;
    }
}
