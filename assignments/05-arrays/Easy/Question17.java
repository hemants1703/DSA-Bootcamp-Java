import java.util.Arrays;

//  https://leetcode.com/problems/transpose-matrix/description/
public class Question17 {
    public static void main(String[] args) {
        int[][] matrix = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        System.out.println(Arrays.toString(transpose(matrix)));
    }
    public static int[][] transpose(int[][] matrix) {
        int row = matrix.length;
        int column = matrix[0].length;
        int[][] transposedMatrix = new int[column][row];
        for(int i = 0; i < row; i++) {
            for(int j = 0; j < column; j++)
                transposedMatrix[j][i] = matrix[i][j];
        }
        return transposedMatrix;
    }
}
