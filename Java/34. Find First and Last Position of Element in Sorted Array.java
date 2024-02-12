// https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/description/

// Solution 1 - brut force
class Solution {
    public int[] searchRange(int[] nums, int target) {
        if (nums.length == 0) {
            return new int[] {-1,-1};
        }

        int i1 = -1, i2 = -1;
        for (int i = 0; i < nums.length; i++) {
            if (target == nums[i]) {
                i1 = i;
                break;
            }
        }
        for (int j = nums.length - 1; j >= 0; j--) {
            if ( target == nums[j]) {
                i2 = j;
                break;
            }
        }
        return new int[]{i1,i2};
    }
}

// Solution 2 - 

package LeetCode;

import java.util.Arrays;

public class FirstLastIndex {
    public static void main(String[] args) {
        int[] arr = {1,2,2,3,3,3,4,4,4,4,5,5,5,5,5};
        int target = 4;
        int[] ans = searchRange(arr,target);
        System.out.print(Arrays.toString(ans));
    }

    static int[] searchRange(int[] arr, int target) {
        int[] ans = {-1,-1};

        ans[0] = search(arr, target, true);
        if (ans[0] != -1) {
            ans[1] = search(arr, target, false);
        }

        return ans;
    }

    static int search(int[] arr, int target, boolean startIndex) {
        int ans = -1;
        int start = 0;
        int end = arr.length - 1 ;
        while (start <= end) {
            int middle = (start + end) / 2; // start + (end - start) / 2

            if (target < arr[middle]) {
                end = middle - 1;
            } else if (target > arr[middle]) {
                start = middle + 1;
            } else {
                // potential answer found
                ans = middle;

                if(startIndex) {
                    end = middle - 1;
                } else {
                    start = middle + 1;
                }
            }
        }
        return ans;
    }
}
