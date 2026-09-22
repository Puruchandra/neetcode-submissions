class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> indicesMap = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            indicesMap.put(nums[i], i);
        }

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (indicesMap.containsKey(complement)) {
                int j = indicesMap.get(complement);
                if (i != j) {
                    return new int[]{i, j};
                }
            }
        }

        throw new IllegalArgumentException("No two sum solution");
    }
}
