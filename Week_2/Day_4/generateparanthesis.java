class Solution {
    public List<String> generateParenthesis(int t) {
        List<String> result = new ArrayList<>();
        backtrack(result, "", 0, 0, t);
        return result;
    }

    private void backtrack(List<String> result, String current,
                           int open, int close, int t) {

        if (current.length() == 2 * t) {
            result.add(current);
            return;
        }

        if (open < t) {
            backtrack(result, current + "(", open + 1, close, t);
        }

        if (close < open) {
            backtrack(result, current + ")", open, close + 1, t);
        }
                           }
}
    
