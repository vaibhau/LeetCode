// https://leetcode.com/problems/find-numbers-with-even-number-of-digits/description/

class Solution {
    public int findNumbers(int[] nums) {
        int count = 0;
        for(int i : nums) {
            if (even(i)) {
                count++;
            }
        }
        return count;
    }

    public boolean even(int num) {
        int numberDigits = digits(num);
        if (numberDigits % 2 == 0) {
            return true;
        }
        return false;
    }

    public int digits(int num){
        if (num < 0) {
            num = num * -1;
        }
        if (num == 0) {
            return 1;
        }
        int count = 0;
        while(num > 0) {
            count ++;
            num /= 10;
        }
        return count;
    }
}
