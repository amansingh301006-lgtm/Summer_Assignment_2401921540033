class Solution {
    public int maxArea(int[] height) {
         int lower = 0;
        int upper = height.length - 1;
        int maxWater = 0;

        while (lower < upper) {
            int width = upper - lower;
            int h = Math.min(height[lower], height[upper]);

            maxWater = Math.max(maxWater, width * h);

            if (height[lower] < height[upper]) {
                lower++;
            } else {
                upper--;
            }
        }

        return maxWater;
    }
}
