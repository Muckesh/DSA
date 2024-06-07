public class LeetCodeFindRotatedSortedArray {
    public static void main(String[] args) {
        int[] arr = {0,1,2,3};
        int target = 3;
        int pivotElement = pivot(arr);
        System.out.println(pivotElement);
        int firstTry;
        // if pivot == -1 no pivot array not rotated
        if (pivotElement==-1) {
            firstTry=binarySearch(arr, target, 0, arr.length-1);    
        }else{
            firstTry = binarySearch(arr, target, 0, pivotElement);
            if (firstTry==-1) {
                firstTry=binarySearch(arr, target, pivotElement+1, arr.length-1);
            }
        }
        System.out.println(firstTry);
    }

    static int pivot(int[] arr){
        int start=0;
        int end=arr.length-1;
        while (start<=end) {
            int mid=start+(end-start)/2;
            if (mid<end &&arr[mid]>arr[mid+1]) {
                return mid;
            }
            if (mid-1>start && arr[mid-1]>arr[mid]) {
                return mid-1;
            }
            if (arr[start]>=arr[mid]) {
                end=mid-1;
            }
            if (arr[start]<arr[mid]) {
                start=mid+1;
            }
        }
        return -1;
    }

    static int binarySearch(int[] arr,int target,int start,int end){
        while (start<=end) {
            int mid = start+(end-start)/2;
            if (target<arr[mid]) {
                end=mid-1;
            }else if (target>arr[mid]) {
                start=mid+1;
            }else{
                return mid;
            }
            
        }
        return -1;
    }
}
