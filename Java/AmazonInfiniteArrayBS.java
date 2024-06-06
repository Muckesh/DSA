public class AmazonInfiniteArrayBS {
    public static void main(String[] args) {
        // Assume infinite length array
        int[] arr = {2,3,5,7,8,21,34,54,65,77,89,99,100,101,200};
        int target = 3;
        int result = search(arr,target);
        System.out.println(result); 
    }

    static int search(int[] arr,int target){
        int start=0;
        int end=1;

        while (target>arr[end]) {
            int newStart = end+1;
            // (end-start+1) --> window size or box size or sub array size
            end = end + (end-start+1)*2;
            start = newStart;
        }

        return binarySearch(arr,target,start,end);
    }

    static int binarySearch(int[] arr,int target,int start,int end){
        while (start<=end) {
            int mid = start + (end-start)/2;
            if (target==arr[mid]) {
                return mid;
            }else if (target<arr[mid]) {
                end=mid-1;
            }else{
                start=mid+1;
            }
        }

        return -1;
    }
}
