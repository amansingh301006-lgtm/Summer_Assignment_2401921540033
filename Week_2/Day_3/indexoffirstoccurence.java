class Solution {
    public int strStr(String haystack, String needle) {
        int l1 = haystack.length();
        int l2 = needle.length();

        for (int i = 0; i <= l1 - l2; i++) {
            int j = 0;

            while (j < l2 && haystack.charAt(i + j) == needle.charAt(j)) {
                j++;
            }

            if (j == l2) {
                return i;
            }
        }

        return -1;
    }
}
