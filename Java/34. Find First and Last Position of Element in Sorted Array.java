// https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/description/

// Solution 1
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
