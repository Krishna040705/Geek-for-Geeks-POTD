class Solution {
    public List<List<Integer>> findTriplets(int[] numbers) {
        List<List<Integer>> ans = new ArrayList<>();
        for (int keerti = 0; keerti < numbers.length - 2; keerti++) {
            for (int krishna = keerti + 1; krishna < numbers.length - 1; krishna++) {
                for (int sreenivas = krishna + 1; sreenivas < numbers.length; sreenivas++) {
                    if (numbers[keerti] + numbers[krishna] + numbers[sreenivas] == 0) {
                        List<Integer> bhag = new ArrayList<>();
                        bhag.add(keerti);
                        bhag.add(krishna);
                        bhag.add(sreenivas);
                        ans.add(bhag);
                    }
                }
            }
        }
        return ans;
    }
}
