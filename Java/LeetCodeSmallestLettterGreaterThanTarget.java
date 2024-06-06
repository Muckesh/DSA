public class LeetCodeSmallestLettterGreaterThanTarget {
    public static void main(String[] args) {
        char[] arr = {'c','f','j'};
        // letters wrap around
        // eg. letters = ['a','b']
        // target = z
        // ans = a;
        // similar to ceiling of a number

        char target = 'f';
        char ans = result(arr,target);
        System.out.println(ans);
    }

    static char result(char[] arr,char target){
        int start = 0;
        int end = arr.length-1;
        // if (target>=arr[end]) {
        //     return arr[start];
        // }

        while (start<=end) {

            int mid = start +(end-start)/2;
            // if (target==arr[mid]) {
            //     return arr[mid];
            // }
            //  if (target>arr[mid]) {
            //     start=mid+1;
            // }else if(target<arr[mid]){
            //     end=mid-1;
            // }
            if (target<arr[mid]) {
                end=mid-1;
            }
            // for both target == and > condn
            else{
                start=mid+1;
            }

        }

        // return arr[start];

        return arr[start%arr.length];

    }
}
