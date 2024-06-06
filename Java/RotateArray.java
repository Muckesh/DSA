import java.util.Arrays;

public class RotateArray {
    // left / Anticlockwise
    // arr [1,2,3,4,5] -> [2,3,4,5,1]

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        System.out.println(Arrays.toString(arr));
        rotate(arr,-1);
        System.out.println(Arrays.toString(arr));
    }
    static void rotate(int[] arr, int k){
        k=k%arr.length; // repeats periodically after length of the array
        if (k<0) {
            k=k+arr.length;
        }

        reverse(arr,0,k-1);
        reverse(arr,k,arr.length-1);
        reverse(arr,0,arr.length-1);


    }

    static void reverse(int[] arr,int start,int end){
        while (start<end) {
            int temp = arr[start];
            arr[start]=arr[end];
            arr[end]=temp;

            start++;
            end--;
        }
    }


    // static void rotate(int[] a){
    //     int temp=a[0];
    //     for(int i=1;i<a.length;i++){
    //         a[i-1]=a[i];
    //     }
    //     a[a.length-1]=temp;
    // }

}