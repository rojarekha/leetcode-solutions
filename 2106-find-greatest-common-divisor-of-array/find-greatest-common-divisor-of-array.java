class Solution {
    public int findGCD(int[] nums) {
        int min = nums[0];
        int max = nums[0];

        // Find minimum and maximum
        for (int num : nums) {
            if (num < min) {
                min = num;
            }
            if (num > max) {
                max = num;
            }
        }

        // Find GCD of min and max
        while (max % min != 0) {
            int temp = max % min;
            max = min;
            min = temp;
        }

        return min;
    }
}