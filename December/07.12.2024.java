class Solution {
    static int countInversions(int[] nums) {
        int len = nums.length;
        int[] sortedNums = nums.clone();
        Arrays.sort(sortedNums);
        Map<Integer, Integer> indexMap = new HashMap<>();

        for (int i = 0; i < len; i++) {
            indexMap.put(sortedNums[i], i + 1);
        }

        int[] fenwickTree = new int[len + 1];
        int inversions = 0;

        for (int i = len - 1; i >= 0; i--) {
            inversions += query(fenwickTree, indexMap.get(nums[i]) - 1);
            update(fenwickTree, indexMap.get(nums[i]), 1, len);
        }

        return inversions;
    }

    private static void update(int[] tree, int idx, int val, int size) {
        while (idx <= size) {
            tree[idx] += val;
            idx += idx & -idx;
        }
    }

    private static int query(int[] tree, int idx) {
        int result = 0;
        while (idx > 0) {
            result += tree[idx];
            idx -= idx & -idx;
        }
        return result;
    }
}
