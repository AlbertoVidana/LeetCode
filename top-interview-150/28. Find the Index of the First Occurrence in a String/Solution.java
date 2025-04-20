class Solution {
    public int strStr(String haystack, String needle) {
      
        for (int i = needle.length(); i <= haystack.length(); i++) {
            if (needle.equals(haystack.substring(i-needle.length(), i))) {
                return (i - needle.length());
            }
        }
        return -1;
    }
}