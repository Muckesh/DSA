import java.util.Arrays;

public class Search2DArray {
    public static void main(String[] args) {
        // int[][] arr = {
        //     {12,13,55,6,63,35},
        //     {43,535,5365,536,5},
        //     {35,26,36,633,65,25}
        // };

        int[][] arr = new int[][] {
            {12,13,55,6,63,35},
            {43,535,5365,536,5},
            {35,26,36,633,65,25}
        };

        int target = 25;
        int[] ans = search(arr, target);
        // System.out.println(Arrays.toString(ans));
        System.out.println(Arrays.toString(search(arr, target)));

        System.out.println(max(arr));
    }

    // static int search(int[][] arr,int target){
    //     for(int i=0;i<arr.length;i++){
    //         for (int j = 0; j < arr[i].length; j++) {
    //             if (arr[i][j]==target) {
    //                 return j;
    //             }
    //         }
    //     }
    //     return -1;
    // }

    static int[] search(int[][] arr,int target){
        for(int i=0;i<arr.length;i++){
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j]==target) {
                    return new int[] {i,j};
                }
            }
        }
        return new int[] {-1,-1};
    }

    // static int max(int[][] arr){
    //     int ans=Integer.MIN_VALUE;
    //     for(int i=0;i<arr.length;i++){
    //         for (int j = 0; j < arr[i].length; j++) {
    //             if (arr[i][j]>ans) {
    //                 ans = arr[i][j];
    //             }
    //         }
    //     }
    //     return ans;
    // }
    
    static int max(int[][] arr){
        int ans=Integer.MIN_VALUE;
        for (int[] sarr : arr) {
            for (int is : sarr  ) {
                if (is>ans) {
                    ans=is;
                }
            }
        }
        return ans;
    }
}
