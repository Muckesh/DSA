public class LCRBSPivotDuplicates {
    public static void main(String[] args) {
        int[] arr = {2,2,2,2,9,10,10,10,1,1,1,2,2,2};

        int pivot = pivotDuplicates(arr);
        System.out.println(pivot);
    }

    static int pivotDuplicates(int[] arr){
        int start = 0;
        int end = arr.length-1;
        while (start<=end) {
            int mid=start+(end-start)/2;
            if (arr[mid]>arr[mid+1]) {
                return mid;
            }
            if (arr[mid]<arr[mid-1]) {
                return mid-1;
            }

            // Duplicates {2,2,2,9,2,2,2}
            if (arr[start]==arr[mid] && arr[mid]==arr[end]) {
                if (arr[start]>arr[start+1]) {
                    return start;
                }
                start++;

                if (arr[end]<arr[end-1]) {
                    return end-1;
                }

                end--;
            }

            // left side sorted pivot -> right side

            else if (arr[start]<arr[mid] || (arr[start]==arr[mid] && arr[mid]>arr[end])) {
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return -1;
    }
}
