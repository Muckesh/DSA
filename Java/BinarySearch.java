public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {-109,2,3,8,99,100,101,109,200};
        int target = -109;
        int ans = search(arr,target);
        System.out.println(ans);
    }

    static int search(int[] arr,int target){

        int start = 0;
        int end = arr.length-1;
        // // int mid = (start+end)/2;
        // int mid = start + (end-start)/2;
        // System.out.println(mid);
        // start <= end
        while (start<=end) {
            // int mid=(start+end)/2;
            int mid = start + (end-start)/2;
            if (arr[mid]==target) {
                return mid;
            }
            else if (arr[mid]>target) {
                end=mid-1;
            }
            else{
                start=mid+1;
            }
            
        }


        return -1;
    }
}
