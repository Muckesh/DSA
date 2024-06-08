public class GoogleSplitArrayLargestSum {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int m = 1;
        int ans =result(arr,m);
        System.out.println(ans);
    }

    static int result(int[] arr,int m){
        int start =0;
        int end=0;
        for (int i = 0; i < arr.length; i++) {
            start = Math.max(start, arr[i]);
            end+=arr[i];
        }

        while (start<end) {

            int mid = start+(end-start)/2;

            int pieces = 1;
            int sum=0;

            for (int num : arr) {
                if (sum+num > mid) {
                    sum=num;
                    pieces++;
                }else{
                    sum+=num;
                }
            }

            // if (pieces<=m) {
            //     end=mid;
            // }else{
            //     start=mid+1;
            // }

            if(pieces>m)
            start=mid+1;
            else
            end=mid;

            
        }
        return start;
    }
}
