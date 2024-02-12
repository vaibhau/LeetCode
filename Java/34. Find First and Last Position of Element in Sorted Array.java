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

class Solution {
    public int[] searchRange(int[] nums, int target) {
        if (nums.length == 0) {
            return new int[] {-1,-1};
        }

        int[] ans = {-1,-1};
        ans[0] = search(nums, target, true);
        if (ans[0] != -1)
            ans[1] = search(nums, target, false);
        return ans;
    }

    public int search(int[] nums, int target, boolean startIndex) {
        int ans = -1;
        int start = 0;
        int end = nums.length -1;
        while (start <= end) {
            int middle = start + (end - start) / 2;
            if (target < nums[middle]) {
                end = middle - 1;
            } else if(target > nums[middle]) {
                start = middle + 1;
            } else {
                // potential answer found
                ans = middle;
                if (startIndex) {
                    end = middle - 1;
                } else {
                    start = middle + 1;
                }
            }
        }
        return ans;
    }
}
