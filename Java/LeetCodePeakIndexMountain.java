public class LeetCodePeakIndexMountain {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,7,6,5,3,2};
        int ans = peak(arr);
        System.out.println(ans);
    }

    static int peak(int[] arr){
        int start=0;
        int end =arr.length-1;

        while (start<end) {
            int mid = start +(end-start)/2;
            if (arr[mid]<arr[mid+1]) {
                start=mid+1;
            }else{
                end=mid;
            }
        }

        return start;
    }
}
