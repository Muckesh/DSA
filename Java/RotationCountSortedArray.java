import java.util.Arrays;

public class RotationCountSortedArray {
    public static void main(String[] args) {
        int[] arr1 = {4,5,6,7,0,1,2,3};
        int k = count(arr1);
        System.out.println(Arrays.toString(arr1));
        System.out.println("Without Duplicates "+k);
        int[] arr2 ={4,4,4,5,6,1,1,2,2,3,3,4};
        System.out.println(Arrays.toString(arr2));
        int l = pivotDuplicates(arr2) +1;
        System.err.println("With Duplicates "+l);

    }

    static int count(int[] arr){
        int pivotPos = pivot(arr);
        return pivotPos+1;
    }

    static int pivot(int[] arr){
        int start = 0;
        int end =arr.length-1;

        while (start<=end) {
            int mid =start+(end-start)/2;

            if ( mid<end && arr[mid]>arr[mid+1]) {
                return mid;
            }

            if (mid-1>start && arr[mid]<arr[mid-1]) {
                return mid-1;
            }

            if (arr[start]<=arr[mid]) {
                start=mid+1;
            }else{
                end=mid-1;
            }
        }
        return -1;
    }

    static int pivotDuplicates(int[] arr){
        int start = 0;
        int end =arr.length-1;

        while (start<=end) {
            int mid =start+(end-start)/2;

            if ( mid<end && arr[mid]>arr[mid+1]) {
                return mid;
            }

            if (mid-1>start && arr[mid]<arr[mid-1]) {
                return mid-1;
            }

            if (arr[start]==arr[mid]&&arr[mid]==arr[end]) {
                if (arr[start]>arr[start+1]) {
                    return start;
                }
                start++;

                if (arr[end]<arr[end-1]) {
                    return end-1;
                }
            }else if (arr[start]<arr[mid] || (arr[start]==arr[mid] && arr[mid]>arr[end])) {
                start=mid+1;
            }else{
                end=mid-1;
            }

        }
        return -1;
    }
}
