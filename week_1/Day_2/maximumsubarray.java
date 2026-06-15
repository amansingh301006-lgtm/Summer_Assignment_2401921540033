class Solution {
    public int maxSubArray(int[] num) {
        int currentSum = num[0];
        int maxSum = num[0];

        for (int i = 1; i < num.length; i++) {
            currentSum = Math.max(num[i], currentSum + num[i]);
            maxSum = Math.max(maxSum, currentSum);
        }

        return maxSum;
    }
}
