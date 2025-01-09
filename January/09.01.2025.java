class Solution {
    static ArrayList<Integer> subarraySum(int[] arr, int target) {
        // code here
        ArrayList<Integer> list = new ArrayList<>();
        int i=0, j=0;
        int sum=0;
        int n = arr.length;
        int flag = 0;
        while(j<n){
            while(sum < target && j<n){
                sum += arr[j];
                j++;
            }
            if(sum == target) {
                list.add(i+1);
                list.add(j);
                flag = 1;
                return list;
            }
            while(sum > target && i <= j){
                sum -= arr[i];
                i++;
            }
            
        }
        if(sum == target){
            list.add(i+1);
            list.add(j);
        }
        else list.add(-1);
        return list;
    }
}
