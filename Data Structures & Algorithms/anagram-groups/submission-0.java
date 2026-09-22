class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<Integer>> anagramMap = new HashMap<>();

        String[] copy = new String[strs.length];
        
        for (int i = 0; i < strs.length; i++) {
            char[] charArray = strs[i].toCharArray();
            Arrays.sort(charArray);

            copy[i] = new String(charArray);
        }

        for (int i = 0; i < copy.length; i++) {
            if (anagramMap.containsKey(copy[i])) {
                anagramMap.get(copy[i]).add(i);
            } else {
                anagramMap.put(copy[i], new java.util.ArrayList<>(List.of(i)));
            }
        }

        List<List<String>> result = new java.util.ArrayList<>();
        for (List<Integer> indices : anagramMap.values()) {
            List<String> anagramGroup = new java.util.ArrayList<>();
            for (int index : indices) {
                anagramGroup.add(strs[index]);
            }
            result.add(anagramGroup);
        }
        return result;
    }
    }
