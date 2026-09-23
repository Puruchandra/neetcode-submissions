class Solution {
    public boolean isPalindrome(String s) {
     String filtered = s.replaceAll("\\s+", "").replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        int left = 0;
        int right = filtered.length() - 1;
        
        char[] charArray = filtered.toCharArray();

        while (left < right) {
            if (charArray[left] != charArray[right]) {
                return false;
            }

            left++;
            right--;
        }

        
        return true;   
    }
}
