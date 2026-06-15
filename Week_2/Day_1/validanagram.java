class Solution {
    public boolean isAnagram(String m, String p) {
        if (m.length() != p.length()) {
            return false;
        }

        int[] count = new int[26];

        for (int i = 0; i < m.length(); i++) {
            count[m.charAt(i) - 'a']++;
            count[p.charAt(i) - 'a']--;
        }

        for (int c : count) {
            if (c != 0) {
                return false;
            }
        }

        return true;
    }
}
