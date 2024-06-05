public class CeilingNumber {
    public static void main(String[] args) {
        int arr[] = {1,3,5,9,14,16,18};
        int target = 20;
        int ans = ceiling(arr,target);
        System.out.println(ans);
    }

    static int ceiling(int[] arr,int target){
        int start =0;
        int end=arr.length-1;
        while (start<=end) {
            int mid = start + (end-start)/2;
            if (arr[mid]==target) {
                return arr[mid];
            }else if (target>arr[mid]) {
                start=mid+1;
            }else{
                end=mid-1;
            }
        }
        if (start<=arr.length-1) {
            return arr[start];
        }
        return -1;
    }
}
