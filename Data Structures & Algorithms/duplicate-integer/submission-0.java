class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> counterSet = new HashSet<>();

        for (int x : nums) {
            counterSet.add(x);
        }
        
        return counterSet.size() < nums.length;
    }
}