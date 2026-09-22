class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> counterSet = new HashSet<>();

        for (int x : nums) {
           if (!counterSet.add(x)) {
                return true;
            }
        }
        
        return false;
    }
}