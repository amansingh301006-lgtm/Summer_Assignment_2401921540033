class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int t = nums.length;
        int[] result = new int[t - k + 1];
        
        Deque<Integer> deque = new LinkedList<>();
        int idx = 0;

        for (int i = 0; i < t; i++) {

            
            while (!deque.isEmpty() && deque.peekFirst() <= i - k) {
                deque.pollFirst();
            }

            
            while (!deque.isEmpty() && nums[deque.peekLast()] < nums[i]) {
                deque.pollLast();
            }

    
            deque.offerLast(i);

            
            if (i >= k - 1) {
                result[idx++] = nums[deque.peekFirst()];
            }
        }
return result;
    }
}
