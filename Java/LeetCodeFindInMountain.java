public class LeetCodeFindInMountain {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,3,1};
        int target = 9;

        int peakElement = peak(arr);
        int ans=OrderAgnosticsBS(arr, target,0,peakElement);
        if (ans!=-1) {
            System.out.println(ans);
        }else{
            ans=OrderAgnosticsBS(arr, target, peakElement+1, arr.length-1);
            System.out.println(ans);
        }
    }
    static int OrderAgnosticsBS(int[] arr,int target,int start,int end){
        // int start=0;
        // int end=arr.length-1;
        boolean isAsc = arr[start]<arr[end];
        while (start<=end) {
            int mid = start+(end-start)/2;
            if (target==arr[mid]) {
                return mid;
            }else{
                if (isAsc) {
                    if (target<arr[mid]) {
                        end=mid-1;
                    }else{
                        start=mid+1;
                    }
                }else{
                    if (target>arr[mid]) {
                        end=mid-1;
                    }else{
                        start=mid+1;
                    }
                }
            }
        }
        return -1;
    }

    static int peak(int[] arr){
        int start =0;
        int end = arr.length-1;

        while (start<end) {
             int mid = start +(end-start)/2;
             if (arr[mid]>arr[mid+1]) {
                end=mid;
             }else{
                start=mid+1;
             }
        }
        return start;
    }
}
