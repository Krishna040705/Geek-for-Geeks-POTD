class Solution {
    public int countSubarrays(int arr[], int k) {
        HashMap<Integer,Integer> hmap=new HashMap<>();
        int count=0,curr_sum=0;
        for(int i=0;i<arr.length;i++){
            curr_sum+=arr[i];
            if(curr_sum==k){
                count++;
            }
            if(hmap.containsKey(curr_sum-k)){
                count+=hmap.get(curr_sum-k);
            }
            hmap.put(curr_sum,hmap.getOrDefault(curr_sum,0)+1);
        }
        return count;
    }
}
