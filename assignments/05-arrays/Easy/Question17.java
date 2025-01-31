import java.util.Arrays;

//  https://leetcode.com/problems/transpose-matrix/description/
//  https://leetcode.com/problems/transpose-matrix/solutions/3117101/beats-100-0ms-easy-solution-java/
public class Question17 {
    public static void main(String[] args) {
        int[][] matrix = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        matrix = transpose(matrix);
        for(int i = 0; i < 3; i++) {
            for(int j = 0; j < 3; j++)
                System.out.print(matrix[i][j]);
            System.out.println();
        }
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
