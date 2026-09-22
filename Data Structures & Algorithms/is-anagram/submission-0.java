class Solution {
    public boolean isAnagram(String s, String t) {

        char[] sCharArray = s.toCharArray();
        char[] tCharArray = t.toCharArray();

        Arrays.sort(sCharArray);
        Arrays.sort(tCharArray);

        String sSortedStr = new String(sCharArray);
        String tSortedStr = new String(tCharArray);

        return sSortedStr.equals(tSortedStr);
        
    }
}
