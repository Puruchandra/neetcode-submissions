class Solution {
    public int longestConsecutive(int[] nums) {
      SortedSet<Integer> numSet = new java.util.TreeSet<>();
        // 2,3,4,5,10,20
        for (int num : nums) {
            numSet.add(num);
        }

        Integer[] numArr = numSet.toArray(new Integer[0]);

        int longestStreak = 0;
        int currentStreak = 1;
        int j = 1;
        for (int i = 0; i < numArr.length; i++) {
            if (j >= numArr.length) {
                longestStreak = Math.max(longestStreak, currentStreak);
                break;
                // safe return
            }
            if (numArr[j] - numArr[i] == 1) {
                currentStreak++;
                j++;
            }
            else {
                longestStreak = Math.max(longestStreak,currentStreak);
                currentStreak = 1;
                j++;
            }
        }
        return longestStreak;
    }
}
