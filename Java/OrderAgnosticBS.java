public class OrderAgnosticBS {
    public static void main(String[] args) {
        // int[] arr={-9,-2,-1,0,1,34,45,67,89};

        int[] arr={99,87,76,65,54,43,32,21,0,-1,-2};

        int target = -2;

        int ans = search(arr,target);
        System.out.println(ans);
    }

    static int search(int[] arr,int target){
        int start=0;
        int end = arr.length-1;

        boolean isAsc = arr[start]<arr[end];

        while (start<=end) {
            int mid = start + (end-start)/2;
            if (arr[mid]==target) {
                return mid;
            }
            if (isAsc) {
                if (target>arr[mid]) {
                    start=mid+1;
                }else{
                    end=mid-1;
                }
            }else{
                if (target<arr[mid]) {
                    start=mid+1;
                }else{
                    end=mid-1;
                }

            }
        }

        return -1;
    }
}
