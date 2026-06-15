class Solution {
    public String reverseWords(String s) {
        String[] w1 = s.split(" ");
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < w1.length; i++) {
            StringBuilder word = new StringBuilder(w1[i]);
            result.append(word.reverse());

            if (i < w1.length - 1) {
                result.append(" ");
            }
        }

        return result.toString();
    }
}
