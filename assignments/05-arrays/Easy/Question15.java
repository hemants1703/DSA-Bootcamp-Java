//  https://leetcode.com/problems/matrix-diagonal-sum/
public class Question15 {
    public static void main(String[] args) {
        int[][] matrix = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        System.out.println(diagonalSum(matrix));
    }
    public static int diagonalSum(int[][] mat) {
        if(mat.length == 1)
            return mat[0][0];
        else if(mat.length == 2)
            return mat[0][0] + mat[0][1] + mat[1][1] + mat[1][0];
        int sum = 0;
        if(mat.length % 2 == 0) {
            for(int i = 0, j = mat.length - 1; i < mat.length && j >= 0; i++, j--)
                sum += mat[i][i] + mat[i][j];
        }
        else {
            for(int i = 0, j = mat.length - 1; i < mat.length && j >= 0; i++, j--) {
                if(i == j)
                    sum += mat[i][i];
                else
                    sum += mat[i][i] + mat[i][j];
            }
        }
        return sum;
    }
}
