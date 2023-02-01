//  https://leetcode.com/problems/max-value-of-equation/
//
public class Question1 {
    public static void main(String[] args) {
        int[][] points = {
                {1,3},
                {2,0},
                {5,10},
                {6,-10}
        };
        System.out.println(findMaxValueOfEquation(points, 1));
    }
    public static int findMaxValueOfEquation(int[][] points, int k) {
        int maxValue = Integer.MIN_VALUE;
        int absValue = 0;
        for(int i = 0; i < points.length - 1; i++) {
            absValue = Math.abs(points[i][0] - points[i + 1][0]);
            if(absValue <= k)
                maxValue = Math.max(points[i][1] + points[i + 1][1] + absValue, maxValue);
        }
        return maxValue;
    }
}
