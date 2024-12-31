class Solution {

      public int longestConsecutive(int[] arr) {
        // code here
        int max = 0;
        for(int num : arr) max = Math.max(max, num);
        int arr1[] = new int[max + 1];
        for(int num : arr){
            arr1[num] = 1;
        }
        int cnt = 0, maxc = 0;
        for(int num : arr1){
            if(num == 1){
                cnt++;
            }else{
                cnt = 0;
            }
            maxc = Math.max(maxc, cnt);
        }
        // TC = O(n) SC = O(n)
        return maxc;
    }
}
