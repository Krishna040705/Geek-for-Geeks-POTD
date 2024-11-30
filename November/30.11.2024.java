class Solution {
    // Function is to check whether two strings are anagram of each other or not.
    public static boolean areAnagrams(String s1, String s2) {
        // Your code here
        int arr[] = new int[26];
        if(s1.length() != s2.length())
            return false;
            
        for(int i=0; i<s1.length(); i++) {
            arr[s1.charAt(i) - 'a']++;
            arr[s2.charAt(i) - 'a']--;
        }
        
        for(int i=0; i<26; i++) {
            if(arr[i] != 0)
                return false;
        }
        return true;
    }
}
