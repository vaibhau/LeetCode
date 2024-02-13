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

// Solution 2 - optimized

class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while(start < end) {
            int middle = start + (end - start) / 2;
            if(arr[middle] > arr[middle + 1]) {
                end = middle;
            } else {
                start = middle + 1;
            }
        }
        return start;
    }
}
