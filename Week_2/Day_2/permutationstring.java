class Solution {
    public boolean checkInclusion(String u, String v) {
       int len1 = u.length();
        int len2 = v.length();
        
        
        if (len1 > len2) {
            return false;
        }
        
        int[] uCount = new int[26];
        int[] vCount = new int[26];
        
        
        for (int i = 0; i < len1; i++) {
            uCount[u.charAt(i) - 'a']++;
            vCount[v.charAt(i) - 'a']++;
        }
        
    
        for (int i = 0; i < len2 - len1; i++) {
            if (matches(uCount, vCount)) {
                return true;
            }
            
            vCount[v.charAt(i + len1) - 'a']++;
            vCount[v.charAt(i) - 'a']--;
        }
        
        
        return matches(uCount, vCount);
    }

    private boolean matches(int[] uCount, int[] vCount) {
        for (int i = 0; i < 26; i++) {
            if (uCount[i] != vCount[i]) {
                return false;
            }
        }
        return true;
       
            }
    }
    
