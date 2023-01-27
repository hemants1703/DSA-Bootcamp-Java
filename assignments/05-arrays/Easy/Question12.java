import java.util.Arrays;
//  https://leetcode.com/problems/flipping-an-image/
public class Question12 {
    public static void main(String[] args) {
        int[][] arr = {
                {1,1,0},
                {1,0,1},
                {0,0,0}
        };
        System.out.println(Arrays.toString(flipAndInvertImage(arr)));
    }
    public static int[][] flipAndInvertImage(int[][] image) {
        //  flipping each rows
        int a = 0, b = 0;
        for(int i = 0; i < image.length; i++) {
            for(int j = 0, k = image[a].length - 1; j < image[a].length / 2; j++, k--) {
                //  swapping without using the third variable
                image[a][j] = image[a][j] + image[a][k];
                image[a][k] = image[a][j] - image[a][k];
                image[a][j] = image[a][j] - image[a][k];
            }
            a++;
        }

        //  inverting the elements
        a = 0;
        for(int i = 0; i < image.length; i++) {
            for(int j = 0; j < image[a].length; j++) {
                if(image[a][j] == 0)
                    image[a][j] = 1;
                else
                    image[a][j] = 0;
            }
            a++;
        }

        return image;
    }
}
