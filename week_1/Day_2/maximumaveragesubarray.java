class Solution {
    public double findMaxAverage(int[] nums, int m) {
         long windowSum = 0;

        
        for (int i = 0; i < m; i++) {
            windowSum = windowSum+nums[i];
        }

        long maxSum = windowSum;

    
        for (int i = m; i < nums.length; i++) {
            windowSum = windowSum+nums[i] - nums[i - m];
            maxSum = Math.max(maxSum, windowSum);
        }

        return (double) maxSum / m;
    }
}
