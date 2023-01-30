import java.util.ArrayList;
import java.util.List;
//  https://leetcode.com/problems/add-to-array-form-of-integer/
public class Question18 {
    public static void main(String[] args) {

    }
    public static List<Integer> addToArrayForm(int[] num, int k) {
        //  Array to Integer
        int number = 0;
        for (int j : num) number = (number * 10) + j;
        //  Add the number
        number += k;
        //  Integer to List
        List<Integer> list = new ArrayList<>();
        String str = Integer.toString(number);
        for(int i = 0; i < str.length(); i++)
            list.add(Integer.parseInt(str.charAt(i) + ""));
        return list;
    }
}
