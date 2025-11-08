class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] count = new int[26]; // for 'a' to 'z'
        
        // count letters in magazine
        for (char c : magazine.toCharArray()) {
            count[c - 'a']++;
        }
        
        // check if ransomNote can be made
        for (char c : ransomNote.toCharArray()) {
            if (count[c - 'a'] == 0) return false; // not enough letters
            count[c - 'a']--;
        }
        
        return true;
    }
}
