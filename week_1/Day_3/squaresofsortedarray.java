class Solution {
    public int[] sortedSquares(int[] nums) {
         int n = nums.length;
        int[] arr = new int[n];

        int l = 0;
        int r = n - 1;
        int pos = n - 1;

        while (l <= r) {
            int lSquare = nums[l] * nums[l];
            int rSquare = nums[r] * nums[r];

            if (lSquare > rSquare) {
                arr[pos] = lSquare;
                l++;
            } else {
                arr[pos] = rSquare;
                r--;
            }
            pos--;
        }

        return arr;
    }
}
