public class LeetCodeFindRotatedSortedArray {
    public static void main(String[] args) {
        int[] arr = {4,6,8,9,10,0,1,2,3};
        int target = 4;
        
        int ans = search(arr, target);

        System.out.println(ans);
    }

    static int search(int[] arr,int target){
        int pivotElement = pivot(arr);
        System.out.println(pivotElement);
        if (pivotElement==-1) {
            return binarySearch(arr, target, 0, arr.length-1);
        }

        if (arr[pivotElement]==target) {
            return pivotElement;
        }

        if (arr[0]<=target) {
            return binarySearch(arr, target, 0, pivotElement-1);
        }

        return binarySearch(arr, target, pivotElement+1, arr.length-1);
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
            // if (arr[start]<arr[mid]) {
            //     start=mid+1;
            // }
            else {
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
