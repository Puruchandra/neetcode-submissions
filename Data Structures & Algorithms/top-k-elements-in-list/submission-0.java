class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> frequencyTree = new HashMap<>();
        for (int num : nums) {
            frequencyTree.put(num, frequencyTree.getOrDefault(num, 0) + 1);
        }
        
        List<int[]> arr = new ArrayList<>();

        for (Map.Entry<Integer, Integer> entry : frequencyTree.entrySet()) {
            arr.add(new int[] { entry.getValue(), entry.getKey() });
        }
        arr.sort((a, b) -> b[0] - a[0]);

        int[] topKFreq = new int[k];

        for (int i = 0; i < k; i++) {
            topKFreq[i] = arr.get(i)[1];
        }



        return topKFreq; 
    }
}
