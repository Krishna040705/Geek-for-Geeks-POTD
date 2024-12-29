class Solution {
    public ArrayList<Integer> findCommonElementsWithDuplicates(int[] array1, int[] array2) {
        ArrayList<Integer> result = new ArrayList<>();
        HashMap<Integer, Integer> elementMap = new HashMap<>();

        for (int i = 0; i < array1.length; i++) {
            if (!elementMap.containsKey(array1[i])) {
                elementMap.put(array1[i], i);
            }
        }

        for (int i = 0; i < array2.length; i++) {
            if (elementMap.containsKey(array2[i])) {
                if (!result.contains(array2[i])) result.add(array2[i]);
            }
        }

        return result;
    }
}
