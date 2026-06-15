class Solution {
    public boolean repeatedSubstringPattern(String w) {
        String doubled = w + w;
        return doubled.substring(1, doubled.length() - 1).contains(w);
    }
}
