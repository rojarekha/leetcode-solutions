class Solution {
    public double findMaxAverage(int[] nums, int k) {

        int n = nums.length;

        int l = 0;
        int temp = 0;

        double ans = Double.NEGATIVE_INFINITY;

        for (int r = 0; r < nums.length; r++) {

            temp += nums[r];

            if (r - l + 1 > k) {
                temp -= nums[l];
                l++;
            }

            if (r - l + 1 == k) {
                ans = Math.max(ans, (double) temp / k);
            }
        }

        return ans;
    }
}