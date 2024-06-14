import java.util.Arrays;

public class RowCol2DSearch {
    public static void main(String[] args) {

        int[][] matrix = {
            {10,20,30,40},
            {15,25,35,45},
            {28,29,37,49},
            {33,34,38,50}
        };

        int target = 37;

        System.out.println(Arrays.toString(search(matrix, target)));
        
    }

    static int[] search(int[][] matrix, int target){
        int r=0;
        int col = matrix.length-1;

        while (r<=matrix.length-1 && col>=0) {
            if (matrix[r][col]==target) {
                return new int[] {r,col};
            }
            else if (matrix[r][col]<target) {
                r++;
            }else{
                col--;
            }
        }

        return new int[] {-1,-1};
    }
}
