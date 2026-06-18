class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int s = temperatures.length;
        int[] answer = new int[s];
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < s; i++) {
            while (!stack.isEmpty() && temperatures[i] > temperatures[stack.peek()]) {
                int prevIndex = stack.pop();
                answer[prevIndex] = i - prevIndex;
            }
            stack.push(i);
        }

        return answer;
    }
}
