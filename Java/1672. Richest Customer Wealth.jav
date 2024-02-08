// https://leetcode.com/problems/richest-customer-wealth/description/
// Solution 1

class Solution {
    public int maximumWealth(int[][] accounts) {
        int ans = Integer.MIN_VALUE;
        for (int person = 0; person < accounts.length; person++) {
            int sum = 0;
            for (int account = 0; account < accounts[person].length; account++) {
                sum = sum + accounts[person][account];
            }
            if (ans < sum) {
                ans = sum;
            }
        }
        return ans;
    }
}

// Solution 2

class Solution {
    public int maximumWealth(int[][] accounts) {
        int ans = Integer.MIN_VALUE;
        for (int[] person : accounts) {
            int sum = 0;
            for (int account : person) {
                sum += account;
            }
            if (ans < sum) {
                ans = sum;
            }
        }
        return ans;
    }
}
