class Solution {
    public boolean isAnagram(String s, String t) {
        // array count for each character
        int count[] = new int[26];
        if (s.length() != t.length()) return false;

        // for each character in string, convert to int (a = 0) and count (up for string s, down for string t)
        for (int i = 0; i < s.length(); i++) {
            count[s.charAt(i) - 'a']++;
            count[t.charAt(i) - 'a']--;
        }

        // check if array is all zeroes
        for (int i = 0; i < 26; i++) {
            if (count[i] != 0) return false;
        }   
        return true;
    }
}
