class Solution {
    public int firstUniqChar(String w) {
        int[] count = new int[26];

        
        for (int i = 0; i < w.length(); i++) {
            count[w.charAt(i) - 'a']++;
        }

        
        for (int i = 0; i < w.length(); i++) {
            if (count[w.charAt(i) - 'a'] == 1) {
                return i;
            }
        }

        return -1;
    }
}
