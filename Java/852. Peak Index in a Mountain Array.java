// https://leetcode.com/problems/peak-index-in-a-mountain-array/description/

// Solution 1 - Linear search

class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        if (arr.length == 0) {
            return -1;
        }
        int max = arr[0];
        int ii = 0;
        for (int i=1; i<arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
                ii = i;
            }
        }
        return ii;
    }
}
