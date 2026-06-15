class Solution {
    public List<Integer> findAnagrams(String w, String p) {
        List<Integer> result = new ArrayList<>();

        if (w.length() < p.length()) {
            return result;
        }

        int[] pCount = new int[26];
        int[] wCount = new int[26];

        for (int i = 0; i < p.length(); i++) {
            pCount[p.charAt(i) - 'a']++;
            wCount[w.charAt(i) - 'a']++;
        }

        if (Arrays.equals(pCount, wCount)) {
            result.add(0);
        }

        for (int i = p.length(); i < w.length(); i++) {
            wCount[w.charAt(i) - 'a']++;
            wCount[w.charAt(i - p.length()) - 'a']--;

            if (Arrays.equals(pCount, wCount)) {
                result.add(i - p.length() + 1);
            }
        }
        return result;

    }
}
