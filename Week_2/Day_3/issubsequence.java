class Solution {
    public boolean isSubsequence(String u, String v) {
        int i = 0; 
        int j = 0; 

        while (i < u.length() && j < v.length()) {
            if (u.charAt(i) == v.charAt(j)) {
                i++;
            }
            j++;
        }

        return i == u.length();
    }
}
