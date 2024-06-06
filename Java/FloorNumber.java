public class FloorNumber {
    public static void main(String[] args) {
        int[] arr = {2,3,5,9,14,16,18};
        int target = -89;
        int floor = floorNo(arr,target);
        System.out.println(floor);
    }

    static int floorNo(int[] arr,int target){
        int start=0;
        int end = arr.length-1;

        if (target<arr[start]) {
            return -1;
        }

        while (start<=end) {
            int mid = start + (end-start)/2;
            if (target==arr[mid]) {
                return arr[mid];
            }else if (target>arr[mid]) {
                start=mid+1;
            }else{
                end=mid-1;
            }
        }
         // return -1

        //  if (end<0) {
        //     return -1;
        //  }

            // floor
            return arr[end];
    }
}
