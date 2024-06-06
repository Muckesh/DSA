// https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/description/

import java.util.Arrays;

public class LeetCodeFirstAndLast {
    public static void main(String[] args) {
        int[] arr = {5,6,7,7,8,8,8,8,8,8,10};
        int target = 8;
        int[] ans = search(arr, target);
        System.out.println(Arrays.toString(ans));
    
    }

    static int[] search(int[] arr, int target){
        int[] ans = {-1,-1};
    
        ans[0]=findIndex(arr,target,true);
        if (ans[0]!=-1) {
            ans[1]=findIndex(arr,target,false);

        }
        return ans;

    }

    static int findIndex(int[] arr,int target,boolean isStart){
        int start =0;
        int end=arr.length-1;
        int ans=-1;

        while (start<=end) {
            int mid=start+(end-start)/2;
            if (target<arr[mid]) {
                end=mid-1;
            }else if (target>arr[mid]) {
                start=mid+1;
            }else{
                ans=mid;
                if (isStart) {
                    end=mid-1;
                }else{
                    start=mid+1;
                }
            }
        }
        return ans;
    }
}
